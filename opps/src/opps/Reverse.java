package opps;

public class Reverse {

	public static void main(String[] args)
	{
		int num = 987654,reverse=0;
		while(num>0)
		{
			int remainder = num%10;
			reverse=reverse*10+remainder;
			num=num/10;
		}
		System.out.println(reverse);

	}

}
