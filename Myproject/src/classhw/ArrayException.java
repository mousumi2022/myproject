package classhw;

import java.util.Arrays;
//Array Index out of bounds Exception
public class ArrayException {
	public static void main(String[] args) {
		int [] a=new int[5];
		a[0]=10;
		a[1]=20;
		a[3]=30;
		a[4]=40;
		try {
		a[5]=50;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(Arrays.toString(a));
		
		int c=10;
		int b=70;
		System.out.println(c+b);

}
}