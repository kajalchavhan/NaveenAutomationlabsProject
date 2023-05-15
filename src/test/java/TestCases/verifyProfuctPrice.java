package TestCases;



import org.testng.annotations.Test;

import PageObjectModel.ProductPriceObject;
import Resources.Constant;
import Resources.baseClass;

public class verifyProfuctPrice extends baseClass{
	
	public ProductPriceObject PPO;
	@Test
	public void ProductVerify() throws InterruptedException {
		PPO=new ProductPriceObject(driver);
		
		
		PPO.EntreSearchBox().sendKeys(Constant.IphoneText);
		PPO.ClickOnSearch().click();
		String A=PPO.getiphoneprice().getText();
		String []a=A.split("\\s+");
		String AA=a[0];

		String removeDollar=AA;
		String afterReemovalDollar=removeDollar.replaceAll("[$,]","");
		
		double k =Double.parseDouble(afterReemovalDollar);
		PPO.AddIphoneCart().click();
		
		
		PPO.EntreSearchBox().clear();
		PPO.EntreSearchBox().sendKeys(Constant.SamsungText);
		PPO.ClickOnSearch().click();
		PPO.getSamsungPrice().getText();
		
		String B=PPO.getSamsungPrice().getText();
		System.out.println(B);
		String []b=B.split("\\s+");
		String BB=b[0];
		String Bb=BB.replaceAll("[$,]","");
		double j =Double.parseDouble(Bb);
		PPO.AddSamsungcart().click();
		Thread.sleep(2000);
		PPO.clickItemsinCart().click();
	
		String D=PPO.checkTotalinCart().getText();
	   String Dd=D.replaceAll("[$,]","");
		double T= Double.parseDouble(Dd);
		System.out.println(T);
		double C=k+j;
		System.out.println(k);
		System.out.println(j);
		System.out.println(C);
		if(T==C) {
			System.out.println("True");
		}else {
			  System.out.println("false");
		  }
	}
	

}
