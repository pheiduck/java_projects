package strings;

public class StringDeklaration {

	public static void main(String[] args) {
		
		//String-Deklaration und Initalisierung mittels Objektrefernz und Kostruktor
		
		String myString01 = new String("String01"); 
		
		//String-Deklaration und Intialisierung adäquat zu primitiven Datentypen
		
		String myString02 = "String02";
		
		//Ausgabe
		System.out.println(myString01.toString());
		System.out.println(myString02.toString());
		System.out.println();
		System.out.println(myString01);
		System.out.println(myString02);
	}

}
