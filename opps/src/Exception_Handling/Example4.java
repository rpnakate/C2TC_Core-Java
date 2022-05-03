package Exception_Handling;

public class Example4 {

	public static void main(String[] args) {
		try {
			int data = 30/10;
			System.out.println(data);
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		finally
		{
			System.out.println("Finally Block is always Executed");
		}
	}

}
