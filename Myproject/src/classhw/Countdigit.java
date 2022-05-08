package classhw;

public class Countdigit {
	public static void main(String[]args) {
		int a=1234567891;
		//Counting the digits
		int b=0;
		int i=0;
		while(a>0) {
			b=a%10;
			a=a/10;
			i=i+1;
			
		}
		System.out.println(i);
	}
}
