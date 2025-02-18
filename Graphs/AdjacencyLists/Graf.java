import java.util.ArrayList;
import java.util.LinkedList;

public class Graf {

	ArrayList<LinkedList<Cvor>> alist;
	
	public Graf() {
		alist = new ArrayList<>();
	}
	
	public void dodajCvor(Cvor cvor) {
		LinkedList<Cvor> trenutnaLista = new LinkedList<>();
		trenutnaLista.add(cvor);
		alist.add(trenutnaLista); 
	}
	
	public void dodajGranu(int src, int dst) {
		LinkedList<Cvor> trenutnaLista = alist.get(src);
		Cvor dstCvor = alist.get(dst).get(0);
		trenutnaLista.add(dstCvor);
	}
	
	public boolean proveriGranu(int src, int dst) {
		LinkedList<Cvor> trenutnaLista = alist.get(src);
		Cvor dstCvor = alist.get(dst).get(0);
		
		for(Cvor c : trenutnaLista) {
			if(c == dstCvor) {
				return true;
			}
		}
		return false;
	}
	
	public void print() {
		
		for(LinkedList<Cvor> trenutna : alist) {
			for(Cvor c : trenutna) {
				System.out.print(c.data + "->");
			}
			System.out.println();
		}
		
	}
	
}
