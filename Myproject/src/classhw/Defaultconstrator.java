package classhw;

public class Defaultconstrator {
	int roll;
	int sal;
	String ceo;
	
	public Defaultconstrator() {//default constrator
		roll=10;
		sal=1000;
		ceo="Mou";
		
	}
	public void display() {
		System.out.println(roll+" "+sal+" "+ceo);
	}
	public static void main(String[]args) {
		Defaultconstrator raju=new Defaultconstrator();
		raju.display();
		
		
	}

}
