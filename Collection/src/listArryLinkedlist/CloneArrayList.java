package listArryLinkedlist;
import java.util.*;
public class CloneArrayList {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList list=new ArrayList();
		System.out.println("Enter size");
		int num=s.nextInt();
		for(int i=0;i<num;i++)
		{
			String name=s.next();
			list.add(name);	 //add to list
		}
		ArrayList list1=(ArrayList)list.clone(); //make duplicate of list
		System.out.println("Array list is:"+list);
		System.out.println("Clone output is:"+list1);
	}

}
