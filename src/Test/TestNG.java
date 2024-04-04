package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeSuite
	public void FDemo4() {
		System.out.println("Im the Superior one in 1st Execution ");
		
	}
	@AfterSuite
	public void KDemo4() {
		System.out.println("Im the Superior one in last Execution ");
		
	}
	
	@BeforeTest
	public void Demo4() {
		System.out.println("The Before Test will execute ");
		
	}
	

	@BeforeClass
	public void GDemo() {
		System.out.println("The Before Class execute now");
		
	}
	
	@BeforeMethod
	public void Demo() {
		System.out.println("The Before method will execute first");
		
	}
	@Test
	public void ADemo1() {
		System.out.println("The Test will rest in between");
		
	}
	@Parameters ({"URL","Year"})
	@Test
	public void CDemo3(String URLname, String Year) {
		System.out.println("The Test will run which include in xml file");
		System.out.println(URLname);
		System.out.println("This is my "+Year+" year");
	}

	@Test 
	public void LLDemo() {
		System.out.println("Then after 3-4 months I thinking of quit trading");
		
	}
}
