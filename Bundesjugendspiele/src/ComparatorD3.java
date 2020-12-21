import java.util.Comparator;

public class ComparatorD3 implements Comparator<Teilnehmer> {

	@Override
	public int compare(Teilnehmer t1, Teilnehmer t2) {
		return t1.getD3() - t2.getD3();
	}

}
