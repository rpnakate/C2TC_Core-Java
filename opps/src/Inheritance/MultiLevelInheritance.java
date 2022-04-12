package Inheritance;
class Animal1{
	void eat() {
		System.out.println("Eating...!");
	}
}
class dog1 extends Animal1{
	void bark() {
		System.out.println("Barking...!");
	}
}
class puppy extends dog1{
	void weep() {
		System.out.println("Weeping...!");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		puppy p = new puppy();
		p.weep();
		p.bark();
		p.eat();
	}

}
