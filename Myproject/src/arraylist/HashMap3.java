package arraylist;

import java.util.HashMap;

public class HashMap3 {
	public static void main(String [] args) {
			HashMap<object> hm = new HashMap<object>();
			hm.put(01, "Thi");
			hm.put("B", 100);
			hm.put("C","Aks");
			hm.put("D",1);
			hm.put("A", "Ram");
			hm.put("A", "laks");
			Set<Object> s =hm.entrySet();
			Iterator<Object> it= s.iterator();
			while(it.hasNext()) {
					Entry e =(Entry)it.next();
					System.out.print(e.getKey()+ " ");
					System.out.println(e.getValue());
								
							 }

		}
	}
