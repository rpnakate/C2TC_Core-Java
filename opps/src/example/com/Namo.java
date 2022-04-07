package example.com;

class Namo {
int rollno;
String name;
float fee;
	Namo(int rollno, String name, float fee)
	{
		this.rollno=rollno;
		this.name=name;
		
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}

	class TestThis{
		public static void main(String args[]) {
			Namo s1= new Namo(111,"ankit",5000f);
			Namo s2= new Namo(112,"sumit",8000f);
			s1.display();
			s2.display();
			
		}
	}

}

