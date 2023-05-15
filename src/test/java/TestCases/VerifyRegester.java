package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.CommonMethod;
import PageObjectModel.RegesterPageObject;
import Resources.Constant;
import Resources.baseClass;
import Resources.emailGeneration;

public class VerifyRegester extends baseClass {
	public static String email;
	public RegesterPageObject RPO;
	
	@Test(priority=0)
	public void EmptyCredencialsRegester()throws IOException {
		RPO=new RegesterPageObject(driver);
		RPO.ClickOnMyAccount().click();
		RPO.ClickOnRegester().click();
		RPO.ClickOnContinue().click();
		String ActualEmptyFirstNameText=RPO.takeEmptyFirstNameText().getText();
	   	String ExpectedEmptyFirstNameText=Constant.EmptyFirstnameText;
	   	CommonMethod.handleAssersions(ActualEmptyFirstNameText,ExpectedEmptyFirstNameText, "Empty First name Error massage did not match");
		
	   	//lastname--
	   	String actualEmptyLastNameText=RPO.takeEmptyLastNameText().getText();
	   	String ExpectedEmptyLastNameText=Constant.EmptyLastnameText;
	   	CommonMethod.handleAssersions(actualEmptyLastNameText,ExpectedEmptyLastNameText, "Empty last name Error massage did not match");
		
	   	//Email--
	   	String actualEmptyEmailText=RPO.takeEmptyEmailText().getText();
	   	String ExpectedEmptyEmailText=Constant.EmtyEmailText;
	   	CommonMethod.handleAssersions(actualEmptyEmailText,ExpectedEmptyEmailText, "Empty EmailError massage did not match");
	   	
	   	//Telephone--
		String actualEmptyTelephoneText=RPO.takeEmptyTelephoneText().getText();
	   	String ExpectedEmptyTelephoneText=Constant.EmtryTelText;
	   	CommonMethod.handleAssersions(actualEmptyTelephoneText,ExpectedEmptyTelephoneText, "Empty telephone Error massage did not match");
	   	
	   	//password--
	   	String actualEmptyPassText=RPO.takeEmptyPassText().getText();
	   	String ExpectedEmptyPassText=Constant.EmptyPassText;
	   	CommonMethod.handleAssersions(actualEmptyPassText,ExpectedEmptyPassText, "Empty password Error massage did not match");
	   	
		
		 String actualText=RPO.ClickOnWarningText().getText();
	   	 String ExpectedText=Constant.PrivacyPolicyWarning;
	   	CommonMethod.handleAssersions(actualText,ExpectedText, "Privacy Policy Error massage did not match");
	}
	
	@Test(priority=1)
	public void Regester() {
		RPO=new RegesterPageObject(driver);
		RPO.ClickOnMyAccount().click();
		RPO.ClickOnRegester().click();
		
		RPO.EntrePassword().sendKeys(Constant.Password);
		RPO.EntreConfirmPassword().sendKeys(Constant.MissmatchConfirmPassword);
		
		RPO.ClickOnCheckBox().click();
		RPO.ClickOnContinue().click();
		String actualMismatchConfirmPassText=RPO.takeMismatchConfirmPassText().getText();
	   	String ExpectedMismatchConfirmPassText=Constant.pasmotMatch;
	   	CommonMethod.handleAssersions(actualMismatchConfirmPassText,ExpectedMismatchConfirmPassText, "mismatch password Error massage did not match");
	}
	
	@Test(priority=2)
	public void InvalidRegester() {
		RPO=new RegesterPageObject(driver);
		RPO.ClickOnMyAccount().click();
		RPO.ClickOnRegester().click();
		RPO.EntreFirstName().sendKeys(Constant.FirstName);
		RPO.EntreLastname().sendKeys(Constant.Lastname);
		RPO.EntreEmail().sendKeys(Constant.Email);
		RPO.EntreTelephone().sendKeys(Constant.Telephone);
		RPO.EntrePassword().sendKeys(Constant.Password);
		RPO.EntreConfirmPassword().sendKeys(Constant.ConfirmPassword);
		//RPO.ClickOnCheckBox().click();
		RPO.ClickOnContinue();
	}
	@Test(priority=3)
	public void ValidRegesteration() {
		RPO=new RegesterPageObject(driver);
		RPO.ClickOnMyAccount().click();
		RPO.ClickOnRegester().click();
		RPO.EntreFirstName().sendKeys(Constant.vrFirstName);
		RPO.EntreLastname().sendKeys(Constant.vrLastName);
		email=emailGeneration.generateemail();
		RPO.EntreEmail().sendKeys(email);
		
		RPO.EntreTelephone().sendKeys(Constant.vrTele);
		RPO.EntrePassword().sendKeys(Constant.vrPass);
		RPO.EntreConfirmPassword().sendKeys(Constant.vrCrmPass);
		RPO.ClickOnCheckBox().click();
		RPO.ClickOnContinue().click();
		
		String ActualCreatedAccountText=RPO.AccountCreatedText().getText();
	   	String ExpectedCreatedAccountText=Constant.AccountCreated;
	   	CommonMethod.handleAssersions(ActualCreatedAccountText,ExpectedCreatedAccountText, "Account created text did not match");
	
		
	}
}
