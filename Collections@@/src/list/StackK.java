package list;

import java.util.Scanner;
import java.util.Stack;

public class StackK 
{

	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		Stack<Integer> ob=new Stack<Integer>();
		while(true)
		{
		
		System.out.println("\t1.push");
		System.out.println("\t2.pop");
		System.out.println("\t3.peak");
		System.out.println("\t4.search(object)");
		System.out.println("\t5.Exit");
		
		System.out.println("Enter the choice:");
		int choice=s.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter the element to push");
			ob.push(new Integer(s.nextInt()));
			System.out.println(ob.toString());
			break;
		case 2:
			if(ob.empty())
			{
				System.out.println("EMPTY STACK");
			}
			else
			{
				ob.pop();
				System.out.println(ob.toString());
			}
			break;
		case 3:
			
			if(ob.empty())
			{
				System.out.println("EMPTY STACK");
			}
			else
			{
				int peek=ob.peek();
				System.out.println("Peak Element:"+peek);
				
			}
			break;
		case 4:
			if(ob.empty())
			{
				System.out.println("EMPTY STACK");
			}
			else
			{
				System.out.println("Enter the element to be searched:");
				
				Integer el=new Integer(s.nextInt());
				int p=ob.search(el);
			
				if(p>0)
				{
					System.out.println("Element Found at pos:"+p);
				}
				else
				{
					System.out.println("Element Not Found");
				}
				
			}
			break;
		case 5:
			System.out.println("Stack Operations Stopped");
			System.exit(0);
      
		default:
			System.out.println("Invalid choice");
		} //end of switch
		
	 }//end of while loop
	}

}
