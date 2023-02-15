package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepagetestclass {
	
	@FindBy (xpath = "//a[text()='Register']") 
	private WebElement Register ;
	

	@FindBy (xpath = "(//a[text()='Books '])[1]") 
	private WebElement Book ;
	

	@FindBy (xpath = "//a[text()='Log in']") //a[text()='Log in']
	private WebElement Login ;
	
	@FindBy (xpath = "//a[@class='ico-logout']") 
    private WebElement Logout ;
	//span[text()='Shopping cart']
	
	@FindBy (xpath = "//span[text()='Shopping cart']") 
    private WebElement ShoppingCart ;
	
	//a[@class='ico-logout']
	
	//Constructor
		public homepagetestclass(WebDriver driver)       //driver =driverTest = new ChromeDriver()
		{
			PageFactory.initElements(driver, this);
		}
		
		//method
		public void clickOnRegisterButton() {
	    Register.click();
		}
		
		public void clickOnBookButton() {
		    Book.click();
			}
		
		public void clickOnLoginButton() {
		    Login.click();
			}
		
		public void clickOnLogoutButton() {
	  		Logout.click();
		}
		public void clickOnShoppingCartButton() {
			ShoppingCart.click();
		}


}
