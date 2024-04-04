package ReTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG4 {
	
	@Parameters({"URL","Year"})
	@Test
	public void Demo(String URLname, String Year) {
		System.out.println("Test Case 4 is executeed Now");
		System.out.println(URLname);
		System.out.println("This is my "+Year+" year");
	}

}
