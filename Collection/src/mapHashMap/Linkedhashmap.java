package exam;
import java.util.*;
public class Linkedhashmap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
	        int num = sc.nextInt();
	        for(int i=0;i<num;i++)
	        {
	        	int a=Integer.parseInt(sc.next());
	        	String str=sc.next();
	        	hm.put(a,str);
	        }
	            
	        Integer ele = sc.nextInt();
	        if(hm.containsKey(ele))
	        {
	            hm.remove(ele);
	            System.out.print(hm);
	        }
	        else
	            System.out.print(hm);
	    }
	}