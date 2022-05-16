package MultiThreading;

class Amol implements Runnable
{
	public void run()
	{
		System.out.println("Amol is Running:" + Thread.currentThread().getId());
	}
}
class Gopal implements Runnable
{
	public void run()
	{
		System.out.println("Gopal is Running:" + Thread.currentThread().getId());
	}
}
class Rakesh implements Runnable
{
	public void run()
	{
		System.out.println("Rakesh is Running:" + Thread.currentThread().getId());
	}
}
public class Example2 {

	public static void main(String[] args) {
		Amol a= new Amol();
		Thread t = new Thread(a);
		t.start();
		Gopal g= new Gopal();
		Thread t1 = new Thread(g);
		t1.start();
		Rakesh r= new Rakesh();
		Thread t2 = new Thread(r);
		t2.start();

	}

}
