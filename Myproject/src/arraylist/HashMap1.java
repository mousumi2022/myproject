package arraylist;

import java.util.HashMap;

public class HashMap1 {
public static void main(String[]args) {
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(1, "Mou");
	hm.put(2, "XYZ");
	hm.put(3, "CVB");
	hm.put(4, "OPY");
	hm.put(5, "Mou");
	hm.put(null, "SAM");
	hm.put(5, "JOS");
	//hm.clear();
	System.out.println(hm);
	System.out.println(hm.get(1));
	
	
}
}
