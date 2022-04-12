package Scanner;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	System.out.println("Enter Ur Name:");
	Scanner a = new Scanner(System.in);
    String name = a.nextLine();
    System.out.println("Enter Ur Middle Name:");
    String name1 = a.nextLine();
    System.out.println("Enter Ur Last Name:");
    String name2 = a.nextLine();
    System.out.println("Ur Full Name is:"+name+" "+name1+" "+name2);
	}

}
