package kapselung;

public class Konfigurator {
	public String marke;
	public String type;
	public char farbe;
	public int ps;
	
	public Konfigurator (String pMarke, String pType, char pFarbe, int pPs) {
		this.setMarke(pMarke);
		this.setType(pType);
		this.setFarbe(pFarbe);
		this.setPs(pPs);
	}
	
	public String getMarke() {
		return marke;
	}
	public void setMarke(String pMarke) {
		if (pMarke == "Audi" | pMarke == "Mercedes") {
			this.marke = pMarke;
		}else {
			this.marke = "X";
		}
	}
	
	public String getType() {
		return type;
	}
	public void setType(String pType) {
		if (pType == "R8" & getMarke() == "Audi" | pType == "C-Klasse" & getMarke() == "Mercedes") {
			this.type = pType;
		}else {
			this.type = "X";
		} 
	}
	
	public char getFarbe() {
		return farbe;
	}
	public void setFarbe(char pFarbe) {
		if (pFarbe == 'r' & getMarke() == "Audi" | pFarbe == 'g' & getMarke() == "Mercedes") {
			this.farbe = pFarbe;
		}else {
			this.farbe = 'X';
		}
	}
	
	public int getPs() {
		return ps;
	}
	public void setPs(int pPs) {
		if ((this.type == "R8" & (pPs == 430 | pPs == 525 | pPs == 550)) | this.type == "C-Klasse" & pPs == 156) {
			this.ps = pPs;
		}else {
			this.ps = -1;
		}
	}
	
	public void showData() {
		System.out.println("Meine Konfiguration enhält folgende Daten: ");
		if (this.getMarke() == "X") {
			System.out.println("Marke: Marke nicht vorhanden");
		}else {
			System.out.println("Marke: " + this.getMarke());
		}
		if(this.getType() == "X") {
			System.out.println("Type: Type nicht vorhanden oder nicht kominierbar");
		}else {
			System.out.println("Type: " + this.getType());
		}
		if(this.getFarbe() == 'X') {
			System.out.println("Farbe: Farbe nicht vorhanden oder nicht wählbar");
		}else {
			System.out.println("Farbe: " + this.getFarbe());
		}
		if(this.getPs() == -1) {
			System.out.println("PS: falscher Wert");
		}else {
			System.out.println("PS: " + this.getPs());
		}
	}
}
