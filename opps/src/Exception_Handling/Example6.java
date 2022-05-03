package Exception_Handling;

public class Example6 {
	public static void validate(int age)
	{
		if(age<21 && age>27)
			throw new ArithmeticException("Ur Not Eligible");
		else
			System.out.println("Ur Eligible to attend Military Selection");
	}
	public static void main(String[] args) {
		try 
		{
			validate(20);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Occured:" + e);
		}
		System.out.println("Rest of the code....");
	}

}
