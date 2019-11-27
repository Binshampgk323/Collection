package setHashSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class Case1HashSet {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of room");
		int n=s.nextInt();
		String ac,cot,laundry,cable,wifi;
		int total=0,b=0,c,d,e,f,rno,ch=0;int status=0,room=0;
		HashSet set=new HashSet();
		Customer cr[]=new Customer[40];
	do {
		System.out.println("Menu\n 1 : Booking\n 2 : Check Status\n 3 : Exit");
		ch=s.nextInt();
	
		if(ch==1)
		{
			for(int i=0;i<n;i++)
			{	
					System.out.println("Booking");
					System.out.println("Please choose the service required");
					System.out.println("AC/non-AC(AC/nAC)");
					ac=s.next();
					ac=ac.toUpperCase();
					if(ac.contentEquals("AC")==true) {b=1500;}
					else {b=700;}

					System.out.println("Cot(Single/Double)");
					cot=s.next();
					cot=cot.toUpperCase();
					if(cot.contentEquals("Single")==true) {c=50;}
					else {c=100;}

					System.out.println("Cable(C/nC)");
					cable=s.next();
					cable=cable.toUpperCase();
					if(cable.contentEquals("C")==true) {d=50;}
					else {d=0;}

					System.out.println("Wifi(W/nW)");
					wifi=s.next();
					wifi=wifi.toUpperCase();
					if(wifi.contentEquals("W")==true) {e=200;}
					else {e=0;}

					System.out.println("Laundry(L/nL)");
					laundry=s.next();
					laundry=laundry.toUpperCase();
					if(laundry.contentEquals("L")==true) {f=100;}
					else {f=0;}
					total=b+c+d+e+f;
					
					cr[i]=new Customer();
					cr[i].setAc(ac);
					cr[i].setCot(cot);
					cr[i].setCable(cable);
					cr[i].setWifi(wifi);
					cr[i].setLaundry(laundry);
					cr[i].setRoom(room);
					set.add(cr[i]);
					set.add(total);
			}
				int j=1;
				Iterator <Customer> itr=set.iterator();
				while(itr.hasNext())
				{	
					Customer cs=itr.next();
					System.out.println(j+" Customer");
					System.out.println("Room number is : "+j);
					System.out.println("Ac: "+cs.getAc());
					System.out.println("Cot: "+cs.getCot());
					System.out.println("Cable: "+cs.getCable());
					System.out.println("WiFi: "+cs.getWifi());
					System.out.println("Laundry: "+cs.getLaundry());
					System.out.println("The total charge is Rs.");
					j++;
				
				}
			
		}
		else if(ch==2)
			{
			System.out.println("Enter room number");
				rno=s.nextInt();
				if(set.isEmpty())
				{
					System.out.println("There is no room booked");
				}
				else
				{
					for(int j=0;j<set.size();j++)
					{	
						if(j==(rno-1))
						{
							System.out.println("Room "+rno+" is booked");
						}
						else
						{
							System.out.println("Room "+rno+" is not booked");
						}
					}
				}	
			}
		else if(ch==3)
			{
			System.out.println("Thank you");
					exit();
			}
		else
			{
			System.out.println("Invalid input");
			}
	
	}while(ch==1||ch==2||ch==3);

	}

	private static void exit() {
		
		
	}

}
