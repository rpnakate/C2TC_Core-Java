package Enum;

public class Example {
	public enum Season {
		SUMMER,WINTER,SPRING,AUTUMN
	}

	public static void main(String[] args) {
		Season s = Season.AUTUMN;
		System.out.println(s);
		System.out.println(Season.WINTER);

	}

}
