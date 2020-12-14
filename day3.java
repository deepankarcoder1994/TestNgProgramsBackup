package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {

	
	  //Before Suite => Before Suite will execute before any other Test Case
	 // defined in testng.xml
	 
	 @BeforeSuite public void demosuite() {
	  System.out.println("I am No.1 in execution"); }
	 
	  @Test public void WebloginCarLoan() { //selenium
	  System.out.println("WebLoginCar"); }
	 
	  
	  @Test(groups={"Smoke"}) public void MobileLoginincarLoan() { //Appium
	  System.out.println("MobileLoginCar"); }
	  
	  
	  @Test(dependsOnMethods={"WebloginCarLoan"}) public void LoginAPIcarLoan() {
	  //restapi automation System.out.println("APILoginCar"); 
		  }
	  
	  @Test 
	  public void MobileDemo() {
	  System.out.println("Deepankar is testing some mobile features!"); 
	  Assert.assertTrue(false);
	  }
	  
	  //Scope of this annotation only belongs to current class where it is defined
	  
	  @BeforeMethod public void beforeevery() { System.out.
	  println("I will execute before every test method in day3 class only"); }
	 
	 
	  //Scope of this annotation only belongs to current class where it is defined
	  
	  @AfterMethod public void afterevery() { System.out.
	  println("I will execute after every test method in day3 class only"); }
	 

	// Data Provider Annotation
	@DataProvider
	public Object[][] getData() {
		// 1st combination -- username and password -- good credit history
		// 2nd -- No Credit History
		// 3rd -- fraudelant credit history

		Object[][] data = new Object[3][2];

		// 1st set data
		data[0][0] = "firstsetusername";
		data[0][1] = "firstpassword";
		// columns in the row are nothing but values for that particular combination.

		// 2nd Set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";

		// 3rd Set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";

		return data;
	}

	@Test(dataProvider = "getData")
	public void MobilesignoutcarLoan(String username, String password) {
		System.out.println("Inside Mobile Signout method");
		System.out.println(username);
		System.out.println(password);
	}

}
