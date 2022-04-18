package Interface;
interface Writeable{
	void writes();
}
interface Readable{
	void reads();
}
public class Students1 implements Readable,Writeable
{
	public void reads()
	{
		System.out.println("Student reads....");
	}
	public void writes()
	{
		System.out.println("Student writes...");
	}

	public static void main(String[] args) {
	Students1 s = new Students1();
	s.reads();
	s.writes();
	}

}
