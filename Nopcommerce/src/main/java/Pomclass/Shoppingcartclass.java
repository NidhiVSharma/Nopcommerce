package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Shoppingcartclass {
	
	@FindBy (xpath = "//input[@class='qty-input']") //input[@id='itemquantity11225']
	private WebElement Quntity ;
	

	@FindBy (xpath = "//button[@id='updatecart']") 
	private WebElement Updatecart  ;
	
	@FindBy (xpath = "//a[@id='open-estimate-shipping-popup']") 
	private WebElement Estimateshipping ;
	
	@FindBy (xpath = "//select[@data-trigger='country-select']") 
    private WebElement selectcountry  ;
	//span[text()='Shopping cart']
	
	@FindBy (xpath = "//input[@id='ZipPostalCode']") 
    private WebElement ZipPostalCode ;
	
	@FindBy (xpath = "//button[@class='button-2 apply-shipping-button']") 
    private WebElement ApplyNow ;
	
	@FindBy (xpath = "//input[@id='termsofservice']") 
    private WebElement IAgree ;
	
	@FindBy (xpath = "//button[@id='checkout']") 
    private WebElement CheckOut ;
	
	//Constructor
			public Shoppingcartclass (WebDriver driver)       //driver =driverTest = new ChromeDriver()
			{
				PageFactory.initElements(driver, this);
			}
			
			//method
			
			public void clearOnQuntityButton() {
				Quntity.clear();
			}
			
			public void clickOnQuntityButton() {
				Quntity.sendKeys("5");
			}
			
			public void clickOnUpdatecartButton() {
				Updatecart.click();
				}
			
			public void clickOnEstimateshippingButton() {
				Estimateshipping.click();
				}
			
			public void clickOnselectcountryButton() {
		  		Select c = new Select(selectcountry);
		  		c.selectByVisibleText("India");
			}
			
			public void clickOnZipPostalCodeButton() {
				ZipPostalCode.sendKeys("421401");
			}
			
			public void clickOnApplynowButton() {
				ApplyNow.click();
				}
			
			public void clickOnIagreeButton() {
				IAgree.click();
				}
			
			public void clickOnCheckOutButton() {
				CheckOut.click();
				}


}
