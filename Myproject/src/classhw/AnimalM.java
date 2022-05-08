package classhw;

public class AnimalM {
	

		public static void main(String[] args) {
			
			Animal ob = new Lion(); 
			
			ob.bite();//Overriding child method gets Priority
			ob.eat();
			
			
		}
}
