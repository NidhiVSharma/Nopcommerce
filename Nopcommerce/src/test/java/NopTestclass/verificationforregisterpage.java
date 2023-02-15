package NopTestclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pomclass.homepagetestclass;
import Pomclass.registrationpagetestclass;

public class verificationforregisterpage {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driverTest = new ChromeDriver();
		
		driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		
		driverTest.get("https://demo.nopcommerce.com/");
		
		homepagetestclass Homepagetestclass = new homepagetestclass(driverTest);
		Homepagetestclass.clickOnRegisterButton();
		
		registrationpagetestclass Registrationpagetestclass = new registrationpagetestclass(driverTest);
		Registrationpagetestclass.clickOnFemalebutton();
		
		Registrationpagetestclass.sendFname("Nidhisharma");
		Registrationpagetestclass.sendLname("sharma");
		Registrationpagetestclass.SelectOnDateOfBirth("2");
		Registrationpagetestclass.SelectOnMonthOfBirth("March");
		Registrationpagetestclass.SelectOnYearOfBirth("2000");
		Registrationpagetestclass.sendemail("nidhisharma.933@gmail.com");
		Registrationpagetestclass.sendcompany("Zebion infotech pvt ltd");
		Registrationpagetestclass.clickOnNewsletterbutton();
		Registrationpagetestclass.sendpassword("nidhisharma@66");
		Registrationpagetestclass.sendconfirmpasswrd("nidhisharma@66");
		Registrationpagetestclass.clickOnregisterbutton();
		
		
		
     }


}
