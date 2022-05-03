package Collections_Framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

public class Example1 {

	public static void main(String[] args) {
		Collection list = new ArrayList();
		list.add(100);
		list.add(10);
		list.add(1000);
		list.add("Webinar");
		ListIterator e = (ListIterator) list.iterator();
		while(e.hasNext())
		{
			System.out.println(e.next());
		}

	}

}
