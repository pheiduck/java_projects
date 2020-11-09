package strings;

public class MyStrings {

	   public static void main(String[] args) {
		   
		     String[][] myNumbers = { {"A", "B", "C"}, {"D", "E", "F"} };
		     for (int i = 0; i < myNumbers.length; ++i) {
		        for(int j = 0; j < myNumbers[i].length; ++j) {
		           System.out.println(myNumbers[i][j]);
		        }
		     }
		   }
		}