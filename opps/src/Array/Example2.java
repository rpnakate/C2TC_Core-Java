package Array;

public class Example2 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		int a = 50;
		call(a,arr);
		System.out.println(a);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}
	private static int call(int a, int[] arr) {
		a = a+2;
		arr[0] = 100;
		arr[1] = 200;
		return a;
		
	}

}
