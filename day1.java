package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;

/*
 * 
 * Test-NG frameworks Basics
 */

import org.testng.annotations.Test;

public class day1 {
	
	@Parameters({"URL1","APIKey/username"})
	@Test
	public void MultipleParameterCatch(String urlName1,String key) {
		System.out.println(urlName1);
		System.out.println(key);
	}
	
	
	@Parameters({"URL1"})
	@Test
	public void LocalParameterCatch(String urlName1) {
		System.out.println(urlName1);
	}
	
	@AfterSuite
	public void AfterSuiteDemo() {
		System.out.println("I am the last among everybody");
	}
	
	@AfterTest
	public void lastexecution() {
		System.out.println("I will execute last!");
	}
	
	@Test(timeOut = 4000)
	public void Demo() {
		System.out.println("hello");
	}
	
	@Test
	public void SecondTest() {
		System.out.println("Bye");
	}

}
