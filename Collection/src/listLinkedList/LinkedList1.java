package listLinkedList;
import java.util.*;
public class LinkedList1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number of student");
	int num=s.nextInt();
	LinkedList list=new LinkedList(); //create linked list
	for(int i=0;i<num;i++)
	{
		System.out.println("Name");
		String name=s.next();
		System.out.println("RollNo");
		int no=s.nextInt();
		System.out.println("Branch");
		String b=s.next();
		System.out.println("Enter 3 subject marks");
		int m1=s.nextInt();
		int m2=s.nextInt();
		int m3=s.nextInt();
		list.add(name);  //add values to the list
		list.add(no);
		list.add(b);
		list.add(m1);
		list.add(m2);
		list.add(m3);
	}
System.out.println("list size "+list.size());  //return size of list
System.out.println(list);
System.out.println("list is Emplty: "+list.isEmpty()); //return list is empty or not
	}

}
