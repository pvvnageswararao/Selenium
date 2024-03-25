package BrowserActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserAction1 {
	
        static WebDriver driver;
        
	public static void main(String[] args) {
		
		
//		1. Launch browser window
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all the cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the application
		 driver.get("https://en-gb.facebook.com/login/device-based/regular/login/");
		 
//		5. Verify application title
		 String actualTitle = driver.getTitle();
	        if(actualTitle.equals("facebook"))
	            System.out.println("Application Launched Successfully");
	        else
	            System.out.println("Application Not Launched");
	        
//		6. Verify application logo
	        WebElement logo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
	        
	        if(logo.isDisplayed())
	        	System.out.println("Logo is display in the application");
	        else
	        	System.out.println("Logo not displayed");
	        
//		7. Verify application caption(Experience the difference)
	        
	        String expCaption = "Experience the difference";
	        WebElement caption = driver.findElement(By.xpath("//div[@class='_9axz']"));
	        
	        if(caption.getText().equals(expCaption))
	           System.out.println("Caption is Expected");
	        else
	        	System.out.println("Wrong caption is added");
	        
//		8. Enter Invalid credentials in Username and Password textboxes
//		9. Click on Login Button
//		10. Verify error message is displayed (The username and password could not be verified.)
//		11. Click on Admin page link
//		12. Wait for admin page
//		13. Select Data access mode as ' SOAP'
//		14. Scroll-down till Loan provider
//		15. Select Loan-provider as 'Web Service'
//		16. Click on Submit button
//		17.wait for Successful submission message
//		18.Click on Services Link
//		19.Wait for Services page
//		20.Scroll-down till Bookstore services
//		21.Get total rows, columns in the bookstore service table
//		22.Get Column headers of book store services table
//		23.Get all the data from book store service table
//		24.Logout from the application
//		25.Close browser window


	}

}
