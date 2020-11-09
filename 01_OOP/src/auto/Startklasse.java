package auto;
public class Startklasse {
	
	
	public static void main(String[] args) {	
		Auto myAuto01 = new Auto("Mercedes", 'g', 156);
		myAuto01.showData();
		
		Auto myAuto02 = new Auto("Audi", 'r', 170);
		myAuto02.showData();
		
		System.out.println("Verbrauch auf 100km: " +
				myAuto01 .berechneVerbrauch(500, 40) + " Liter");
		System.out.println("Aktueller Restwert: " + 
				myAuto01.berechneRestwert(5, 10000, 10) + " Euro");
		System.out.println();
	}
}
