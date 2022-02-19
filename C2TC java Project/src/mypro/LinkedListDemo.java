package mypro;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l2=new LinkedList();
		l2.add(new Integer(10));
		l2.add("Hi");
		l2.add("Hiii");
		l2.addFirst("Hello");
		l2.add(0,20);
		l2.add(2,30);
		Iterator i2=l2.iterator();
		while(i2.hasNext())
		{
			Object o=i2.next();
			System.out.println(o);
		}
		

	}

}
