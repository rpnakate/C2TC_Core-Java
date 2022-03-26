package opps;
//Total no. of alphabets in a string
public class count {

	public static void main(String[] args)
	{
		String name= "Rakesh Nakhate";
		int count=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)!=' ') 
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
