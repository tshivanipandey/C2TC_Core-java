package mypro;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs=new HashSet<String>();
		hs.add("Hash");
		hs.add("Set");
		hs.add("Demo");
		hs.add("Demo"); //it is not in sorted order (as u have entered ) because 
		
		
		TreeSet<String> ht=new TreeSet<String>();
		ht.add("Hash");
		ht.add("Set");
		ht.add("Demo");
		ht.add("Demo"); // doesn't allow duplicate value 
		
		TreeSet<Integer> hs1=new TreeSet<Integer>();
		hs1.add(22);
		hs1.add(10);
		
		Iterator i=ht.iterator();
		Iterator j=hs.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			Object o1=j.next();
			System.out.println(o);
		}
		
		
	}

}
