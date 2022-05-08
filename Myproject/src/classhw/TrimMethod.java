package classhw;

public class TrimMethod {//Trim method in Strings
	public static void main(String[] args) {
		String s = "  hi hello  ";
		System.out.println(s.length()); //12
		String s3 = s.trim();
		System.out.println(s3.length()); //8

}
}
