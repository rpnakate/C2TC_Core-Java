package Regexp;

import java.util.regex.Pattern;

public class Example {
	public static void main(String args[]){ 
		 System.out.println(Pattern.matches(".s", "as")); 
		 System.out.println(Pattern.matches(".s", "mk")); 
		 System.out.println(Pattern.matches(".s", "mst")); 
		 System.out.println(Pattern.matches(".s", "amms")); 
		 System.out.println(Pattern.matches("..s", "mas")); 
		}

}
