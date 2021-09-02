import java.util.Comparator;

public class ComparatorD2 implements Comparator<Teilnehmer> {

	@Override
	public int compare(Teilnehmer t1, Teilnehmer t2) {
		return (t1.getD2() - t2.getD2());
	}

}
