package Practice;

public class Banana {

	public static void main(String[] args) {
		int n = 20; //no of monkeys
		int k = 2; // no. of eatable bananas
		int j = 3; // no. of eatable peanuts
		int m = 12;// no. of bananas
		int p = 12;// no. of peanuts
		float eatbanana = 0, eatpeanut = 0;
		if(k<0 || j<0) 
		{
			System.out.println("Invalid Input");
					}
		else
		{
			if(k>0)
				eatbanana = m/k;
			if(j>0)
				eatpeanut = p/j;
			if(m%k > 0 || p%j > 0)
				n= (int) (n-eatbanana - eatpeanut-1);
			else
				n= (int) (n-eatbanana - eatpeanut);		
		}
		System.out.println("The number of monkeys Left on the ground:" +n);
	}
}



