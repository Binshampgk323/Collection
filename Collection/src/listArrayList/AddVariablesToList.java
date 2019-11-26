package listArrayList;

import java.util.*;

public class AddVariablesToList {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList list=new ArrayList();
		System.out.println("Enter size");
		int num=s.nextInt(); //number of input string 
		String name;
		for(int i=0;i<num;i++)
		{
			name=s.next();
			list.add(name);  //add each name to list
		}
		System.out.println("Output\n******");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());  //print list
		}
	}

}
