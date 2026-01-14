package Map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FirstMap 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		try(s)
		{
			try {
				LinkedHashMap<String,stuValues> ob=new LinkedHashMap<String,stuValues>();
				while(true)
				{
					System.out.println("*****Choice*****");
					System.out.println("\t1.put(K,V)"
							+"\n\t2.get(Object)"
							+"\n\t3.remove(Object)"
							+"\n\t4.keySet()"
							+"\n\t5.values()"
							+"\n\t6.entrySet()"
							+"\n\t7.exit");
					
					System.out.println("Enter the choice");
					int choice=Integer.parseInt(s.nextLine());
					switch(choice)
					{
					case 1:
						System.out.println("Enter the rollno:");
						String rollno=s.nextLine();
						System.out.println("Enter the Stuname:");
						String stuName=s.nextLine();
						System.out.println("Enter the Branch");
						String stuBr=s.nextLine();
						
						System.out.println("Enter the 6 submarks:");
						
						int i=1,totMarks=0;
						while(i<=6)
						{
							System.out.println("Enter the marks of sub-"+i);
						int sub=Integer.parseInt(s.nextLine());
								
								totMarks=totMarks+sub;
						i++;
					}//end of loop
					
					float per=(float)totMarks/6;
					String res=new CalculateResult().cal(per);
					
					ob.put(new String(rollno),new stuValues(stuName,stuBr,res,totMarks,per));
					ob.forEach((x,y) ->
					{
						System.out.println(x+"\t"+y);
					});
					break;
					
					case 2:
						
						if(ob.isEmpty())
						{
								System.out.println("Map is Empty");
						}
						
						else
						{
							System.out.println("Enter the Rollno:");
							String rno=s.nextLine();
							
							stuValues sv=ob.get(rno);
							
							if(sv==null)
							{
								System.out.println("Details not Avilable");
							}
							else
							{
								System.out.println(sv.toString());
							}
						}
						break;
						
					case 3:
						
						if(ob.isEmpty())
						{
							System.out.println("Map is empty");
						}
						
						else
						{
							System.out.println("Enter the rollno for delete:");
							String rno2=s.nextLine();
							stuValues sv2=ob.remove(rno2);
							if(sv2==null)
							{
								System.out.println("Details not avilable");
							}
							System.out.println("The following Details deleted");
							System.out.println(sv2.toString());
						}
				
				break;
				
				  case 4:
				 	
					if(ob.isEmpty())
					{
						System.out.println("Map is Empty");
					}
					
					else
					{
						Set <String> ks=ob.keySet();
						System.out.println("****Keyset****");
						ks.forEach( k ->
					        
						{
								System.out.println(k.toString());
						});
						break;
					}
						case 5:
							
							if(ob.isEmpty())
							{
								System.out.println("Map is Empty");
								
							}
							
							else
							{
								Collection<stuValues> c=ob.values();
								System.out.println("*****Values*****");
								
								c.forEach((v)->
								{
									System.out.println(v.toString());
								});
								}
							break;
							
						case 6:
							
							System.out.println("Display using Extended for");
							for(Entry<String, stuValues> e:ob.entrySet())
							{
								System.out.println(e.getKey()+"\t"+e.getValue());
							} //end of For loop
							break;
							
						case 7:
							System.out.println("Operations stopped");
							System.exit(0);
							
						default:
								System.out.println("Invalid choice");
					}//end of switch
			}//end of loop
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			}//end of try with resource
		}

	}


