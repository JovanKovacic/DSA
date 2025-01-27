import java.util.Random;

class SelectionSort {

	public static void main(String[] args) {
		
		int size = 10;
		int[] niz = new int[size];
		
		napuni(niz);
		
		System.out.print("Nesortiran niz:");
		
		for(int i : niz) {
			System.out.print(i + ", ");
		}
		
		selectionSort(niz);
		
		System.out.print("\nSortiran niz:");
		
		for(int i : niz) {
			System.out.print(i + ", ");
		}
		
	}
	
	static void napuni(int[] niz) {
		
		Random r = new Random();
		
		for(int i = 0; i < niz.length; i++) {
			niz[i] = r.nextInt(-100, 100);
		}
		
	}
	
	static void selectionSort(int[] niz) {
		
		int min;
		int temp;
		
		for(int i = 0; i < niz.length - 1; i++) {
			
			min = i;
			
			for(int j = i + 1; j < niz.length; j++) {
				if(niz[min] > niz[j]) {
					min = j;
				}
			}
			
			temp = niz[i];
			niz[i] = niz[min];
			niz[min] = temp;
			
		}
		
	}
	
}
