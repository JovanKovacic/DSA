import java.util.ArrayList;

public class UsmerenGraf {

	int[][] matricaPovezanosti;
	ArrayList<Cvor> cvorovi = new ArrayList<>();
	
	public UsmerenGraf(int size) {
		matricaPovezanosti = new int[size][size];
	}
	
	public void dodajCvor(Cvor a) {
		cvorovi.add(a);
	}
	
	public void dodajGranu(int a, int b) {
		matricaPovezanosti[a][b] = 1;
	}
	
	public boolean proveriGranu(int a, int b) {
		
		if(matricaPovezanosti[a][b] == 1) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public void print() {
		
		System.out.print("   ");
		for(Cvor c : cvorovi) {
			System.out.print(c.data + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < matricaPovezanosti.length; i++) {
			
			System.out.print(cvorovi.get(i).data + " "); 
			
			for(int j = 0; j < matricaPovezanosti[i].length; j++) {
				
				System.out.print(matricaPovezanosti[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
		
	}
	
}
