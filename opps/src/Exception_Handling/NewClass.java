package Exception_Handling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListToolLargeException extends RuntimeException
{
	ListToolLargeException(String message)
	{
		System.out.println(message);
	}
}
public class NewClass {
	public void analyze(List<String>data)
	{
		if(data.size()>50)
		{
			throw new ListToolLargeException("List can't exceed 50 items!");

		}
		
	}

	public static void main(String[] args) {
		NewClass obj = new NewClass();
		List<String>data=new ArrayList<>(Collections.nCopies(100, "Customers Details"));
		obj.analyze(data);

	}

}
