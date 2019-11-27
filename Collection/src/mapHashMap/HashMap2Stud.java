package mapHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap2Stud {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String name,Phno,college,address;
		int mark,year,regno;
		System.out.println("size");
		int n=s.nextInt();
		Map<Integer,Student> map=new HashMap<Integer,Student>();
		Student []st=new Student[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Name");
			name=s.next();
			System.out.println("Register number");
			regno=s.nextInt();
			System .out.println("Phone number");
			Phno=s.next();
			System.out.println("College Name");
			college=s.next();
			System.out.println("Address");
			address=s.next();
			System .out.println("Mark");
			mark=s.nextInt();
			st[i]=new Student();
			st[i].setName(name);
			st[i].setPhno(Phno);
			st[i].setCollege(college);
			st[i].setAddress(address);
			st[i].setMark(mark);
			map.put(regno, st[i]);
		}
		for(Map.Entry<Integer,Student> en:map.entrySet())
		{
			int key=en.getKey();
			Student e=en.getValue();
			//System.out.println(key+" "+e.getName()+" "+e.getAge());
		}

	}

}
