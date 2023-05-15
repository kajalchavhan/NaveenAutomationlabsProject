package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public WebDriver driver;
	private By MyAccount=By.xpath("//i[@class='fa fa-user']");
	private By Login=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/login'])[1]");
	private By Email=By.xpath("//input[@name='email']");
	private By Password=By.xpath("//input[@name='password']");
	private By Submit=By.xpath("//input[@type='submit']");
	private By Warning=By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	
	
	
	public LoginPageObject(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
	public WebElement clickOnMyAccount() {
		return driver.findElement(MyAccount);
	}
	public WebElement clickOnLogin() {
		return driver.findElement(Login);
	}
	public WebElement EntreEmail() {
		return driver.findElement(Email);
	}
	public WebElement EntrePassword() {
		return driver.findElement(Password);
	}
	public WebElement clickOnSubmit() {
		return driver.findElement(Submit);
	}
	public WebElement clickOnWarning() {
		return driver.findElement(Warning);
	}
}
