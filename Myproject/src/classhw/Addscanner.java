package classhw;
import java.util.Scanner;

public class Addscanner {
public static void main(String[]args) {
	Scanner input=new Scanner(System.in); //instatiate
	
	System.out.println("Enter the value of a:");
	int a=input.nextInt();
	System.out.println("Enter the value of b:");
	int b=input.nextInt();
	int c=a+b;
	System.out.println("Result:"+ c);
	
}
}
