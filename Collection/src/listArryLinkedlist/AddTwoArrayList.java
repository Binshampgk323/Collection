package listArryLinkedlist;

import java.util.*;
class AddTwoArrayList
{
  public static void main(String args[])
  {
    ArrayList list=new ArrayList();
    
    //add values to list
    
    list.add("abc");
    list.add("cde");
    list.add("fgh");
    ArrayList list1=new ArrayList();
    
    //add values to list1
    
    list1.add("ijk");
    list1.add("lmn");
    list1.add("opq");
    System.out.print("Original ArrayList:"+list);
    
    //add list1 value to list
    
    list.addAll(list1);  
    System.out.print("\nCopy ArrayList:"+list);
    
  }
}