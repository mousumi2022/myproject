package classhw;

public class Sumdigit {
	public static void main(String[]args) {
		int a=12345;
		int sum=0;
		int b=0;
		while(a>0) {
			b=a%10;
			sum=sum+b;
			a=a/10;
			
		}
		System.out.println(sum);
	}

}
