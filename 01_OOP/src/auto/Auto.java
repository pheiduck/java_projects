package auto;
public class Auto {
	public String marke;
	public char farbe;
	public int ps;
	
	public Auto(String pMarke, char pFarbe, int pPS) {
		this.marke = pMarke;
		this.farbe = pFarbe;
		this.ps = pPS;
		
	}
	
	public double berechneVerbrauch(double pKm, double pLiter) {
		double verbrauch100 = 0;
		verbrauch100 = 100 * pLiter/pKm;
		return verbrauch100;
	}
	
	public double berechneRestwert(int pNutzJahre, double pAnschPreis, int pGplNutzDauer) {
		double Restwert = 0;
		Restwert = pAnschPreis - (pAnschPreis / pGplNutzDauer * pNutzJahre);
		return Restwert;
	}
	
	public void showData() {
		System.out.println(("Mein Auto hat folgende Eigenschaften: ") 
		+ "\n" + ("Marke: " + this.marke) + "\n"
		+ ("Farbe: " + this.farbe)
		+ "\n" + ("PS: " + this.ps));
	}
}
