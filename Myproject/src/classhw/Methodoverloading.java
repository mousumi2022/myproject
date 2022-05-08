package classhw;

public class Methodoverloading {
	public void display() {
		System.out.println("No argument method");
	}
	public void display(int a) {
		System.out.println("Only int");
	}
	public void display(int b,float c) {//Method overloading same method name with different arguments
		System.out.println("Int and Float");
	}
	public void display(float b,int c) {
		System.out.println("Float and int");
	}
	public static void main(String[]args) {
		Methodoverloading m=new Methodoverloading();
		m.display();
		m.display(10);
		m.display(20,78f);
		m.display(78f,45);
		
	}

}
