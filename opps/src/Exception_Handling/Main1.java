package Exception_Handling;

public class Main1 {

	public static void main(String[] args) {
		System.out.println("First Line");
		System.out.println("Second Line");
		try {
			int[] myIntArray = new int[] {1,2,3};
			print(myIntArray);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The array doesn't have founth element!");
			
		}
		System.out.println("Third Line");
			
		}
		public static void print(int[] arr)
		{
			System.out.println(arr[3]);
		}
	

}
