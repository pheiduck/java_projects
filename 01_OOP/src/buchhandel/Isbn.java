package buchhandel;
import java.text.ParseException;

public class Isbn {
	
	public int[] isbnOhnePz;
	public int[] isbnGewicht;

	public Isbn(int [] pIsbnOhnePz, int [] pIsbnGewicht) {
		this.isbnOhnePz = pIsbnOhnePz;
		this.isbnGewicht = pIsbnGewicht;
	}

	//Statische Methode
	public String berechneISBNPruefziffer(String isbnMitPz) throws ParseException {
		String s;
		int pruefz;
		int summe = 0;
		for(int i=0; i<12; i++) {
		summe = summe + isbnOhnePz[i] * isbnGewicht[i];
		s = Integer.toString(isbnOhnePz[i]);
		isbnMitPz = isbnMitPz + s;
		}
		pruefz = 10 - (summe - summe / 10 * 10);
		s = Integer.toString(pruefz);
		isbnMitPz = isbnMitPz + s;
		return isbnMitPz;	
	} 	
}
