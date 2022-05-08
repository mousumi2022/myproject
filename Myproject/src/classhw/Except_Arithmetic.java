package classhw;

public class Except_Arithmetic {
	public static void main(String[] args) {

		int j = 8;
		int k = 0;
		int result;
		
		try{
			result=j/k;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		int a = 10;
		int b = 30;
		System.out.println("Addition:" + (a + b));

	}
}
