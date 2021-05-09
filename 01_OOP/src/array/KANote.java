package array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class KANote {

	public static void main(String[] args) {
		int anzahl = 0;
		double summe = 0;
		
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("Anzahl Noten?");
		anzahl = eingabe.nextInt();
		int[] noten = new int[anzahl];
		
		for(int i = 0; i < anzahl; ++i) {
			System.out.println(i+1 + ". Note: ");
			noten[i] = eingabe.nextInt();
			summe = summe + noten[i];
		}
		DecimalFormat df = new DecimalFormat("##0.0");
		String ausgabe;
		ausgabe = (df.format(summe/anzahl));
		System.out.println("Durchschnitt: " + ausgabe + "\n"
		+ "Notenliste: ");
		
		for(int i = 0; i < anzahl; ++i) {
			System.out.println(noten[i]);
		}
	}

}
