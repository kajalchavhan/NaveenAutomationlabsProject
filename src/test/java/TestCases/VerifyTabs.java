package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.CommonMethod;
import PageObjectModel.TabObject;
import Resources.Constant;
import Resources.baseClass;

public class VerifyTabs extends baseClass{

	public TabObject TBO;
	@Test
	public void tabVerification() {
		TBO=new TabObject(driver);
		
		TBO.clickOnDesktops().click();
		TBO.clickOnPC().isDisplayed();
		TBO.clickOnShowAllDesktops().click();
		String ActualDesktopsText=TBO.clickOnDesktopsText().getText();
		String ExpectedDesktopsText=Constant.DesktopsText;
		CommonMethod.handleAssersions(ActualDesktopsText, ExpectedDesktopsText, "Desktops Text not match");
		
		TBO.clickOnLaptopsAndNotebooks().click();
		TBO.clickOnMacs().isDisplayed();
		TBO.clickOnShowAllLaptopsNotebooks().click();
		String ActualLaptopsNotebooksText=TBO.showLaptopsNotebooksText().getText();
		String ExpectedLaptopsNotebooksText=Constant.LaptopsNotebooksText;
		CommonMethod.handleAssersions(ActualLaptopsNotebooksText, ExpectedLaptopsNotebooksText , "Expected & LaptopsNotebooks Text not match");
		
		
		TBO.clickOnComponents().click();
		TBO.clickOnShowAllComponents().click();
		String ActualcomponentText=TBO.showcomponentText().getText();
		String ExpectedcomponentText=Constant.ComponentsText;
		CommonMethod.handleAssersions(ActualcomponentText, ExpectedcomponentText, "component Text not match");
		
		
		TBO.clickOnTablet().click();
		String ActualTabletsText=TBO.clickOntabletText().getText();
		String ExpectedTabletsText=Constant.TabletsText;
		CommonMethod.handleAssersions(ActualTabletsText, ExpectedTabletsText, "Tablets Text not match");
		
		TBO.clickOnSoftware().click();
		String ActualSoftwareText=TBO.showSoftwareText().getText();
		String ExpecteSoftwareText=Constant.SoftwareText;
		CommonMethod.handleAssersions(ActualSoftwareText, ExpecteSoftwareText, "Software Text not match");
		
		TBO.clickOnPhonesAndPDAs().click();
		String ActualPhonesAndPDAsText=TBO.clickPhonesAndPDAsText().getText();
		String ExpectedPhonesAndPDAsText=Constant.PhonesAndPDAsText;
		CommonMethod.handleAssersions(ActualPhonesAndPDAsText, ExpectedPhonesAndPDAsText, "Cameras Text not match");
		
		TBO.clickOnCameras().click();
		String ActualCamerasText=TBO.showCamerasText().getText();
		String ExpectedCamerasText=Constant.CamerasText;
		CommonMethod.handleAssersions(ActualCamerasText, ExpectedCamerasText, "Cameras Text not match");
		
		TBO.clickOnMP3Players().click();
		TBO.clickShowAllMP3Players().click();
		String ActualMP3PlayersText=TBO.clickMP3PlayersText().getText();
		String ExpecteMP3PlayersText=Constant.MP3PlayersText;
		CommonMethod.handleAssersions(ActualMP3PlayersText, ExpecteMP3PlayersText, "MP3 Players Text not match");
		
		
	}
}
