package fahrrad;

public class Fahrrad {
	public String marke;
	public double preis;
	public double rahmengr;
	
	public Fahrrad(String pMarke, double pPreis, double pRahmengr) {
		this.marke = pMarke;
		this.preis = pPreis;
		this.rahmengr = pRahmengr;
		
	}
	
	public void showData() {
		System.out.println(("Mein Fahrrad hat folgende Eigenschaften: ") 
		+ "\n" + ("Marke: " + this.marke) + "\n"
		+ ("Farbe: " + this.preis)
		+ "\n" + ("PS: " + this.rahmengr));
	}
	
}
