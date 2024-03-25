package DemoProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonNavigationTest {
	static WebDriver driver;
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
      //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Open Amazon's homepage
        driver.get("https://www.amazon.com");

        // Test Case: Basic Navigation
        WebElement amazonLogo = driver.findElement(By.id("nav-logo-sprites"));
        amazonLogo.click();

        // Test Case: Submenu Navigation
        List<WebElement> categories = driver.findElements(By.xpath("//div[@id='nav-subnav']//span[@class='nav-hasPanel']"));
        for (WebElement category : categories) {
            category.click();
            WebElement subcategory = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']//span[@class='nav-hasPanel']//span[@class='nav-text']"));
            subcategory.click();
        }
        driver.quit();
    }
}