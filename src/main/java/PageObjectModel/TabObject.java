package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TabObject {

	public WebDriver driver;
	private By Desktops=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20'])[1]");
	private By LaptopsAndNotebooks=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=18'])[1]");
	private By Components=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25'])[1]");
	private By Tablet=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=57'])[1]");
	private By Software=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=17'])[1]");
	private By PhonesAndPDAs=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=24'])[1]");
	private By Cameras=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=33'])[1]");
	private By MP3Players=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=34'])[1]");
	private By tabletText=By.xpath("//h2[contains(text(),'Tablets')]");
	private By DesktopsText=By.xpath("//h2[contains(text(),'Desktops')]");
	private By PC=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20_26']");
	private By ShowAllDesktops=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20'])[2]");
	private By Macs=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=18_46']");
	private By ShowAllLaptopsNotebooks=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=18'])[2]");
	private By LaptopsNotebooksText=By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
	private By ShowAllComponents=By.xpath("(//a[@href=\"https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25\"])[2]");
	private By SoftwareText=By.xpath("//h2[contains(text(),'Software')]");
	private By ComponentsText=By.xpath("//h2[contains(text(),'Components')]");
	private By CamerasText=By.xpath("//h2[contains(text(),'Cameras')]");
	private By ShowAllMP3Players=By.xpath("(//a[@href=\"https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=34\"])[2]");
	private By MP3PlayersText=By.xpath("//h2[contains(text(),'MP3 Players')]");
	private By PhonesAndPDAsText=By.xpath("//h2[contains(text(),'Phones & PDAs')]");
	//private By ShowAllDesktops=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20'])[2]");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public TabObject(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
	public WebElement clickShowAllMP3Players() {
		return driver.findElement(ShowAllMP3Players);
	}
	public WebElement clickPhonesAndPDAsText() {
		return driver.findElement(PhonesAndPDAsText);
	}
	public WebElement clickMP3PlayersText() {
		return driver.findElement(MP3PlayersText);
	}
	public WebElement showCamerasText() {
		return driver.findElement(CamerasText);
	}
	public WebElement clickOnDesktops() {
		return driver.findElement(Desktops);
	}
	public WebElement clickOnLaptopsAndNotebooks() {
		return driver.findElement(LaptopsAndNotebooks);
	}
	public WebElement clickOnComponents() {
		return driver.findElement(Components);
	}
	public WebElement clickOnTablet() {
		return driver.findElement(Tablet);
	}
	public WebElement clickOnSoftware() {
		return driver.findElement(Software);
	}
	public WebElement clickOnPhonesAndPDAs() {
		return driver.findElement(PhonesAndPDAs);
	}
	public WebElement clickOnCameras() {
		return driver.findElement(Cameras);
	}
	public WebElement clickOnMP3Players() {
		return driver.findElement(MP3Players);
	}
	public WebElement clickOntabletText() {
		return driver.findElement(tabletText);
	}
	public WebElement clickOnDesktopsText() {
		return driver.findElement(DesktopsText);
	}
	public WebElement clickOnPC() {
		return driver.findElement(PC);
	}
	public WebElement clickOnShowAllDesktops() {
		return driver.findElement(ShowAllDesktops);
	}
	public WebElement clickOnMacs() {
		return driver.findElement(Macs);
	}
	public WebElement clickOnShowAllLaptopsNotebooks() {
		return driver.findElement(ShowAllLaptopsNotebooks);
	}
	public WebElement clickOnShowAllComponents() {
		return driver.findElement(ShowAllComponents);
	}
	public WebElement showLaptopsNotebooksText() {
		return driver.findElement(LaptopsNotebooksText);
	}
	public WebElement showcomponentText() {
		return driver.findElement(ComponentsText);
	}
	public WebElement showSoftwareText() {
		return driver.findElement(SoftwareText);
	}
	
}
