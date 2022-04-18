package finalKeyword;

class Bike2 {
	void run()
	{
		System.out.println("Running");
	}
}
class Honda1 extends Bike2{
	void run()
	{
		System.out.println("Running safely with 100kmph");
	}

	public static void main(String[] args) {
		Honda1 honda= new Honda1();
		honda.run();

	}

}
