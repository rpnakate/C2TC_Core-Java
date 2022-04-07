package example.com;

public class Student1 {
	int rollno;
	String name;
	static String college="ITS";
	Student1(int r, String n)
	{
		rollno=r;
		name=n;
	}
	static void change()
	{
		college="NIETM";
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	

	public static void main(String[] args) {
		Student1 s1 = new Student1(111,"Karan");
		Student1 s2 = new Student1(222,"Aryan");
		change();
		s1.display();
		s2.display();

	}

}
