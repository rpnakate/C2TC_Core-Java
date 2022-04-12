package Inheritance;
class Animal2{
	void eat() {
		System.out.println("Eating..!");
	}
}
class Horse extends Animal2{
	void bark() {
		System.out.println("Barking...!");
	}
}
class Cat extends Animal2{
	void meow() {
		System.out.println("Meowing...!");
	}
}

public class HierachicalInheritance {

	public static void main(String[] args) {
		Horse h=new Horse();
		h.bark();
		h.eat();
		
		Cat c=new Cat();
		c.meow();
		c.eat();
	}

}
