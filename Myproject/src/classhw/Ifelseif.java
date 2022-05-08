package classhw;

import java.util.Scanner;

public class Ifelseif {
	public static void main(String[] args) {
		System.out.println("Enter three numbers");     
		Scanner input = new Scanner(System.in);
		int a=input.nextInt();
		int b= input.nextInt();
		int c=input.nextInt(); 
		
		if(a>b&&a>c) {       
			System.out.println("Greatest number is " + a);
		}
		else if (b>c && b>a) {  
			System.out.println("Greatest number is " + b);}
			else {
				System.out.println("Greatest number is " + c);
		}

}
}