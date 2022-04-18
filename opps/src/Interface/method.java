package Interface;
interface Inf{
	public void method1();
	
}

public class method implements Inf {
	public void method1()
	{
		System.out.println("method1");
	}

	public static void main(String[] args) {
		method obj = new method();
		obj.method1();
	}

}
