package Enum;

public class Example3 {
	public enum Season {
		SUMMER(10),WINTER(5),SPRING(15),AUTUMN(20);
		int value;
		Season(int value)
		{
			this.value=value;
		}
	}
	public static void main(String[] args) {
		for (Season s : Season.values())
		{
			System.out.println(s+" "+s.value);
		}

	}

}
