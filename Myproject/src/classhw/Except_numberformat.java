package classhw;

public class Except_numberformat {
	public static void main(String[]args) {
String s="samm";
	
	int a=0;
	try {
	a=Integer.parseInt(s);
	}
	catch (Exception e) {
		System.out.println(e);
	}
	
	System.out.println(a+10);
	}
}
