package testngbasic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annot {
	@BeforeSuite
public void BSuit() {
	System.out.println("Befor Suite");
}
	@BeforeMethod
	public void Bmeth() {
		System.out.println("Before Method");
	}
	
	@BeforeClass
	public void Bclas() {
		System.out.println("Before Class");
	}
	@BeforeTest
public void BTest() {
	System.out.println("Before Test");
}
	
	
	@Test
public void test1() {
	System.out.println("TEST 1");
}
	
	@Test
	public void Tc2() {
		System.out.println("Test 2");
	}
	@AfterMethod
	public void Ameth() {
		System.out.println("After Method");
	}
	
	@AfterSuite
	public void ASuit() {
	System.out.println("After Suite");	
	}
	
	@AfterTest
	public void ATest() {
		System.out.println("After test");
	}
	
	@AfterClass
	public void AClass() {
		System.out.println("After class");
	}
	
}
