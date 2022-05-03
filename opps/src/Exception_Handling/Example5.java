package Exception_Handling;

public class Example5 {

	public static void main(String[] args) {
		try 
		{
			args = null;
			args[0]="Test";
			System.out.println(args[0]);
		}
		catch (NullPointerException npe)
		{
			System.out.println("NullPointerException");
		}
		catch (Exception ex)
		{
			System.out.println("Exception");
		}
	}

}
