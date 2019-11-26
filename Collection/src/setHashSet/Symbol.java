package setHashSet;

import java.util.Comparator;

public class Symbol implements Comparator<NewCard> {

	// compare to characters
	
	public int compare(NewCard c1, NewCard c2) {
		
		return c1.getSymbol().compareTo(c2.getSymbol());
	}

}
