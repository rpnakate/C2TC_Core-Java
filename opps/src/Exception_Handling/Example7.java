package Exception_Handling;
class MyMethod1 {
	void myMethod(int num) {
		if(num==1)
			System.out.println("If part is working");
		else
			System.out.println("Else part is working");
	}
}

public class Example7 {

	public static void main(String[] args) {
		try
		{
			MyMethod1 obj=new MyMethod1();
			obj.myMethod(1);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
