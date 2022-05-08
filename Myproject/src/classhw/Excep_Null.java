package classhw;

public class Excep_Null {
	public static void main(String [] args) {

		
		String s=null;
		try {
		
		System.out.println(s.length()); // 
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		String s1 = "Thilak";
		System.out.println(s1);
}
}

