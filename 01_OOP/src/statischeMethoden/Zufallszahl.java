package statischeMethoden;

public class Zufallszahl {

	public static void main(String[] args) {
		int random = 0;
		int sum = 0;
		double avg = 0;
		int upperbound = 6;
		int lowerbound = 1;
		

			//System.out.println("Die Zufallszahl lautet: " + random);
			
			for(int i = 0; i < 99; i++) {
				random = (int) (Math.floor(upperbound - lowerbound + 1) * Math.random() + lowerbound);
				System.out.println(random);
				sum = sum + random;
			} 
			
				avg = sum / 100;
			
			System.out.println("Summe: " + avg);
	}

}
