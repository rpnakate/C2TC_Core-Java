package Exception_Handling;

import java.util.Scanner;

class InvalidBloodDonationException extends Exception
{
	InvalidBloodDonationException(String s)
	{
		super(s);
	}
}

public class Example9 {
	static void validate(int age,int weight)throws InvalidBloodDonationException
	{
		if(age<18 && weight<55)
		{
			throw new InvalidBloodDonationException("No !!! You are Not Eligible to donate a Blood");

		}
		else
			System.out.println("Yes !!! You are Eligible to donate a Blood");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age=sc.nextInt();
		int weight=sc.nextInt();
		try
		{
			validate(age,weight);
		}
		catch(InvalidBloodDonationException e)
		{
			System.out.println("Exception Occured: " + e);
		}
		System.out.println("Exception is Handled");
	}

}
