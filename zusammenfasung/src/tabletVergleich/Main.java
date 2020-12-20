package tabletVergleich;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main (String[] args) {
		Tablet[] tablets = erzeugeTestDaten();
		ArrayList<Tablet> tabletList = new ArrayList<>();
		tabletList = castArrayToList(tablets);
		gibTabletListeAus(tabletList);
		System.out.println();
		tabletList.sort(new MediaMarktBerater());
		gibTabletListeAus(tabletList);
		System.out.println();
		Collections.sort(tabletList);
		gibTabletListeAus(tabletList);
		//System.out.println(tablets[0].compareTo(tablets[1]));
	}
	
	public static Tablet[] erzeugeTestDaten () {
		Tablet[] tablets = new Tablet[5];
		tablets[0] = new Tablet("iPad Air 1", "Apple", 9.8, 250.0);
		tablets[1] = new Tablet("iPad Air 2", "Apple", 10.0, 300.0);
		tablets[2] = new Tablet("Tab 5", "Samsung", 15.0, 120.0);
		tablets[3] = new Tablet("Mate 10", "Huawei", 12.9, 600.0);
		tablets[4] = new Tablet("iPad Pro", "Apple", 12.9, 1100);
		return tablets;
	}
	
	public static ArrayList<Tablet> castArrayToList(Tablet[] tablets) {
		ArrayList<Tablet> list = new ArrayList<>();
		for(Tablet t: tablets) {
			list.add(t);
		}
		return list;
	}
	
	public static void gibTabletListeAus(ArrayList<Tablet> tablets) {
//		for(Tablet t: tablets) {
//			System.out.println(t.toString());
//		}
		Iterator it = tablets.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		
	}
	
	
	
	
	
	
	
}
