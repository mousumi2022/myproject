package classhw;

public class calloldmethod {
	int roll;
	int sal;
	String ceo;
	public void display() {
		System.out.println(roll+" "+sal+" "+ceo);
	}
	public static void main(String[]args) {
		calloldmethod raju=new calloldmethod();
		raju.roll=10;
		raju.sal=1000;
		raju.ceo="Mou";
		raju.display();
		
		calloldmethod bala=new calloldmethod();
		bala.roll=20;
		bala.sal=2000;
		bala.ceo="Rinku";
		bala.display();
		
		
	}
}
