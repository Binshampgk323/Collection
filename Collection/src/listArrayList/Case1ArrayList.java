package listArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Case1ArrayList {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList list=new ArrayList();
		String up="";
		System.out.println("Enter number of Customers");
		int n=s.nextInt();
		CustomerCase1 csm[]=new CustomerCase1[n]; //create customer class array
		System.out.println("Registration");
		System.out.println();
		
		for(int j=0;j<n;j++)
		{	
			
			System.out.println("Enter your name");
			String name=s.next();
			System.out.println("Enter your address");
			String address=s.next();
			System.out.println("Contact Number");
			String number=s.next();
			System.out.println("E-Mail ID");
			String mail=s.next();
			System.out.println("Enter proof type");
			String proof=s.next();
			System.out.println("Enter proof id");
			String proofid=s.next();
			
			//store value to customer array
			
		    csm[j]=new CustomerCase1(); 
			csm[j].setName(name); 
			csm[j].setAddress(address);
			csm[j].setNumber(number);
			csm[j].setMail(mail);
			csm[j].setProof(proof);
			csm[j].setProofid(proofid);	
			
				System.out.println("Do you want to update the email id(yes/no)");
				up=s.next();
				up=up.toLowerCase();
				if(up.equals("yes"))
				{
					
					System.out.println("Enter new Email id");
					String email=s.next();
					csm[j].setMail(email);  //update mail
					
				}
				
				list.add(csm[j]); //add all value to list
			}
			
			//print the list values
		
			int i=1;
			Iterator<CustomerCase1> itr=list.iterator();
			while(itr.hasNext())
			{
				CustomerCase1 c=itr.next();
				System.out.println(i+" Customer Deatils\n************");
				System.out.println("Name: "+c.getName());
				System.out.println("Address: "+c.getAddress());
				System.out.println("Number: "+c.getNumber());
				System.out.println("Email: "+c.getMail());
				System.out.println("ProofType: "+c.getProofid());
				System.out.println("Proof: "+c.getProofid());
				i++;
			}
				
	}

}

