package TestCases;

import java.io.IOException;


import org.testng.annotations.Test;
import PageObjectModel.LoginPageObject;
import Resources.Constant;
import Resources.baseClass;

import PageObjectModel.CommonMethod;
  
public class VerifyLogin extends baseClass{
	
	 public LoginPageObject LPO;
	
	@Test
	
	public void Validlogin() throws IOException {
		 LPO=new LoginPageObject(driver);
		 LPO.clickOnMyAccount().click();
		 LPO.clickOnLogin().click();
		
		 LPO.EntreEmail().sendKeys(VerifyRegester.email);
		 LPO.EntrePassword().sendKeys(Constant.vrPass);
		 LPO.clickOnSubmit().click();
		 
		 String actualMyAccountText=LPO.getMyAccountText().getText();
		 String ExpectedMyAccountText=Constant.MyAccountText;
		CommonMethod.handleAssersions(actualMyAccountText,ExpectedMyAccountText, "My Account Text does not match");

		
	}
	
	   	
	
	
}
