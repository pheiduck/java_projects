package statischeAttribute;

import java.text.DecimalFormat;

public class Bmi {
		private String name;
		private double groesse;
		private double gewicht;
		private double bmi;
		private static int anzahl;
		private static double gesamtBmi;
		private static double avgBmi;
		
		public Bmi(String pName, double pGroesse, double pGewicht) {
			setName(pName);
			setGroesse(pGroesse);
			setGewicht(pGewicht);
			
			setBmi(berechneBMI(this.getGroesse(), this.getGewicht()));
			setAnzahl(1);
			setGesamtBmi(this.getBmi());
			setAvgBmi(berechneAvgBMI());
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

		public double getGroesse() {
			return groesse;
		}
		public void setGroesse(double groesse) {
			this.groesse = groesse;
		}

		public double getGewicht() {
			return gewicht;
		}
		public void setGewicht(double gewicht) {
			this.gewicht = gewicht;
		}

		public double getBmi() {
			return bmi;
		}
		public void setBmi(double bmi) {
			this.bmi = bmi;
		}

		public static int getAnzahl() {
			return anzahl;
		}
		public static void setAnzahl(int pAnzahl) {
			Bmi.anzahl = Bmi.anzahl + pAnzahl;
		}

		public static double getGesamtBmi() {
			return gesamtBmi;
		}
		public static void setGesamtBmi(double pBmi) {
			Bmi.gesamtBmi = Bmi.getGesamtBmi()+ pBmi;
		}

		public static double getAvgBmi() {
			return avgBmi;
		}
		public static void setAvgBmi(double avgBmi) {
			Bmi.avgBmi = avgBmi;
		}
		
		public double berechneBMI(double pGroesse, double pGewicht) {
			double bmi;
			bmi = pGewicht / (pGroesse * pGroesse);
			return bmi;
		}
		
		public static double berechneAvgBMI() {
			Bmi.setAvgBmi(Bmi.getGesamtBmi() / Bmi.getAnzahl());
			return Bmi.getAvgBmi();
		}
		
		public static void showData() {
			String ausgabe;
			DecimalFormat df = new DecimalFormat("##0.00");
			ausgabe = (df.format(getAvgBmi()));
			
			System.out.println("Anzahl Person: " + Bmi.getAnzahl() + "\n" +
		"Durchschnitts BMI: " + Bmi.getAvgBmi() + "\n" +
		"Durchschnitts BMI: " + ausgabe);
		}	
}
