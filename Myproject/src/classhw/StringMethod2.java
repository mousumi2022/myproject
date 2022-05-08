package classhw;

public class StringMethod2 {
	public static void main(String[]args) {
	String s= "thilak";      
	//System.out.println(s.hashCode());
	s=s.concat("Hi");
	System.out.println(s);
    //System.out.println(s.hashCode());
	String s1="Thilak";
	System.out.println(s.equals(s1)); 
	System.out.println(s.equalsIgnoreCase(s1));
	System.out.println(s.substring(0, 5)); // thila     
	System.out.println(s.substring(4)); //         
	System.out.println(s.indexOf('a')); 
	System.out.println(s.indexOf('q')); 
	System.out.println(s.lastIndexOf('a'));    
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
}
}
