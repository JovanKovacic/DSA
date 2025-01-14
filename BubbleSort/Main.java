import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		int size = 10;
		int niz[] = new int[size];
		
		napuni(niz);
		
		System.out.print("Nesortiran niz: ");
		for(int i : niz) {
			System.out.print(i + ", ");
		}
		
		bubbleSort(niz);
		
		System.out.print("\nSortiran niz: ");
		for(int i : niz) {
			System.out.print(i + ", ");
		}
		
	}

	public static void napuni(int[] niz) {
		
		Random r = new Random();
		
		for(int i=0; i<niz.length; i++) {
			niz[i] = r.nextInt(-100, 100);
		}
		
		
	}
	
	public static void bubbleSort(int niz[]) {
		
		int temp;
		
		for(int i=0; i<niz.length-1; i++) {
			for(int j=0; j<niz.length - i -1; j++) {
				
				if(niz[j] > niz[j+1]) {
					temp = niz[j];
					niz[j] = niz[j+1];
					niz[j+1] = temp;
				}
				
			}
		}
		
	}

}
