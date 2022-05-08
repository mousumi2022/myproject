package classhw;

public class TwoDArray {
	public static void main(String[]args) {//Two dimensional array
		int d[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		for(int i=0;i<d.length;i++) {
			for(int j=0;j<d.length;j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
