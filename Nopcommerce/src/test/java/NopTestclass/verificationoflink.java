package NopTestclass;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pomclass.homepagetestclass;

public class verificationoflink {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driverTest = new ChromeDriver();
		
		driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		
		driverTest.get("https://demo.nopcommerce.com/");
		
		homepagetestclass Homepagetestclass = new homepagetestclass(driverTest);
		
		Homepagetestclass.clickOnRegisterButton();
		String actaulURL = driverTest.getCurrentUrl();
		String expectedURL = "https://demo.nopcommerce.com/register?returnUrl=%2F";
		
		if(expectedURL.equals(actaulURL))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
	
         ArrayList<String> addr = new ArrayList<String>(driverTest.getWindowHandles());
        driverTest.switchTo().window(addr.get(0));
     //   homepagetestclass Homepagetestclass = new homepagetestclass(driverTest);
        Homepagetestclass.clickOnLoginButton();
       
        
    	
    	String actaulURL1 = driverTest.getCurrentUrl();
    	String expectedURL1 = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    	
    	if(expectedURL1.equals(actaulURL1))
    	{
    		System.out.println("PASS");
    	}
    	else
    	{
    		System.out.println("FAIL");
    	}


}
}
