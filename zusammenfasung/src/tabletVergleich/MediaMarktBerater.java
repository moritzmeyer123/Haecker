package tabletVergleich;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;



public class MediaMarktBerater implements Comparator<Tablet> {
	
	@Override
	public int compare(Tablet t1, Tablet t2) {
		return (int)(t2.getPreis() - t1.getPreis());
	}
	
	
	
}
