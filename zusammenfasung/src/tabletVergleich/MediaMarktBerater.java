package tabletVergleich;

import java.util.Comparator;

public class MediaMarktBerater implements Comparator<Tablet> {
	
	@Override
	public int compare(Tablet t1, Tablet t2) {
		return (int)(t1.getPreis() - t2.getPreis());
	}
	
	
}
