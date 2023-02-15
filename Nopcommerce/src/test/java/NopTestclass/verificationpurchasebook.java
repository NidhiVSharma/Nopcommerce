package NopTestclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pomclass.Bookpurchasetestclass;
import Pomclass.Shoppingcartclass;
import Pomclass.homepagetestclass;

public class verificationpurchasebook {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driverTest = new ChromeDriver();
		
		driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		
		driverTest.get("https://demo.nopcommerce.com/");
		
		homepagetestclass Homepagetestclass = new homepagetestclass(driverTest);
		Homepagetestclass.clickOnBookButton();
		
		Bookpurchasetestclass bookpurchasetestclass = new Bookpurchasetestclass(driverTest);
		
		bookpurchasetestclass.ClickonsortbyButton();
		bookpurchasetestclass.ClickondisplayButton();
		
		Thread.sleep(3000);
		bookpurchasetestclass.ClickonaddtocartButton();
		bookpurchasetestclass.ClickonbooknameButton();
		
		Homepagetestclass.clickOnShoppingCartButton();
		
		Shoppingcartclass shoppingcartclass = new Shoppingcartclass(driverTest);
		
		shoppingcartclass.clearOnQuntityButton();
		shoppingcartclass.clickOnQuntityButton();
		shoppingcartclass.clickOnUpdatecartButton();
		
		shoppingcartclass.clickOnEstimateshippingButton();
		
		Thread.sleep(3000);
		shoppingcartclass.clickOnselectcountryButton();
		shoppingcartclass.clickOnZipPostalCodeButton();
		
		Thread.sleep(2000);
		shoppingcartclass.clickOnApplynowButton();
		shoppingcartclass.clickOnIagreeButton();
		shoppingcartclass.clickOnCheckOutButton();
		}


}
