package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	
	@Parameters({"URL"})
	@Test
	public void catchParameters(String urlName) {
		System.out.println(urlName);
	}
	
	@Test(groups={"Smoke"})
	public void ploan() {
		System.out.println("good");
	}
	
	
   @BeforeTest
   public void prerequiste() {
	   //You can write DB cleanup operation here
	   System.out.println("I will execute first");
   }
   
   
   @BeforeClass
   public void beforeClass() {
	   System.out.println("Before executing any any method in the class");
   }
   
   @AfterClass
   public void afterClass() {
	   System.out.println("After executing any any method in the class");
   }
   

}
