package Collection_interface;

import java.util.ArrayList;
import java.util.List;

public class Contain {

	public static void main(String[] args) {
		List<String> var = new ArrayList<String>(); 
		 var.add("pen"); 
		 var.add("pencil"); 
		 var.add("eraser");
		 System.out.println("List " +var);
		 boolean res= var.contains("pencil");
		 System.out.println("Is pencil present in the list: " + res); 
	}

}
