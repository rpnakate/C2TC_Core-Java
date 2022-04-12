package Abstraction;
abstract class Bank{
	abstract int rateofInterest();
	}
class SBI extends Bank{
	int rateofInterest() {
		return 7;
	}
}
class HDFC extends Bank{
	int rateofInterest() {
		return 8;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		SBI s= new SBI();
		HDFC h = new HDFC();
		h.rateofInterest();
		System.out.println("The rate of interest in SBI:"+" "+s.rateofInterest());
		System.out.println("The rate of interest in HDFC:"+" "+h.rateofInterest());
	}

}
