package statischeMethoden;

public class ZweiDoubleZahlen {

	public static void main(String[] args) {
		
		double summand1 = 3.45;
		double summand2 = 5.65;
		
		System.out.println("Die Summe der Zahl: " + summand1 + " und der Zahl: "+ summand2+ " lautet: "+ addition(summand1,summand2));
		}
		
		public static double addition(double pSummand1, double pSummand2) { double ergebnis =0;
		ergebnis = pSummand1 + pSummand2; return ergebnis;
		}
}

