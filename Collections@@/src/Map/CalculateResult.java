package Map;

public class CalculateResult 
{
	public String cal(float per)
	{
		if(per>=70 && per<=100)
			return "Destinction";
		else if(per>=60 && per<=70)
			return "FirstClass";
		else if(per>=50 && per<=60)
			return "SecondClass";
		else if(per>=35 && per<=50)
			return "ThirdClass";
		else return "Fail";
	}

}
