package classhw;

public class Mathsmethod {
	public void add() {//no return type no argument
		int a=10;
		int b=10;
		int c=a+b;
		System.out.println("Sum:"+c);
			
	}
	public void sub(int x,int y) {//no return type with arguments
		int z=x-y;
		System.out.println("Subtraction:"+z);
		
	}
	 
	public int mul(int d,int e) {//with return type and with arguments
		int f=d*e;
		return f;
		
	}
	public int div(){//with return type and no argument
		int t=20;
		int y=2;
		int u=t/y;
		return u;
	}
	public static void main(String[]args) {
		Mathsmethod p=new Mathsmethod();
		p.add();
		p.sub(10,2);
		System.out.println("Multiplication:"+p.mul(20,10));
		System.out.println("Division:"+p.div());
		
	}

}
