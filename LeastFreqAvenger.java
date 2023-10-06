import java.util.Comparator;

public class LeastFreqAvenger implements Comparator <Avenger>{

	@Override
	public int compare(Avenger a1, Avenger a2) {
		int result = a1.compareTo(a2);
		if (a1.avengerMentionCount() > (a2.avengerMentionCount())) {
			result = -1;
		}
		else if(a1.getPerformer()  (a2.getPerformer())) {
			result = 1;
		}
		else {
			result = a1.getHeroName().length() - a2.getHeroName().length();
		}
		return result;
	}
	
//	 The four (most) least frequently mentioned performers ordered from most to least.
//	In case of ties, then the secondary ordering must be in ascending order of
//	hero’s name’s length, then again in case of ties, in ascending alphabetical
//	order of alias (a-z).
	

}
