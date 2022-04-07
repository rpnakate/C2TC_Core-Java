package example.com;
class Demo4{
	void m(Demo4 a) {
		System.out.println("in method m");
	}
	void p() {
		m(this);
		System.out.println("in method p");
	}
}
public class Ram {

	public static void main(String[] args) {
		Demo4 d = new Demo4();
		d.p();

	}

}
