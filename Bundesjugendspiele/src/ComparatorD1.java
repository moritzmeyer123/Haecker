

import java.util.Comparator;

public class ComparatorD1 implements Comparator<Teilnehmer> {

	
	public int compare(Teilnehmer t1, Teilnehmer t2) {
		return (t1.getD1() - t2.getD1());
	}
}
