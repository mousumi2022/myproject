package newObjectPageModelProperty;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OldTest4 extends UtilityFile4 {
	

		@BeforeTest
		public void setup() {
		driver=dolaunchBrowser("chrome");
		driver.get(getpropvalue("URL"));
		max();
		impl();
		}
		@Test(priority=1)
		public void Tc1() {
		
		Old4Page s = new Old4Page(driver);
		s.doradio();
		}
		@Test(priority=2)
		public void Tc2() throws Exception {
			
		Old4Page s = new Old4Page(driver);
		s.dofnam(getExceldata("register",0,0));
		}
		@Test(priority=3)
		public void Tc3() throws Exception {
	
		Old4Page s = new Old4Page(driver);	
		s.dolnam(getExceldata("register",0,1));
		}
		@Test(priority=4)
		public void Tc4() throws Exception {
	
		Old4Page s = new Old4Page(driver);	
		s.doDrag(getExceldata("register",0,2));
		}
		@Test(priority=5)
		public void Tc5() throws Exception {
	
		Old4Page s = new Old4Page(driver);	
		s.doDrag1(getExceldata("register",0,3));
		}
		@Test(priority=6)
		public void Tc6() throws Exception {
	
		Old4Page s = new Old4Page(driver);	
		s.doDrag2(getExceldata("register",0,4));
		}
		//@AfterTest
		//public void teardown() {
			//driver.close();
			
		//}
}
