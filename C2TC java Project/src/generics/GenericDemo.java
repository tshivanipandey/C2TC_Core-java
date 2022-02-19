package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		list.add("India");
		list.add("Koria");

		String country = list.get(0);
		System.out.println("element is " + country);

		Iterator<String> itr = list.iterator();
		while (itr.hasNext())
			System.out.println();
	}

}
