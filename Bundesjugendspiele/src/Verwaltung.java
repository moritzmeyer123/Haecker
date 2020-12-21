import java.util.ArrayList;
import java.util.Collections;

public class Verwaltung {

	private ArrayList<Teilnehmer> teilnehmerListe = new ArrayList<Teilnehmer>();
	
	public void fuegeTeilnehmerHinzu(Teilnehmer teilnehmer) {
		teilnehmerListe.add(teilnehmer);
	}
	
	public Teilnehmer siegerD1 () {
		Teilnehmer bester = teilnehmerListe.get(0);
		for(Teilnehmer t: teilnehmerListe) {
			if(t.getD1() < bester.getD1()) {
				bester = t;
			}
		}
		return bester;
	}
	
	public Teilnehmer siegerD2 () {
		Teilnehmer bester = teilnehmerListe.get(0);
		for(Teilnehmer t: teilnehmerListe) {
			if(t.getD2() < bester.getD2()) {
				bester = t;
			}
		}
		return bester;
	}
	
	public Teilnehmer siegerD3 () {
		Teilnehmer bester = teilnehmerListe.get(0);
		for(Teilnehmer t: teilnehmerListe) {
			if(t.getD3() < bester.getD3()) {
				bester = t;
			}
		}
		return bester;
	}
	
	public Teilnehmer getTeilnehmer(String name) {
		Teilnehmer gesucht = null;
		for(Teilnehmer t: teilnehmerListe) {
			if(t.getName().equals(name)) {
				gesucht = t;
			}
		}
		return gesucht;
	}
	
	public void sortiereNachD1(){
		teilnehmerListe.sort(new ComparatorD1());
	}
	
	public void sortiereNachD2() {
		teilnehmerListe.sort(new ComparatorD2());
	}
	
	public void sortiereNachD3() {
		teilnehmerListe.sort(new ComparatorD3());
	}
	
	public void sortiereNachName() {
		Collections.sort(teilnehmerListe);
	}
	
	public void addTestTeilnehmer() {
		Teilnehmer meyer = new Teilnehmer("Moritz", "Meyer", "m", 1);
		Teilnehmer fistarol = new Teilnehmer("Carina", "Fistarol", "w", 0);
		Teilnehmer wetter = new Teilnehmer("Jakob", "Wetter", "m", 1);
		Teilnehmer pauer = new Teilnehmer("Kevin", "Pauer", "m", 1);
		Teilnehmer dietsche = new Teilnehmer("Florian", "Dietsche", "m", 1);
		Teilnehmer schmidt = new Teilnehmer("Jan-Niklas", "Schmidt", "m", 3);
		
		this.fuegeTeilnehmerHinzu(meyer);
		this.fuegeTeilnehmerHinzu(fistarol);
		this.fuegeTeilnehmerHinzu(wetter);
		this.fuegeTeilnehmerHinzu(pauer);
		this.fuegeTeilnehmerHinzu(dietsche);
		this.fuegeTeilnehmerHinzu(schmidt);
		
		meyer.setD1(3);
		meyer.setD2(5);
		meyer.setD3(1);
		
		fistarol.setD1(2);
		fistarol.setD2(4);
		fistarol.setD3(6);
		
		wetter.setD1(1);
		wetter.setD2(6);
		wetter.setD3(5);
		
		pauer.setD1(4);
		pauer.setD2(1);
		pauer.setD3(2);
		
		dietsche.setD1(5);
		dietsche.setD2(2);
		dietsche.setD3(3);
		
		schmidt.setD1(6);
		schmidt.setD2(3);
		schmidt.setD3(4);
		
	}
	
	public void gibAlleTeilnehmerAus() {
		for(Teilnehmer t: teilnehmerListe) {
			System.out.println(t.toString());
		}
	}
}
