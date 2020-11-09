package buchhandel;

import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class StartIsbn {

	public static void main(String[] args) throws ParseException {
		//ISBN Ohne Prüfziffer

		int [] isbnOhnePz  = {9,7,8,3,7,6,5,7,2,3,4,5};
		int [] isbnGewicht = {1,3,1,3,1,3,1,3,1,3,1,3};
		
		Isbn myIsbn = new Isbn(isbnOhnePz, isbnGewicht);
		String ISBN = myIsbn.berechneISBNPruefziffer("");
		
		MaskFormatter mf = new MaskFormatter( "***-*-****-****-*" );
		mf.setValueContainsLiteralCharacters( false );
		String Isbn = mf.valueToString(ISBN);
		
		System.out.println("Die ISBN mit Prüfziffer lautet: " + Isbn);
	}
}
