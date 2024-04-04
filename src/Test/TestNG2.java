package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG2 {
	
	@Test
	public void Demo() {
		System.out.println("The Second Test will start");
		
	}
	@Test (enabled = false)
	public void Execution1() {
		System.out.println("I want to fuck too Hard");
		
	}
	
	@Test 
	public void EDemo() {
		System.out.println("First Month of trading is good I think it easy to make money");
		
	}
	@Test (dataProvider = "getData")
	public void ABCDemo(String username, String Password) {
		System.out.println("Started trading by taking someone calls from telegram");
		System.out.println(username);
		System.out.println(Password);
		
	}
	@Test (dependsOnMethods = {"ABCDemo"})
	public void AA2() {
		System.out.println("I'm very happy with that calls from group");
		
	}
	@DataProvider 
	public Object[][] getData () {
		
		Object [][] data = new Object [3][2];
		
		data[0][0] ="Username";
		data[0] [1]= "Password";
		
		data[1][0] ="Omie";
		data[1][1] ="OmieDon";
		
		data[2][0]= "SUPU";
		data[2][1]= "SUPIDon";
		return data;
				
				
		
	}

}
