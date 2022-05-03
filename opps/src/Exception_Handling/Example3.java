package Exception_Handling;

public class Example3 {

	public static void main(String[] args) {
		try {
			int arr[] = new int[5];
			arr[7] = 100/20;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Occurs");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception Occurs");
		}
		
		System.out.println("Rest of the code");

	}

}
