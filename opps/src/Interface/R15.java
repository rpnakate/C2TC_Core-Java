package Interface;
interface Bike
{
	void getMileage();
}

 class R16 implements Bike
{
	public void getMileage()
	{
		System.out.println("Mileage is 50 Km/L");
	}
}	
	public class R15{
	public static void main(String[] args) {
    R16 bike = new R16();
    bike.getMileage();
	}
	
}
