package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegesterPageObject {
	public WebDriver driver;
	private By MyAccount=By.xpath("//i[@class='fa fa-user']");
	private By Regester=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/register']");
	private By pageText=By.xpath("//h1[contains(text(),'Register Account')]");
	private By FirstName=By.xpath("//input[@name='firstname']");
	private By Lastname=By.xpath("//input[@name='lastname']");
	private By Email=By.xpath("//input[@name='email']");
	private By Telephone=By.xpath("//input[@name='telephone']");
	private By Password=By.xpath("//input[@name='password']");
	private By ConfirmPassword=By.xpath("//input[@name='confirm']");
	private By Continue=By.xpath("//input[@value='Continue']");
	private By Agree=By.xpath("//input[@name='agree']");
	private By PrivacyPolicyWarning=By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	
	private By EmptyFirstNameText=By.xpath("(//div[@class='text-danger'])[1]");
	private By EmptyLastNameText=By.xpath("(//div[@class='text-danger'])[2]");
	private By EmptyEmailText=By.xpath("(//div[@class='text-danger'])[3]");
	private By EmptyTelephoneText=By.xpath("(//div[@class='text-danger'])[4]");
	private By EmptyPassText=By.xpath("(//div[@class='text-danger'])[5]");
	private By MismatchConfirmPassText=By.xpath("//div[contains(text(),'Password confirmation does not match password!')]");
	private By AccountCreated=By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
	//private By Agree=By.xpath("");
	
	
	public RegesterPageObject(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
	public WebElement AccountCreatedText() {
		return driver.findElement(AccountCreated);
	}
	public WebElement takeMismatchConfirmPassText() {
		return driver.findElement(MismatchConfirmPassText);
	}
	public WebElement takeEmptyFirstNameText() {
		return driver.findElement(EmptyFirstNameText);
	}
	public WebElement takeEmptyLastNameText() {
		return driver.findElement(EmptyLastNameText);
	}
	public WebElement takeEmptyEmailText() {
		return driver.findElement(EmptyEmailText);
	}
	public WebElement takeEmptyTelephoneText() {
		return driver.findElement(EmptyTelephoneText);
	}
	public WebElement takeEmptyPassText() {
		return driver.findElement(EmptyPassText);
	}
	public WebElement ClickOnMyAccount() {
		return driver.findElement(MyAccount);
	}
	
	public WebElement ClickOnRegester() {
		return driver.findElement(Regester);
	}
	public WebElement ClickOnpageText() {
		return driver.findElement(pageText);
	}
	public WebElement EntreFirstName() {
		return driver.findElement(FirstName);
	}
	public WebElement EntreLastname() {
		return driver.findElement(Lastname);
	}
	public WebElement EntreEmail() {
		return driver.findElement(Email);
	}
	public WebElement EntreTelephone() {
		return driver.findElement(Telephone);
	}
	public WebElement EntrePassword() {
		return driver.findElement(Password);
	}
	public WebElement EntreConfirmPassword() {
		return driver.findElement(ConfirmPassword);
	}
	public WebElement ClickOnContinue() {
		return driver.findElement(Continue);
	}
	public WebElement ClickOnCheckBox() {
		return driver.findElement(Agree);
	}
	public WebElement ClickOnWarningText() {
		return driver.findElement(PrivacyPolicyWarning);
	}
}
