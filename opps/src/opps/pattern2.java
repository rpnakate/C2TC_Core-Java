package opps;

public class pattern2 {

	public static void main(String[] args) {
		int n=3,stars;
		for(int i=n;i>=1;i--)
		{
			stars = n-i;
			for(int j=0;j>stars;j++)
			{
				System.out.println("*");
			}
			System.out.println("\n");
		}

	}

}
