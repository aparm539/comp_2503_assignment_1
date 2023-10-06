import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MostFreqAvenger implements Comparator <Avenger>{

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
	
//	Ordering and breaking ties: To find the top four most popular or least
//	popular avengers, I want you to use two different Comparators and re-sort
//	your ArrayList, using Collections.sort() then print the first four (if
//	there are four ) items.
	//ArrayList<Avenger> avengerList = new ArrayList<Avenger>();
	//Collections.sort(avengerList);
	//print first four
//	Remember that a Comparator must provide a total ordering for the ob-
//	jects. That includes some clearly defined behaviour in case of a tie. For
//	example, if there are two words, ‘foo’ and ‘bar’ and they both occurred
//	10 times, which should come first in the list? Make sure to follow the re-
//	quirement for ordering and tie breaking (refer to the Description Section)

	
	
//	The four most frequently mentioned avengers ordered from most frequent
//	to least, counting the total number of times they are mentioned (sum of
//	the count for the number times they are mentioned by alias, hero name,
//	or performer’s last name). In case of ties, then the secondary ordering
//	must be in ascending alphabetical order of performer’s last name (a-z).
	

}
