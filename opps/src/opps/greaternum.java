package opps;

public class greaternum {
	public static void main(String[]args)
	{
	int a=15, b=25, c=100;
	if((a>b)&&(a>c))
	System.out.println("The Greater Number :" +a);
	else if((b>a)&&(b>c))
		System.out.println("The Greater Number:"+b);
	else if((c>a)&&(c>b))
		System.out.println("The Greater Number:"+c);

}
}