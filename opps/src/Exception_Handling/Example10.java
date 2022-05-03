package Exception_Handling;
class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		System.out.println(s);
	}
}

public class Example10 {
	static void validate(int age) throws InvalidAgeException
	{
		if(age<18)
			throw new InvalidAgeException("Invalid Input");
		else
			System.out.println("Right to Vote");
	}

	public static void main(String[] args) {
		try
		{
			validate(16);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured: " +m);
		}
		System.out.println("Rest of the code");
	}

}
