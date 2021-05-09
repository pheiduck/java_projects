package array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Körpergröße {

	public static void main(String[] args) {
		int anzahl = 5;
		double summe = 0;
		
		Scanner eingabe = new Scanner(System.in);
		
		double[] körpergröße = new double[anzahl];
		
		for(int i = 0; i < anzahl; ++i) {
			System.out.println(i+1 + ". Größe: ");
			körpergröße[i] = eingabe.nextDouble();
			summe = summe + körpergröße[i];
		}
		DecimalFormat df = new DecimalFormat("##0.0");
		String ausgabe;
		ausgabe = (df.format(summe/anzahl));
		System.out.println("Durchschnitt: " + ausgabe);	
	}
}
