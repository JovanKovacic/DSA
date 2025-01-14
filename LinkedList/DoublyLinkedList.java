
public class DoublyLinkedList {

	private DoublyNode head;
	private DoublyNode tail;
	
	public void dodajNaKraj(Student s) {
		
		DoublyNode novi = new DoublyNode(s);
		
		if(head == null) {
			head = tail = novi;
		} else {
			tail.sledeci = novi;
			novi.prethodni = tail;
			tail = novi;
		}
		
	}
	
	public void dodajNaPocetak(Student s) {
		
		DoublyNode novi = new DoublyNode(s);
		
		if(head == null) {
			head = tail = novi;
		} else {
			novi.sledeci = head;
			head.prethodni = novi;
			head = novi;
		}
		
	}
	
	public void dodajPosle(Student target, Student s) {
		
		DoublyNode novi = new DoublyNode(s);
		DoublyNode trenutni = head;
		DoublyNode temp;
		
		while(trenutni != null) {
			
			if(trenutni.student.equals(target)) {
				
				temp = trenutni.sledeci;
				trenutni.sledeci = novi;
				novi.prethodni = trenutni;
				
				if(temp == null) {
					tail = novi;
				} else {
					temp.prethodni = novi;
					novi.sledeci = temp;
				}
				break;
			}
			trenutni = trenutni.sledeci;
		}
	}
	
	public void stampajUnapred() {
		
		DoublyNode trenutni = head;
		
		while(trenutni != null) {
			System.out.println(trenutni.student);
			trenutni = trenutni.sledeci;
		}
		
	}
	
	public void stampajUnazad() {
		
		DoublyNode trenutni = tail;
		
		
		
		while(trenutni != null) {
			System.out.println(trenutni.student);
			trenutni = trenutni.prethodni;
		}
		
	}
	
	public DoublyNode getTail() {
		return tail;
	}
	
	public void obrisi(Student s) {
	    if (head == null) {
	        System.out.println("Lista je prazna.");
	        return;
	    }

	    DoublyNode trenutni = head;

	    while (trenutni != null) {
	        if (trenutni.student.equals(s)) {
	            if (trenutni == head) {
	                head = head.sledeci;
	                if (head != null) {
	                    head.prethodni = null;
	                }
	            } else if (trenutni == tail) {
	                tail = tail.prethodni;
	                if (tail != null) {
	                    tail.sledeci = null;
	                }
	            } else {
	                trenutni.prethodni.sledeci = trenutni.sledeci;
	                trenutni.sledeci.prethodni = trenutni.prethodni;
	            }
	            return;
	        }
	        trenutni = trenutni.sledeci;
	    }

	    System.out.println("Student nije pronađen u listi.");
	}
	
	public int velicina() {
	    int count = 0;
	    DoublyNode trenutni = head;
	    while (trenutni != null) {
	        count++;
	        trenutni = trenutni.sledeci;
	    }
	    return count;
	}
	
	public Student pronadji(int indeks) {
	    int count = 0;
	    DoublyNode trenutni = head;

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
	    tail = null;
	    System.out.println("Lista je sada prazna.");
	}

	
}
