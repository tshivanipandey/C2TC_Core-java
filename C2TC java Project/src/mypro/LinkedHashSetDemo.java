package mypro;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 LinkedHashSet set=new LinkedHashSet();  
         set.add("MY");    
         set.add("Two"); 
         set.add("Three");   
         Iterator<String> i=set.iterator();  
         while(i.hasNext())  
         {  
         System.out.println(i.next());  
         }  
         LinkedHashSet set1=new LinkedHashSet(); 
         set1.add(123);  
         set1.add(456);  
         
         Iterator<Integer> i1=set1.iterator();  
         while(i1.hasNext())  
         {  
         System.out.println(i1.next());  
         }  
	}


}
