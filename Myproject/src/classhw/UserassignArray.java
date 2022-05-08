package classhw;

import java.util.Arrays;
import java.util.Scanner;

public class UserassignArray {//User assign arrays
public static void main(String[]args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Length of array:");
	int n=input.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter the Element for array:");
	for(int i=0;i<arr.length;i++){
		arr[i]=input.nextInt();
	}
	System.out.println("The given array:");
	System.out.println(Arrays.toString(arr));
}

}
