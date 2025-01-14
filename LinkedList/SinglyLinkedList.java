
public class SinglyLinkedList {

	SinglyNode head;
	
	public void dodaj(Student student) {
		
		SinglyNode noviCvor = new SinglyNode(student);
		
		if(head == null) {
			head = noviCvor;
		} else {
			
			SinglyNode trenutni = head;
			
			while(trenutni.sledeci != null) {
				trenutni = trenutni.sledeci;
			}
			
			trenutni.sledeci = noviCvor;
			
		}
		
	}
	
	public void stampaj() {
		
		if(head == null) {
			System.out.println("Lista je prazna!");
		} else {
			
			SinglyNode trenutni = head;
			
			while(trenutni != null) {
				System.out.println(trenutni.student);
				trenutni = trenutni.sledeci;
			}
			
		}
		
	}
	
	public void dodajIzmedju(Student s, int pozicija) {
		
		if (pozicija < 0) {
		    System.out.println("Pozicija ne moze biti negativna.");
		    return;
		}
		
		if (head == null && pozicija != 0) {
		    System.out.println("Losa pozicija, lista je prazna.");
		    return;
		}
		
		SinglyNode novi = new SinglyNode(s);
		
		if(pozicija == 0) {
			novi.sledeci = head;
			head = novi;
		}
		
		SinglyNode trenutni = head;
		
		for(int i=0; i<pozicija-1; i++) {
			if(trenutni == null) {
				System.out.println("Losa pozicija");
			}
			trenutni = trenutni.sledeci;
		}
		
		novi.sledeci = trenutni.sledeci;
		trenutni.sledeci = novi;
		
	}
	
	public void obrisi(int pozicija) {
	    if (head == null) {
	        System.out.println("Lista je prazna.");
	        return;
	    }

	    if (pozicija == 0) {
	        head = head.sledeci;
	        return;
	    }

	    SinglyNode trenutni = head;

	    for (int i = 0; i < pozicija - 1; i++) {
	        if (trenutni.sledeci == null) {
	            System.out.println("Losa pozicija.");
	            return;
	        }
	        trenutni = trenutni.sledeci;
	    }

	    if (trenutni.sledeci == null) {
	        System.out.println("Losa pozicija.");
	        return;
	    }

	    trenutni.sledeci = trenutni.sledeci.sledeci;
	}

	public int velicina() {
	    int count = 0;
	    SinglyNode trenutni = head;
	    while (trenutni != null) {
	        count++;
	        trenutni = trenutni.sledeci;
	    }
	    return count;
	}
	
	public Student pronadji(int indeks) {
	    int count = 0;
	    SinglyNode trenutni = head;

	    while (trenutni != null) {
	        if (count == indeks) {
	            return trenutni.student;
	        }
	        count++;
	        trenutni = trenutni.sledeci;
	    }

	    System.out.println("Nevalidan indeks.");
	    return null;
	}
	
	public void obrisiSve() {
	    head = null;
	    System.out.println("Lista je sada prazna.");
	}

	
}
