package setHashSet;
import java.util.*;
public class HashSet1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		HashSet set=new HashSet();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("bbb");
		set.add("ddd");
		set.add("hhh");
		set.add("iii");
		set.add("aaa");
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
