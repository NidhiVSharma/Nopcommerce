package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class registrationpagetestclass {
	
    @FindBy (xpath = "//input[@id='Email']") 
	private WebElement email ;
    
    @FindBy (xpath = "//input[@id='Company']") //input[@id="Company"]
	private WebElement  companyname;
    
    @FindBy (xpath = "//input[@id='Newsletter']") 
	private WebElement Newsletter ;
    
    @FindBy (xpath = "//input[@id='Password']") 
	private WebElement password ;
    
    @FindBy (xpath = "//input[@id='ConfirmPassword']") 
	private WebElement confirmpasswrd ;
    //private WebDriver driver;
	
	@FindBy (xpath = "//input[@id='gender-female']") 
	private WebElement gender ;
	
	@FindBy (xpath = "//input[@id='FirstName']") 
	private WebElement Fname ;
	
	@FindBy (xpath = "//input[@id='LastName']") 
	private WebElement Lname ;
	
    @FindBy (xpath = "//select[@name='DateOfBirthDay']") 
	private WebElement day ;
    
    @FindBy (xpath = "//select[@name='DateOfBirthMonth']") 
	private WebElement month  ;
    
    @FindBy (xpath = "//select[@name='DateOfBirthYear']") 
	private WebElement year ;

    @FindBy (xpath = "//button[@id='register-button']") 
	private WebElement Register ;
    
  //Constructor
  	public registrationpagetestclass(WebDriver driver)       //driver =driverTest = new ChromeDriver()
  	{
  		PageFactory.initElements(driver, this);
  		//this.driver = driver;
  	}
  	
  	//method
  	public void clickOnFemalebutton() {
  		gender.click();
  	}
  	
  	public void sendFname(String fname) {
  		Fname.sendKeys(fname);
  	}
  	
  	public void sendLname(String lname) {
  		Lname.sendKeys(lname);
  	}
  	
  	public void SelectOnDateOfBirth(String value) {
  		Select s =new Select(day);
  		s.selectByVisibleText(value);
  	}

  	public void SelectOnMonthOfBirth(String value) {
  		Select m =new Select(month);
  		m.selectByVisibleText(value);
  	}
  	
  	public void SelectOnYearOfBirth(String value) {
  		Select y =new Select(year);
  		y.selectByVisibleText(value);
  	}
  	
  	public void sendemail(String Email) {
  		email.sendKeys(Email);
  		
  	}
  	 
  	public void sendcompany(String cname) {
  		companyname.sendKeys(cname);
  	}
  	
  	public void clickOnNewsletterbutton() {
  		Newsletter.click();
  	}
  	public void sendpassword(String pass) {
  		password.sendKeys(pass);
  	}
  	
  	public void sendconfirmpasswrd(String cpass) {
  		confirmpasswrd.sendKeys(cpass);
  	}
	public void clickOnregisterbutton() {
		Register.click();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
  		//js.executeAsyncScript("arguments[0].scrollIntoview(true);",Register);
  	}


}
