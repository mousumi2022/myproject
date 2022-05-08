package classhw;

import java.util.Scanner;

public class Ifelse {
	public static void main(String[] args) {
		
		System.out.println("Enter the age");
		Scanner input = new Scanner(System.in);
		int age=input.nextInt();
		if(age>18) {
			System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("not eligible to vote");
		}
	}
}
