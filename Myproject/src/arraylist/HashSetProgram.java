package arraylist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram {
public static void main(String[]args) {
	HashSet<String> hs=new HashSet<String>();
	hs.add("AM");
	hs.add(null);
	hs.add("PM");
	hs.add(null);
	hs.add("CM");
	hs.add("OF");
	hs.add("PM");
	System.out.println(hs);
	System.out.println(hs.contains("OF"));
	System.out.println("For Loop");
	for(String e:hs) {
		System.out.println(e);
	}
	hs.remove("OF");
	System.out.println(hs);
	
	
	//hs.remove("OF");
		System.out.println("\nADVN for loop");
		
		Iterator<String> it = hs.iterator();                 //String s ="The"
		while(it.hasNext()) {                               // String x = s.concat("City")
		System.out.println(it.next());
		}
		//union - eliminate the common elements
		System.out.println("union");
		HashSet<Integer> s1= new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6));
		HashSet<Integer> s2= new HashSet<Integer>(Arrays.asList(1,3,5,6,0,9));
		
		
		HashSet<Integer> union  = new HashSet<Integer>(s1); 
		union.addAll(s2);
		System.out.println(union);
		
		//intersection -preserve common elements
		System.out.println("Intersection");
		HashSet<Integer> intersec  = new HashSet<Integer>(s1);
		intersec.retainAll(s2);
		System.out.println(intersec);
		
		//difference
		System.out.println("Difference");
		HashSet<Integer> dif  = new HashSet<Integer>(s1);
		dif.removeAll(s2);
		System.out.println(dif);
		
		
		
	}
	
}

