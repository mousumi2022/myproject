package classhw;

public class OneDArray {
	public static void main(String[]args) {//one dimension Array
		int[] arr=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
			
		}
		System.out.println(" ");
		System.out.println("----------------");
		for(int a:arr) {//other way for array display
			System.out.println(a+" ");
		}
		
	}

}
