package example.com;

public class Justification {
	void m()
	{
		System.out.println(this);
	}

	public static void main(String[] args) {
		Justification j = new Justification();
		Justification j1 = new Justification();
		System.out.println(j);
		System.out.println(j1);
		j1.m();
		
		

	}

}
