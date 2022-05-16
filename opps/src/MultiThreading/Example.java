package MultiThreading;
class Eclipse extends Thread
{
	public void run()
	{
		System.out.println("Eclipse is Runninng");
	}
}
class PPT extends Thread
{
	public void run()
	{
		System.out.println("PPT is Running");
	}
}
class Zoom extends Thread
{
	public void run()
	{
		System.out.println("Zoom is Running");
	}
}
public class Example {

	public static void main(String[] args) {
		Eclipse e = new Eclipse();
		e.start();
		PPT p = new PPT();
		p.start();
		Zoom z = new Zoom();
		z.start();
	}

}
