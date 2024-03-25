package BrowserActions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActions {
	
	 static WebDriver driver;
	 
	public static void main(String[] args) {
	// 1. Launch the Browser window (Browser = Chrome)
		
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
       
//        Minimize browser window
        driver.manage().window().minimize();
       
//        Maximize to specific resolution(800X400)
        driver.manage().window().setSize(new Dimension(800,400));
       
//        2. Maximize the browser window
        driver.manage().window().maximize();
       
//        3. Delete all browser cookies
        driver.manage().deleteAllCookies();
       
//        4. Enter URL and Launch the Application (https://www.google.co.in/)
        driver.get("https://www.google.com");
       
//        5. Verify the application title (Google)        
        String actualTitle = driver.getTitle();
        if(actualTitle.equals("Google"))
            System.out.println("Application Launched Successfully");
        else
            System.out.println("Application Not Launched");
       
//        6. Navigate to Different application (https://www.selenium.dev/)
        driver.navigate().to("https://www.selenium.dev/");

//        7. Go back to previous application
        driver.navigate().back();
       
//        8. Move forward to next application
        driver.navigate().forward();
       
//        9. Refresh the application        
        driver.navigate().refresh();
       
//        collect the main window id
        String mainWindowId= driver.getWindowHandle();
       
//        10.Launch new tab and Launch the application in new tab (https://in.search.yahoo.com/)    
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://in.search.yahoo.com/&quot");
        String newTabId =driver.getWindowHandle();
       
//        11.Launch new window and Launch the application in new window (https://parabank.parasoft.com/parabank/index.htm)        
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://parabank.parasoft.com/parabank/index.htm&quot");
       
//        12.Switch back to main window
        driver.switchTo().window(mainWindowId);
       
//        Print browser window URL
        System.out.println(driver.getCurrentUrl());
       
//        13. Get the Size of window    
        System.out.println(driver.manage().window().getSize().getWidth());
        System.out.println(driver.manage().window().getSize().getHeight());
       
//        14. Close Current Window
        driver.close();
       
//        15. Close all remaining windows
        driver.quit();
    }


	}


