package listArryLinkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Case1ArrayListDelete {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList list=new ArrayList(); //create arraylist
		String up="";
		System.out.println("Enter number of Customers");
		int n=s.nextInt();
		CustomerCaseDelete1 csm[]=new CustomerCaseDelete1[n]; //create class array
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
		    csm[j]=new CustomerCaseDelete1();  //add value to array
			csm[j].setName(name);
			csm[j].setAddress(address);
			csm[j].setNumber(number);
			csm[j].setMail(mail);
			csm[j].setProof(proof);
			csm[j].setProofid(proofid);	
			
				System.out.println("Do you want to update the email id(yes/no)");
				up=s.next();
				up=up.toLowerCase();  //input is convert  to lowercase
				if(up.equals("yes"))
				{
					System.out.println("Enter new Email id");
					String email=s.next();
					csm[j].setMail(email);	
				}
				
				list.add(csm[j]); //add array value to list
			}
		
			int i=1;
			Iterator<CustomerCaseDelete1> itr=list.iterator();
			while(itr.hasNext())
			{
				CustomerCaseDelete1 c=itr.next();
				System.out.println(i+" Customer Deatils\n************");
				System.out.println("Name: "+c.getName());
				System.out.println("Address: "+c.getAddress());
				System.out.println("Number: "+c.getNumber());
				System.out.println("Email: "+c.getMail());
				System.out.println("ProofType: "+c.getProofid());
				System.out.println("Proof: "+c.getProofid());
				i++;
			}
				
			System.out.println("Enter id of the customer you want to delete ");
			int d=s.nextInt();
			list.remove(d-1); //delete customer 
			int k=1;
			
			//print customer details
			Iterator<CustomerCaseDelete1> itr1=list.iterator();
			while(itr1.hasNext())
			{
				CustomerCaseDelete1 c=itr1.next();
				System.out.println(k+" Customer Deatils\n************");
				System.out.println("Name: "+c.getName());
				System.out.println("Address: "+c.getAddress());
				System.out.println("Number: "+c.getNumber());
				System.out.println("Email: "+c.getMail());
				System.out.println("ProofType: "+c.getProofid());
				System.out.println("Proof: "+c.getProofid());
				k++;
			}
	}

}


