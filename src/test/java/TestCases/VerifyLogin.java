package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;
import PageObjectModel.LoginPageObject;
import Resources.Constant;
import Resources.baseClass;
import Resources.emailGeneration;
import PageObjectModel.CommonMethod;
  
public class VerifyLogin extends baseClass{
	
	 public LoginPageObject LPO;
	/*@Test
	public void Invalidlogin() throws IOException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 LPO=new LoginPageObject(driver);
		 LPO.clickOnMyAccount().click();
		 LPO.clickOnLogin().click();
		 LPO.EntreEmail().sendKeys(Constant.Email);
		 LPO.EntrePassword().sendKeys(Constant.Password);
		 LPO.clickOnSubmit().click();
		 //LPO.clickOnWarning().click();
		 String actualText=LPO.clickOnWarning().getText();
	   	 String ExpectedText=Constant.loginWarningMessage;
	   	CommonMethod.handleAssersions(actualText,ExpectedText, "Error massage is not match");
	   	
	}*/
	@Test
	public void Validlogin() throws IOException {
		 LPO=new LoginPageObject(driver);
		 LPO.clickOnMyAccount().click();
		 LPO.clickOnLogin().click();
		
		 LPO.EntreEmail().sendKeys(VerifyRegester.email);
		 LPO.EntrePassword().sendKeys(Constant.vrPass);
		 LPO.clickOnSubmit().click();
		
		
	   	
	}
	
	
}
