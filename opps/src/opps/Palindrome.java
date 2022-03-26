package opps;

public class Palindrome {

	public static void main(String[] args) {
		int num = 90609,reverse=0,temp=0;
		temp=num;
		while(num>0) 
		{
			int remainder = num%10;
			reverse= reverse *10+remainder;
			num=num/10;
		}
		System.out.println(temp);
		System.out.println(num);
		System.out.println(reverse);
		if(temp==reverse)
		{
			System.out.println(" I am palindrome");
			
		}
		else
			System.out.println("I am not palindrome");
		
		}

}
