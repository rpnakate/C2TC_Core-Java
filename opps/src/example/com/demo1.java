package example.com;

public class demo1 {
void m()
{
	System.out.println(this);
}
	public static void main(String[] args) {
		demo1 obj = new demo1();
		System.out.println(obj);
		obj.m();
		

	}

}

