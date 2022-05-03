package Exception_Handling;

import java.io.IOException;

class Ruby
	{
		void mymethod(int num) throws Exception
		{
			if(num==1)
				throw new IOException("IOException Occured");
			else
				throw new ClassNotFoundException("ClassNotFoundException");
		}
	}
public class Example8 {

	public static void main(String[] args) {
		try
		{
			Ruby obj = new Ruby();
			obj.mymethod(1);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
