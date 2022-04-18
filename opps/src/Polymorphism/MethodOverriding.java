package Polymorphism;
class Vehicle{
	void run() {
		System.out.println("Vehicle is running...");
	}
}
class Bike extends Vehicle{
	void run() {
		System.out.println("Bike is Running...");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.run();

	}

}
