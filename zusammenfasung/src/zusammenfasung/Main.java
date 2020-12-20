package zusammenfasung;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;





public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		liste();
	}
	
	
	
	public static void vergleichen () {
		//Erstellt eine Klasse Tablet (Name, Hersteller, Bildschirmgroesse)
		//Diese Klasse implementiert das Interface Comparable
		//Vergleich Bildschrimgroesse -> Hersteller aplhabetisch -> name alphabetisch
		
		//Klasse MediamarktBerater implementiert ds INterface Comparator<Tablet>
		//compare(tablet t1, tablet t2)
		//Vergleicht Tablets anhand des Preises, je teurer desto besser
	}
	
	public static void liste() {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("hallo");
		list.add("liebe");
		list.add("welt");
		
		list.remove(2);
		for(String s: list) {
			System.out.println(s);
		}
		
		
	}
	
	public static void map() {
		Map<String, String> map = new HashMap<>();
		
		map.put("Hallo", "eins");
		map.put("Welt", "zwei");
		
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
