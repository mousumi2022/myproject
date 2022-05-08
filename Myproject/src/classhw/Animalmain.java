package classhw;

//import classhw.AnimalInheritance.lion;

public class Animalmain {
public static void main(String[] args) {
		
		AnimalInheritance a =  new AnimalInheritance();  // p
		a.bite();
		a.eat();
		lion l=new lion();//c
		l.roar();
		AnimalInheritance o=new lion();//Top casting 
		o.bite();//can't see lion method.Only can see AnimalInheritance methods.
		o.eat();
		//o.roar();
		
}
}