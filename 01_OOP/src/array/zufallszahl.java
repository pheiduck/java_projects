package array;

public class zufallszahl {
	
	public static void main(String[] args) {
		
		int grZahl;
		int []zahlen = new int[10];

		for(int i = 0; i < 10; ++i) {
			zahlen[i] = (int) (Math.random()*32000+1);
			System.out.println("Zahl: " + (i+1) + " lautet " + zahlen[i]);
		}
		grZahl = findeZahl(zahlen);
		System.out.println("Die größte Zahl lautet: " + grZahl);
	}
	
	public static int findeZahl(int zahlen[]) {
		int max = zahlen[0];
		int nri = 0;
		for(int i = 0; i < 10; ++i) {
				if(zahlen[i] > max) {
				max = zahlen[i];
				nri = i;
				}
		}
	return max;
	}	
}
