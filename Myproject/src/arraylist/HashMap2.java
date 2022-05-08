package arraylist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap2 {
public static void main(String[]args) {
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(1, "Tilaka");
	hm.put(2, "ABC");
	hm.put(3, "XYZ");
	hm.put(4, "ZPW");
	hm.put(5, "Tilaka");
	
//	Set<Integer> s= hm.keySet();
	 
	/*	Iterator it= s.iterator();
		while(it.hasNext()) {
			int key =(int) it.next();               
			String value = hm.get(key);               
			System.out.println(key + " " + value); 
		}
		
		*/
		
		Set<Integer> s = hm.keySet();
		      Iterator<Integer>  it  =s.iterator();
		     while(it.hasNext()) {
		            int key = (int) it.next();
		  			String value =hm.get(key);
		  			System.out.println(key + "  " + value);
		    	              
		     }              
}
	
	
	
	
}

