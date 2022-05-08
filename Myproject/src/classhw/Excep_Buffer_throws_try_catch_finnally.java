package classhw;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Excep_Buffer_throws_try_catch_finnally {
	public static void main(String[] args) throws Exception     {
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("Enter the value");
		try {
		String s= br.readLine();   
		int a;
		a=Integer.parseInt(s);
		System.out.println(a);
		if(a>10) {
			throw new Exception();
		}
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			br.close();
			System.out.println("End of program");
		}
		
		
	}

}
