package classhw;

public class parameterisedConstrator {
	int roll;//instance variable
	int sal;
	String ceo;
	
	public parameterisedConstrator(int roll,int sal,String ceo) {//Parameterised Constructor
		this.roll=roll;
		this.sal=sal;
		this.ceo=ceo;
		
	}
	public void display() {
		System.out.println(roll+" "+sal+" "+ceo);
	}
	public static void main(String[]args) {
		parameterisedConstrator raju=new parameterisedConstrator(10,1000,"Mou");
		raju.display();
		
		
	}
}
