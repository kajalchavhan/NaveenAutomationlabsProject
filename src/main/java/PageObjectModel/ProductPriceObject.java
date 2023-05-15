package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPriceObject {

	public WebDriver driver;
	private By SearchBox=By.xpath("//input[@name='search']");
	private By Search=By.xpath("//i[@class='fa fa-search']");
	private By currency=By.xpath("//button[@class='btn btn-link dropdown-toggle']");
	private By USD=By.xpath("//button[@name='USD']");
	private By AddIphone=By.xpath("(//i[@class='fa fa-shopping-cart'])[3]");
	private By iphoneprice=By.xpath("//p[@class='price']");
	private By SamsungPrice=By.xpath("//p[contains(text(),'$241.99')]");
	private By AddSamsung=By.xpath("(//i[@class='fa fa-shopping-cart'])[4]");
	private By ItemsinCart=By.xpath("//div[@id='cart']");
	private By TotalinCart=By.xpath("(//td[@class='text-right'])[12]");
	private By iPhoneText=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/product&product_id=40&search=iphone'])[2]");
	private By SamsungText=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/product&product_id=49&search=samsung'])[2]");
	
	
	
	
	public ProductPriceObject(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
	public WebElement checkSamsungText() {
		return driver.findElement(SamsungText);
	}
	public WebElement checkiPhoneText() {
		return driver.findElement(iPhoneText);
	}
	public WebElement checkTotalinCart() {
		return driver.findElement(TotalinCart);
	}
	public WebElement clickItemsinCart() {
		return driver.findElement(ItemsinCart);
	}
	public WebElement AddSamsungcart() {
		return driver.findElement(AddSamsung);
	}
	public WebElement getSamsungPrice() {
		return driver.findElement(SamsungPrice);
	}
	public WebElement getiphoneprice() {
		return driver.findElement(iphoneprice);
	}
	public WebElement EntreSearchBox() {
		return driver.findElement(SearchBox);
	}
	public WebElement ClickOnSearch() {
		return driver.findElement(Search);
	}
	public WebElement ClickOncurrency() {
		return driver.findElement(currency);
	}
	public WebElement ClickOnUSD() {
		return driver.findElement(USD);
	}
	public WebElement AddIphoneCart() {
		return driver.findElement(AddIphone);
	}
}
