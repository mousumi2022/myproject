package testngbasic;

import org.testng.annotations.Test;

public class Add {
	int a=0;
	int b=0;
public static void main(String args[]) {
	
	addng(5,5);
	
}
@Test
public static void addng(int a,int b) {
	int sum=0;
	sum=a+b;
	System.out.println(sum);
	
}

}
