package listArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Case2ArrayList {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String name;int ch;
		ArrayList list=new ArrayList();
		do
		{
			System.out.println("1.Display installed applications\r\n" + "2.Install an application\r\n" + 
				"3.Uninstall an application\r\n" + "4.Quit\r\n" + "");
			 ch=s.nextInt();
			if(ch==1)
			{
					if(list.isEmpty())
					{
					System.out.println("There is no application installed.");
					}
					else
					{
						Iterator itr=list.iterator();
						int j=1;
						while(itr.hasNext())
						{
							System.out.println(j+")"+itr.next());
							j++;
						}
					}
			}
			else if(ch==2)
			{
				System.out.println("Enter Name :");
				name=s.next();
				if(list.contains(name))
				{
					System.out.println("This App already installed");
				}
				else
				{
					list.add(name);
					System.out.println("Application installed successfully.");
				}
			}
			else if(ch==3)
			{
				if(list.isEmpty())
				{
					System.out.println("There is no application");

				}
				else
				{
				Iterator itr=list.iterator();
				int i=1;
						while(itr.hasNext())
						{
							System.out.println(i+")"+itr.next());
							i++;
						}
				System.out.println("Enter the application number :");
				int n=s.nextInt();
				
					list.remove(n-1);
					System.out.println("App is uninstalled successfully");
				}
			}
			else if(ch==4)
			{
				System.out.println("Successfully terminated");
				exit();
			}
			else
			{
				System.out.println("Invalid input");
			}
			
		}while(ch==1||ch==2||ch==3);		
			
		
	}

	private static void exit() {
		// TODO Auto-generated method stub
		
	}

}
