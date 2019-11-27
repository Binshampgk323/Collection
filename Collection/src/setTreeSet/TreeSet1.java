package setTreeSet;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import setTreeSet.NewCard;
import setTreeSet.Symbol;

public class TreeSet1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String symbol;int num,count=0;
		Set<NewCard> set=new TreeSet<NewCard>(new Symbol()); //create tree set,it is natural order
		NewCard[] c=new NewCard[40];  //declare class array
		System.out.println("Enter number of char");
		int n=s.nextInt();
		while(set.size()<n) //check size of set is less than number
		{
			symbol=s.next();
			num=s.nextInt();
			c[count]=new  NewCard();  //redirect to class NewCard
			c[count].setSymbol(symbol);
			c[count].setNum(num);
			set.add(c[count]);
			count++;
		}
	System.out.println(n+" Symbols gathered in "+count+" cards.");
	System.out.println("Cards are");
	Iterator <NewCard> itr=set.iterator();
	while(itr.hasNext())
	{
		NewCard ca=(NewCard)itr.next();
		System.out.println(ca.getSymbol()+" "+ca.getNum());
	}
	}


}
