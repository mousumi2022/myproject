package classhw;

public class StringBufferMethods {
	public static void main(String[]args) {
	StringBuffer sb= new StringBuffer("raja how are u");
	System.out.println(sb.substring(1));
	System.out.println(sb.subSequence(0, 4));
	System.out.println(sb.insert(2, "@@"));
	System.out.println(sb.replace(0, 2,"hi"));  
	System.out.println(sb);
	System.out.println(sb.indexOf("how"));
	System.out.println(sb.reverse());
	}

}
