
public class Teilnehmer implements Comparable<Teilnehmer>{

	private String name;
	private String vorname;
	private int stufe;
	private String geschlecht;
	
	private int d1;
	private int d2;
	private int d3;
	
	public Teilnehmer(String vorname, String name, String geschlecht, int stufe) {
		this.vorname = vorname;
		this.name = name;
		this.geschlecht = geschlecht;
		this.stufe = stufe;
	}
	
	
	
	public void ergebnisD1(int e) {
		d1 = e;
	}
	
	public void ergebnisD2(int e) {
		d2 = e;
	}
	
	public void ergebnisD3(int e) {
		d3 = e;
	}

	public int getD1() {
		return d1;
	}

	public void setD1(int d1) {
		this.d1 = d1;
	}

	public int getD2() {
		return d2;
	}

	public void setD2(int d2) {
		this.d2 = d2;
	}

	public int getD3() {
		return d3;
	}

	public void setD3(int d3) {
		this.d3 = d3;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Teilnehmer o) {
		return name.compareTo(o.getName());
	}



	@Override
	public String toString() {
		return "Teilnehmer [name=" + name + ", vorname=" + vorname + ", stufe=" + stufe + ", geschlecht=" + geschlecht
				+ ", d1=" + d1 + ", d2=" + d2 + ", d3=" + d3 + "]";
	}
	
	
	
	
	
	
	
	
}
