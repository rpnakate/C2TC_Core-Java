package MultiThreading;

class Sandy implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		System.out.println("Sandy is Running:" +Thread.currentThread().getId());
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Catch is Running");
		}
	}
}
public class Example3 {

	public static void main(String[] args) {
		Sandy s = new Sandy();
		Thread t = new Thread(s);
		t.start();

	}

}
