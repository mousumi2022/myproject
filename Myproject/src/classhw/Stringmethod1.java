package classhw;

public class Stringmethod1 {
	public static void main(String[] args) {
		String s ="HEllo ";
		System.out.println(s.hashCode());
		s=s.concat("Thilak");
		System.out.println(s);
		System.out.println(s.hashCode());
	}

}
