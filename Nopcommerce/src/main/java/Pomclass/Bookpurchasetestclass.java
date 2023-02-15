package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Bookpurchasetestclass {
	
	@FindBy (xpath = "//select[@id='products-orderby']") 
    private WebElement  sortby;
	
	@FindBy (xpath = "//select[@id='products-pagesize']") 
    private WebElement display ;
	//(//button[@class='button-2 product-box-add-to-cart-button'])[1]
	@FindBy (xpath = "(//button[@class='button-2 product-box-add-to-cart-button'])[1]") 
    private WebElement addtocart ;
	
	@FindBy (xpath = "(//a[text()='First Prize Pies'])[2]") 
    private WebElement bookname ;
    
	//Constructor
			public Bookpurchasetestclass(WebDriver driver)       //driver =driverTest = new ChromeDriver()
			{
				PageFactory.initElements(driver, this);
			}
			
			//method
			public void ClickonsortbyButton() {
				Select s = new Select(sortby);
				s.selectByVisibleText("Price: High to Low");
			}
			
			public void ClickondisplayButton() {
				Select d = new Select(display);
				d.selectByVisibleText("9");
			}
			
			public void ClickonaddtocartButton() {
				addtocart.click();
			}

			public void ClickonbooknameButton() {
				bookname.click();
			}


}
