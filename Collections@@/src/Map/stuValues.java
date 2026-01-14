package Map;

public class stuValues
{
	
	public String name,br,result;
	public int totMarks;
	public float per;
	
	public stuValues(String name, String br, String result, int totMarks, float per) 
	{
		super();
		this.name = name;
		this.br = br;
		this.result = result;
		this.totMarks = totMarks;
		this.per = per;
	}

	public String toString()
	{
		return name+"\t"+br+"\t"+result+"\t"+totMarks+"\t"+per;
	}
	

}
