package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ExtendedFor
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> AList=new ArrayList<Integer>();
		
		System.out.println("===== Enter the Elements =====");
		
		for(int i=1;i<=10;i++)
		{
			AList.add(new Integer(s.nextInt()));
		}
		
		System.out.println(AList.toString());
		
		
		System.out.println("===== Retrieve using Extended for =====");
		for(int Ele : AList)
		{
			System.out.print(Ele+" ");

		}
		System.out.println();
		HashSet<Integer> set=new HashSet<Integer>(AList);
		
		ArrayList<Integer> AList2=new ArrayList<Integer>(set);
		System.out.println("Eliminating Duplicates by using Set IN LIST");
		System.out.println(AList2);
		System.out.println("===== Retrieve using Extended for =====");
		for(int Ele : AList2)
		{
			System.out.print(Ele+" ");
		}
		
	}

}
