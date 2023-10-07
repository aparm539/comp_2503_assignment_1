import java.util.Comparator;

public class LeastFreqAvenger implements Comparator <Avenger>{

	@Override
	public int compare(Avenger a1, Avenger a2) {
		int result = a1.compareTo(a2);
		if (a1.avengerMentionCount() > (a2.avengerMentionCount())) {
			result = -1;
		}
		else if(a1.getHeroName().length() < a2.getHeroName().length()) {
			result = 1;
		}
		else {
			result = a1.getHeroAlias().compareTo(a2.getHeroAlias());
		}
		return result;
	}
	

}
