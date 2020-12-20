package exceptions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import tabletVergleich.MediaMarktBerater;
import tabletVergleich.Tablet;

public class Kunde {

	int budget;
	boolean kenntSichMitTabletsAus;
	
	public Kunde(int budget, boolean kenntSichMitTabletsAus) {
		this.budget = budget;
		this.kenntSichMitTabletsAus = kenntSichMitTabletsAus;
	}
	
	public void beratenLassen(ArrayList<Tablet> tablets) throws ZuTeuerException, KeineAhnungException {
		tablets.sort(new MediaMarktBerater());
		System.out.println("Das beste Tablet: " + tablets.get(0));
		Tablet bestesTablet = tablets.get(0);
		if(bestesTablet.getPreis() > budget) {
			throw (new ZuTeuerException());
		}
		if(kenntSichMitTabletsAus) {
			throw new KeineAhnungException();
		}
	}
}
