package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriver openFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	
	public static WebDriver openEdgeBrowser() {
		System.setProperty("webdriver.edge.driver","C:\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		return driver;
	}
	
	

}
