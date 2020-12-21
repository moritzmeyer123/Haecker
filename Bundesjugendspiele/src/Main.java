
public class Main {



	public static void main(String[] args) {
		Verwaltung verwaltung = new Verwaltung();
		verwaltung.addTestTeilnehmer();
		verwaltung.gibAlleTeilnehmerAus();
		System.out.println();
		
		//Sortiere D1
		verwaltung.sortiereNachD1();
		System.out.println("D1:");
		verwaltung.gibAlleTeilnehmerAus();
		System.out.println();
		
		//Sortiere D2
		verwaltung.sortiereNachD2();
		System.out.println("D2:");
		verwaltung.gibAlleTeilnehmerAus();
		System.out.println();
		
		//Sortiere D3
		verwaltung.sortiereNachD3();
		System.out.println("D3:");
		verwaltung.gibAlleTeilnehmerAus();
		System.out.println();
		
		//Sortiere Nachname
		verwaltung.sortiereNachName();
		System.out.println("Name:");
		verwaltung.gibAlleTeilnehmerAus();
		System.out.println();
		
		//Gib Sieger D1
		System.out.println("Sieger D1");
		System.out.println(verwaltung.siegerD1().toString());
		System.out.println();
		
		//Gib Sieger D2
		System.out.println("Sieger D2");
		System.out.println(verwaltung.siegerD2().toString());
		System.out.println();
		
		//Gib Sieger D3
		System.out.println("Sieger D3");
		System.out.println(verwaltung.siegerD3().toString());
		System.out.println();
	}

	
}
