package String_Buffer;

public class Justification {

	public static void main(String[] args) {
		String s = "Study";
		String s1 =s.concat("Night");
		System.out.println("The String OutPut is : " + s);
		//Mutable
		StringBuffer s2 = new StringBuffer("Study");
		s2.append("Night");
		System.out.println("The StringBuffer Output is : " + s2);

	}

}
