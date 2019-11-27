package mapHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("size");
		int n=s.nextInt();
		String name,age;
		Map<Integer,Employee> map=new HashMap<Integer,Employee>();
		Employee []emp=new Employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Name");
			name=s.next();
			System.out.println("Age");
			age=s.next();
			emp[i]=new Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			map.put(i,emp[i]);
		}
		for(Map.Entry<Integer,Employee> en:map.entrySet())
		{
			int key=en.getKey();
			Employee e=en.getValue();
			System.out.println(key+" "+e.getName()+" "+e.getAge());
		}

	}

}
