package classhw;

import java.util.Scanner;

public class SmallerThree {
	public static void main(String[] args) {
		System.out.println("Enter three numbers");     
		Scanner input = new Scanner(System.in);
		int a=input.nextInt();
		int b= input.nextInt();
		int c=input.nextInt(); 
		
		if(a<b&&a<c) {       
			System.out.println("Smallest number is " + a);
		}
		else if (b<c && b<a) {  
			System.out.println("Smallest number is " + b);}
			else {
				System.out.println("Smallest number is " + c);
		}

}

}
