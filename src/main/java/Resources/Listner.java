package Resources;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class Listner extends extentManager implements ITestListener{
	 
	 public void onTestStart(ITestResult result) {
	   test=extent.createTest(result.getName());
	  }
	  
	  public void onTestSuccess(ITestResult result) {
	   if (result.getStatus() == ITestResult.SUCCESS) {
	      test.log(Status.PASS, "Test case passed is" + result.getName());
	     }
	  }
	  
	  public void onTestSkip(ITestResult result) {
	   if (result.getStatus() == ITestResult.SKIP) {
	      test.log(Status.SKIP, "Test case skipped is" + result.getName());
	     }
	  }

	  public void onTestFailure(ITestResult result) {
	    if (result.getStatus() == ITestResult.FAILURE) {
	  test.log(Status.FAIL, "Test CASE Failed is " + result.getName()); 
	     test.log(Status.FAIL, "Test CASE Failed is " + result.getThrowable()); //To throw excpetion

	     String screenshotPath =baseClass.screenShot(baseClass.driver, result.getName()); 

	     test.addScreenCaptureFromPath(screenshotPath); //Adding screenshot inside report//To add name in extent report
}
}
}