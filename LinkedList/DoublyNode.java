
public class DoublyNode {

	Student student;
	DoublyNode prethodni;
	DoublyNode sledeci;
	
	public DoublyNode(Student student) {
		this.student = student;
		this.prethodni = null;
		this.sledeci = null;
	}
	
}
