package list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorR {

	public static void main(String[] args) 
	{
		Vector<Integer> ob=new Vector<Integer>();
		
System.out.println("default Capacity:"+ob.capacity());
System.out.println("Default Size:"+ob.size());

int k=0;
while(ob.size()<11)
{
	int count=0;
	   for(int i=1;i<=k;i++)
	    {
		   if(k%i==0)
		   {
			count++;
		    }
	    } //End of  FOR loop


      if(count==2)
     {
	   ob.addElement(new Integer(k));
      }
      k++;
} // End of While loop

System.out.println("======Vector<E>=====");
System.out.println(ob);


System.out.println("======Enumeration<E>=====");

Enumeration<Integer> e=ob.elements();

while(e.hasMoreElements())
{
	Integer el= e.nextElement();
	System.out.print(el +" ");
}
System.out.println();

System.out.println("======Iterator<E> - asIterator() =====");
Enumeration <Integer> e2 = ob.elements();

Iterator <Integer> ob2 = e2.asIterator();

	  ob2.forEachRemaining(( z)->
	   {
		   System.out.print(z+" ");
		   
	   });


	}
}
