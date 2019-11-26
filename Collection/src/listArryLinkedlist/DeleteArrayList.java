package listArryLinkedlist;

import java.util.ArrayList;

public class DeleteArrayList {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("aaa");  // add value to arraylist
		list.add("bbb");
		list.add("ccc");
		System.out.println("Actual array list:"+list); //print arraylist
		list.clear();  // delete all values from arraylist
		System.out.println("After clear ArrayList:"+list);

	}

}
