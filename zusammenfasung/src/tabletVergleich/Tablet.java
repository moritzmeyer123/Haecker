package tabletVergleich;

public class Tablet implements Comparable<Tablet> {

	private String name;
	private String hersteller;
	private Double bildschirmgroesse;
	private double preis;
	
	
	public Tablet(String name, String hersteller, double bildschirmgroesse, double preis) {
		this.name = name;
		this.hersteller = hersteller;
		this.bildschirmgroesse = bildschirmgroesse;
		this.preis = preis;
	}
	
	public String getName() {
		return name;
	}
	
	public String getHersteller() {
		return hersteller;
	}
	
	public double getBildschirmgroesse() {
		return bildschirmgroesse;
	}
	
	public double getPreis() {
		return preis;
	}

	@Override
	public int compareTo(Tablet o) {
		if (this.bildschirmgroesse != o.bildschirmgroesse) {
			return this.bildschirmgroesse.compareTo(o.bildschirmgroesse);
		} else if (!this.hersteller.equals(o.hersteller)) {
			return this.hersteller.compareTo(o.hersteller);
		} else {
			return this.name.compareTo(o.name);
		}
	}
	
	public String toString() {
		return name + " " + hersteller + " " + bildschirmgroesse + " " + preis;
	}

	
}
