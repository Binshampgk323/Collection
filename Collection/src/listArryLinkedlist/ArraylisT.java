package listArryLinkedlist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ArraylisT {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		ArrayList list=new ArrayList(); //declaration of array list
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name");
			String name=s.next();
			System.out.println("Enter age");
			int age=s.nextInt();
			list.add(name);   // add name to list
			list.add(age);   // add age to list
		}
		ArrayList list1=(ArrayList) list.clone(); //create duplicate array list
		System.out.println("index 0 : "+list.get(0));  // for getting value in given index
		list.remove(0); // remove value in given index
		System.out.println("Index 0 "+list.get(0));
		System.out.println("After remove index 0 value");
		
		list1.removeAll(list1);
		System.out.println("list 1 is removed");
		
		Iterator itr=list.iterator(); //for print list values ;same function of for loop 
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Clone list");
		list1.clear(); // clear all the list values
		System.out.println("clear are value");
		Iterator itr1=list1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		list.set(0, "all");  //update the inputed value
		System.out.println("after set index 0");
		
	}

}
