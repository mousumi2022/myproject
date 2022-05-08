package classhw;

import java.util.Scanner;

public class GreatestFour {
	

	
		public static void main(String[] args) {
			System.out.println("Enter Four numbers");     
			Scanner input = new Scanner(System.in);
			int a=input.nextInt();
			int b= input.nextInt();
			int c=input.nextInt(); 
			int d=input.nextInt(); 
			
			if(a>b && a>c && a>d) {       
				System.out.println("Greatest number is " + a);}
			else if (b>c && b>a && b>d) {  
				System.out.println("Greatestest number is " + b);}
			else if (c>a && c>b && c>d) {  
				System.out.println("Greatestest number is " + c);}
				else {
					System.out.println("Smallest number is " + d);
			}

	}

	}



