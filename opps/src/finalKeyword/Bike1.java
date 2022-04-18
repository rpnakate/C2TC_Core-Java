package finalKeyword;

class Bike1 {
final void run()
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
		Honda h=new Honda();
		h.run();

	}

}
