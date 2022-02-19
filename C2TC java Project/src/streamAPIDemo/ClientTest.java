package streamAPIDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] values=new Integer[] {10,20,30};
		
		List<String> l1=new ArrayList<String>();
		l1.add("Java");
		l1.add("Python");
		l1.add("C++");
		
		System.out.println("Array elements");
		Stream<Integer> stream=Arrays.stream(values);
		stream.forEach(System.out::println);
		
		System.out.println("---------------");
		System.out.println("List elements");
		Stream<String> stream1=l1.stream();
		stream1.forEach(System.out::println);
		
		Stream<String> stream2=Stream.of("A","B","C","D");
		System.out.println("------------------");
		System.out.println("Stream elements");
		stream2.forEach(System.out::println);
	}

}
