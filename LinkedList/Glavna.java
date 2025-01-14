
public class Glavna {

	public static void main(String[] args) {
		
		Student s1 = new Student("Marko", "Markovic", 9.2);
		Student s2 = new Student("Aleksa", "Aleksic", 8.8);
		Student s3 = new Student("Stefan", "Lazic", 6.4);
		
		SinglyLinkedList lista = new SinglyLinkedList();
		lista.dodaj(s1); lista.dodaj(s2); lista.dodaj(s3);
		
		
		/*DoublyLinkedList duplaLista = new DoublyLinkedList();
		duplaLista.dodajNaKraj(s1);
		duplaLista.dodajNaKraj(s2);
		duplaLista.dodajNaKraj(s3);
		duplaLista.dodajNaPocetak(s3);
		
		duplaLista.stampajUnazad();*/
		
		System.out.println("test");
		
	}
	
}
