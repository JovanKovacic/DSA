
public class Main {

	public static void main(String[] args) {
		
		int size = 6;
		Graf graf = new Graf(size);
		
		graf.dodajCvor(new Cvor('A'));
		graf.dodajCvor(new Cvor('B'));
		graf.dodajCvor(new Cvor('C'));
		graf.dodajCvor(new Cvor('D'));
		graf.dodajCvor(new Cvor('E'));
		graf.dodajCvor(new Cvor('F'));
		
		graf.dodajGranu(0, 1);
		graf.dodajGranu(0, 3);
		graf.dodajGranu(1, 2);
		graf.dodajGranu(3, 4);
		graf.dodajGranu(3, 5);
		
	
		graf.print();
		
		graf.dfs(0);
		
	}
	
}
