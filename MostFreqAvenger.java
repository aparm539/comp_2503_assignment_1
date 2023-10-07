//import java.util.ArrayList;
//import java.util.Collections;
import java.util.Comparator;

public class MostFreqAvenger implements Comparator <Avenger>{

	@Override
	public int compare(Avenger a1, Avenger a2) {
		int result = a1.compareTo(a2);
		if (a1.avengerMentionCount() > (a2.avengerMentionCount())) {
			result = -1;
		}
		else {
			result = a1.getPerformer().compareTo((a2.getPerformer()));
		}
		
		return result;
	}
	
}
