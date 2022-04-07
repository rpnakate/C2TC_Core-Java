package example.com;
class use{
	
	use(){
		
		this(5);
		System.out.println("Hello Students");
	}
	use(int x){
		this(6,7);
		System.out.println(x);
	}
	use(int x,int y){
		System.out.println(x+" "+y);
	}
}
public class Demo3 {

	public static void main(String[] args) {
		use d = new use();

	}

}
