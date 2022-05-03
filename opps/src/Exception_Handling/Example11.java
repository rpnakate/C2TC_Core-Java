package Exception_Handling;

import java.util.Scanner;

class NameNotFoundException extends Exception
{
	NameNotFoundException(String message)
	{
		System.out.println(message);
	}
}
public class Example11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		try
		{
			customername(name);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
static void customername(String name)throws NameNotFoundException
{
	if(name.isEmpty())
	{
		throw new NameNotFoundException("Name id Empty");
	}
	else
	{
		System.out.println("Hi "+name+"welcome to our store");
	}
}
}
