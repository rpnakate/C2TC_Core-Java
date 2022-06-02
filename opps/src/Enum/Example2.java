package Enum;

public class Example2 {
	public enum Season {
		SUMMER,WINTER,SPRING,AUTUMN
	}

	public static void main(String[] args) {
		for ( Season s : Season.values())
		{
			System.out.println(s);
		}
		System.out.println("Value of WINTER is : "+Season.valueOf("WINTER"));
		System.out.println("INDEX of WINTER is : "+Season.valueOf("WINTER").ordinal());
		System.out.println("INDEX of SUMMER is : "+Season.valueOf("SUMMER").ordinal());


	}

}
