import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
         
public class testYoutube {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking");
		//WebElement serchTextbox = driver.findElement(By.xpath("//input[@id='search']"));
	
		WebElement continueButton = driver.findElement(By.xpath("//a[@ondblclick='return fLogon()']"));
		Actions Continue = new Actions(driver);
	//	action.sendKeys(searchBox,"continue"+Keys.ENTER).perform();
		
		Continue.click();
		
	}

}
