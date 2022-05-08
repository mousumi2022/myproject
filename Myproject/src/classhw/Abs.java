package classhw;

//Abstract 
	abstract class Abs {                        
		public abstract void meth1();
		public abstract void meth2();
		public void display() {
			System.out.println("hello");
		}
	 }	
	 
	 class April extends Abs{
		 public void meth1() {
			 System.out.println("Inside meth1");
		 }
		 public void meth2() {
			 System.out.println("Inside meth2");
		 }
		 
	 }

