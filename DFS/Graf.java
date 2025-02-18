import java.util.ArrayList;

public class Graf {

	int[][] matrica;
	ArrayList<Cvor> cvorovi;
	
	public Graf(int size) {
		matrica = new int[size][size];
		cvorovi = new ArrayList<>();
	}
	
	public void dodajCvor(Cvor cvor) {
		cvorovi.add(cvor);
	}
	
	public void dodajGranu(int src, int dst) {
		matrica[src][dst] = 1;
	}
	
	public boolean proveriGranu(int src, int dst) {
		
		if(matrica[src][dst] == 1) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public void print() {
		
		System.out.print("  ");
		
		for(Cvor c: cvorovi) {
			System.out.print(c.data + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < matrica.length; i++) {
			
			System.out.print(cvorovi.get(i).data + " ");
			
			for(int j = 0; j<matrica[i].length; j++) {
				
				System.out.print(matrica[i][j] + " ");
			}
			
			System.out.println();
			
		}
		
	}
	
	public void dfs(int start) {
		
		boolean[] poseta = new boolean[matrica.length];
		dfsHelp(start, poseta);
		
	}

	private void dfsHelp(int start, boolean[] poseta) {
		
		if(poseta[start]) {
			return;
		} else {
			poseta[start] = true;
			System.out.println(cvorovi.get(start).data + " je posecen");
		}
		
		for(int i = 0; i<matrica[start].length; i++) {
			
			if(matrica[start][i] == 1) {
				dfsHelp(i , poseta);
			}
		}
		return;
	}
	
}
