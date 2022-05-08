package classhw;

import java.util.Scanner;

public class StringSpace {//String Charater Space
	public static void main(String[]args) {
		System.out.println("Enter the string");
		Scanner input = new Scanner(System.in);
		String s= input.nextLine(); 
		for (int i=0; i<=s.length()-1;i++){     
			
			System.out.print(s.charAt(i)+" ");      
		}
	}

	}


