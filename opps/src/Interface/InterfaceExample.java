package Interface;
interface Vehicle{
	void Engine();
}
interface Ride extends Vehicle{
	void getMileage();
}
class d implements Ride{
	public void Engine() {
		System.out.println("Liquid-cooled SOHC 4-valve fuel-injected engine");
		
	}
	public void getMileage() {
		System.out.println("Mileage is 60 Km/L");
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		d bike = new d();
		bike.getMileage();
		bike.Engine();

	}

}
