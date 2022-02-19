package generics;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildCardDemo {

	public static void display(List<?> l1) {
		for (Object o : l1) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l1 = Arrays.asList(1, 2, 3);
		System.out.println("display values");
		display(l1);

		List<String> l2 = Arrays.asList("Hi", "How are you");
		System.out.println("display values");
		display(l2);
	}

}
