package arraylist;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[]args) {
	ArrayList<Object> ls =new ArrayList<Object>();
	ls.add(100);
	ls.add(true);
	ls.add(null);
	ls.add(100);
	System.out.println(ls);
	System.out.println(ls.size());
	ls.remove(3);
	System.out.println(ls.isEmpty());
	System.out.println(ls.contains(100));
	System.out.println("-------------------------");
	ArrayList<Object> ls1=new ArrayList<Object>();
	ls1.add(200);
	ls1.add(300);
	ls1.add(400);
	ls1.addAll(ls);
	System.out.println(ls1);
	ls1.add(3,"Mithun");
	System.out.println(ls1);
	ls1.set(3, "sakhi");
	System.out.println(ls1);
	System.out.println("----------------------");
	// add collection in specific index
			ls.addAll(3, ls1);
			System.out.println(ls);
			ls.removeAll(ls1);
			
			System.out.println(ls);
		System.out.println(ls.indexOf("THILAK")>0);
		System.out.println(ls.containsAll(ls1));
		System.out.println(ls.contains(100));


			
	
	
	
	}	

}
