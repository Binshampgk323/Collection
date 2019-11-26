package listArryLinkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListEncapsulation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,i,age;
		String name;
		System.out.println("Enter size");
		n=s.nextInt();
		Employee[] emp=new Employee[n];
		ArrayList ls=new ArrayList();
		for(i=0;i<n;i++)
		{
			System.out.println("Name");
			name=s.next();
			System.out.println("Age");
			age=s.nextInt();
			emp[i]=new Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			ls.add(emp[i]);
			
		}
		Iterator<Employee> irt=ls.iterator();
		while(irt.hasNext())
		{
			Employee e=irt.next();
			System.out.println(e.getName()+" "+e.getAge());
		}

	}

}
class Employee
{
	int age;
	String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}