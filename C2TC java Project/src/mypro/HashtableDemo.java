package mypro;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		//ht.put(null, null);
		//ht.put(2, null);
		//ht.put(null, "Hello");
		ht.put(1, "Hi its me");
		ht.put(1, "Hi its me");
		ht.put(2, "Hi its me");
		ht.put(2, "Hi ");
		 for(Map.Entry m:ht.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  
		
	}

}
