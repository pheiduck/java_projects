package statischeAttribute;

public class StartklasseBMI {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Bmi philipBmi = new Bmi("Philip", 1.70, 57 );
		@SuppressWarnings("unused")
		Bmi hansBmi = new Bmi("Hans", 1.70, 90 );
		@SuppressWarnings("unused")
		Bmi michaelBmi = new Bmi("Michael", 1.90, 86 );
		@SuppressWarnings("unused")
		Bmi siegfriedBmi = new Bmi("Siegfried", 1.79, 79 );
		@SuppressWarnings("unused")
		Bmi beateBmi = new Bmi("Beate", 1.65, 60 );
		Bmi.showData();
	}

}
