package testscriptsample;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages1.LoginPageSample;



public class LoginPageTestSample extends BaseSample  {
	  @Test
	  public void verifyUserLoginwithvalidcredentials() {
		  LoginPageSample login=new LoginPageSample(driver);
		  String username="carol";
		  String password="1q2w3e4r";
		  login.enterUsername(username);
		  login.enterPassword(password);
		  login.clickonloginbutton();
		  boolean  actualresult=login.ishomepageIsloaded();
		  
		  
		  boolean expectedresult=true;
		  Assert.assertEquals(expectedresult,actualresult,"login failed for valid credentials");
		  
	  }
}