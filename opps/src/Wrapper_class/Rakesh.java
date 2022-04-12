package Wrapper_class;

public class Rakesh {

	public static void main(String[] args) {
		byte b=10;
		short s=20;
		int i = 30;
		long l =40;
		float f = 50.0f;
		double d = 60.0d;
		char c = 'a';
		boolean b2 = true;
//Autoboxing: Converting primitives into objects
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean boolobj=b2;
		System.out.println("---Printing object value---");
		System.out.println("Byte object:"+byteobj);
		System.out.println("Short Object:"+shortobj);
		System.out.println("Integer Object:"+intobj);
		System.out.println("Long Object:"+longobj);
		System.out.println("Float Object:"+floatobj);
		System.out.println("Double Object:"+doubleobj);
		System.out.println("Character Object:"+charobj);
		System.out.println("Boolean Object:"+boolobj);

 
	}

}
