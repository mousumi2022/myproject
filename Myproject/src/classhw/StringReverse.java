package classhw;

import java.util.Scanner;

public class StringReverse {
public static void main(String[]args) {
	{
		System.out.println("Enter the string");
		Scanner input = new Scanner(System.in);
		String s= input.next();
		char c[] = s.toCharArray();       
		for(int i=c.length-1;i>=0;i--) {  
			System.out.print(c[i]);         
		}
	
}
}
}
