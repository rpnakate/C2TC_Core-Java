package MultiThreading;

class Eclipse1 implements Runnable
{
	public void run()
	{
		System.out.println("Eclipse is Runninng:" + Thread.currentThread().getId());
	}
}
class PPT1 extends Thread
{
	public void run()
	{
		System.out.println("PPT is Running:"  + Thread.currentThread().getId());
	}
}
class Zoom1 extends Thread
{
	public void run()
	{
		System.out.println("Zoom is Running:"+  + Thread.currentThread().getId());
	}
}
public class Example1 {

	public static void main(String[] args) {
		Eclipse1 e = new Eclipse1();
		Thread t = new Thread();
		t.start();
		PPT1 p = new PPT1();
		p.start();
		Zoom1 z = new Zoom1();
		z.start();
	}

}

