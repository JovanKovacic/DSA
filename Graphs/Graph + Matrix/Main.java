
public class Main {

	public static void main(String[] args) {
		
		int size = 5;
		UsmerenGraf graf = new UsmerenGraf(size);
		
		Cvor a = new Cvor('A');	//0
		graf.dodajCvor(a);
		Cvor b = new Cvor('B');	//1
		graf.dodajCvor(b);
		Cvor c = new Cvor('C');	//2
		graf.dodajCvor(c);
		Cvor d = new Cvor('D');	//3
		graf.dodajCvor(d);
		Cvor e = new Cvor('E');	//4
		graf.dodajCvor(e);
		
		graf.dodajGranu(0, 1);
		graf.dodajGranu(1, 2);
		graf.dodajGranu(1, 3);
		graf.dodajGranu(2, 0);
		graf.dodajGranu(2, 3);
		graf.dodajGranu(3, 2);
		graf.dodajGranu(3, 4);
		
		
		
		graf.print();
		System.out.println(graf.cvorovi);
		
	}
	
}
