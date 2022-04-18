package Interface;
interface FirstInterface{
	public void myMethod();
}
interface SecondInterface{
	public void myOtherMethod();
}
class DemoClass implements FirstInterface,SecondInterface{
	public void myMethod() {
		System.out.println("FirstInterface");
	}
	public void myOtherMethod() {
		System.out.println("SecondInterface");
	}
}
public class Students {

	public static void main(String[] args) {
	DemoClass myObj = new DemoClass();
	myObj.myMethod();
	myObj.myOtherMethod();
	}

}
