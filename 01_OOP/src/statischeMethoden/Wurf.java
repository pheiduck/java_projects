package statischeMethoden;

public class Wurf {

	public static void main(String[] args) {
		int wurf = 0;
		int i = 0;
		int upperbound = 6;
		int lowerbound = 1;
		
		do {
			wurf = (int) (Math.floor(upperbound - lowerbound + 1) * Math.random() + lowerbound);
			i = i + 1;
			System.out.println(i + ". Wurf, die gewürfelte Zahl lautet: " + wurf);
			
			}while (wurf != 6); 
		}
	}
