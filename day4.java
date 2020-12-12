package test;

import org.testng.annotations.Test;

public class day4 {
	
	@Test
	public void WebloginHomeLoan() {
		//selenium
		System.out.println("WebLoginhome");
	}
	
	
	@Test(groups={"Smoke"})
	public void MobileLoginHomeLoan() {
		//Appium
		System.out.println("MobileLoginhome");
	}
	
	
	@Test
	public void LoginAPIHomeLoan() {
		//restapi automation
		System.out.println("APILoginhome");
		
	}

}
