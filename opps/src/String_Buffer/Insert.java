package String_Buffer;

public class Insert {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Hello");
		StringBuffer s2 = new StringBuffer("Hello");
		s1.insert(1,"JAVA");
		System.out.println("The Insert method Output :" + s1);
		s2.replace(1, 3, "JAVA");
		System.out.println("The Replace Method Output :" + s2);
		

	}

}
