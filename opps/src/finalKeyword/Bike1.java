package finalKeyword;

class Bike1 {
void run()
{
	System.out.println("Running");
}
class Honda extends Bike1{
	void run()
	{
		System.out.println("Running safely with 100kmph");
	}
}
	public static void main(String[] args) {
	Bike1 h= new Bike1();
		h.run();

	}

}
