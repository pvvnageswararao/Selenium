package DemoProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebAction1 {
	
           private static final int totalColumns = 0;
           
		static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
// launch browser window(Chrome)
		
		WebDriverManager.chromedriver().setup();
	         driver = new ChromeDriver();

// maximize the browse window   
	        driver.manage().window().maximize();
	        
// Detele all cookies
	        driver.manage().deleteAllCookies();
	       
// Enter the URL and Launch the application	        
	        driver.get("https://parabank.parasoft.com/parabank/index.htm");
	        Thread.sleep(1000); 
	        WebElement registerPage = driver.findElement(By.xpath("//a[text()='Register']"));
	        Thread.sleep(1000);
	        registerPage.click();
	        
// Enter First name
	        Thread.sleep(1000);
	        
	        WebElement firstName = driver.findElement(By.xpath("//input[@id='customer.firstName']"));
	        WebElement lastName = driver.findElement(By.xpath("//input[@id='customer.lastName']"));
	        WebElement address = driver.findElement(By.xpath("//input[@id='customer.address.street']"));
	        WebElement city = driver.findElement(By.xpath("//input[@id='customer.address.city']"));
	        WebElement state = driver.findElement(By.xpath("//input[@id='customer.address.state']"));
	        WebElement zipCode = driver.findElement(By.xpath("//input[@id='customer.address.zipCode']"));
	        WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='customer.phoneNumber']"));
	        WebElement ssn = driver.findElement(By.xpath("//input[@id='customer.ssn']"));
	        
	        Thread.sleep(1000);
	        
	        WebElement userName = driver.findElement(By.xpath("//input[@name='customer.username']"));
	        WebElement password = driver.findElement(By.xpath("//input[@name='customer.password']"));
	        WebElement confirmPassword = driver.findElement(By.xpath("//input[@name='repeatedPassword']"));
	        
	        Thread.sleep(1000);
	        
	        firstName.sendKeys("p");
	        lastName.sendKeys("nageswararao");
	        address.sendKeys("gannavaram");
	        city.sendKeys("vijayawada");
	        state.sendKeys("india");
	        zipCode.sendKeys("521311");
	        phoneNumber.sendKeys("8463934598");
	        ssn.sendKeys("12345");
	        
	        Thread.sleep(1000); 
	        
	        userName.sendKeys("nageswararao");
	        password.sendKeys("12345");
	        confirmPassword.sendKeys("12345");
	        
	        Thread.sleep(1000);
	        
// register Buttion
	        WebElement register = driver.findElement(By.xpath("//input[@class='button']"));
	        register.click();
	        	        	
// Verify Application Logo
	        WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
	        
	        if(logo.isDisplayed())
	        	System.out.println("Logo is displayed in the application");
	        else
	        	System.out.println("Logo is not display");
	        
	        Thread.sleep(1000);
	        
// Verify Application caption (Experience the difference)
	        String expCaption = "Experience the difference";
	        
	        WebElement caption = driver.findElement(By.xpath("//p[@class='caption']"));
	        
	        if(caption.getText().equals(expCaption))
	        	System.out.println("caption is Expected");
	        else
	        	System.out.println("Wrong caption is Added");
	        
// Enter invalid credentials in UserName And Password TexxtBoxes
	        WebElement usernameTextbox = driver.findElement(By.xpath("//input[@name='username']"));
	        WebElement passwordTextbox = driver.findElement(By.xpath("//input[@name='password']"));
	        Thread.sleep(1000);
	        if(usernameTextbox.isDisplayed()&&usernameTextbox.isEnabled()) {
	        	usernameTextbox.clear();
	        	usernameTextbox.sendKeys("nageswara");
	        }else {
	             System.out.println("usernameTextbox is not ready");
	               }
	        
	        if(passwordTextbox.isDisplayed()&&passwordTextbox.isEnabled()) {
	        	passwordTextbox.clear();
	        	passwordTextbox.sendKeys("1234");
	        }else {
	        	System.out.println("password Textbox is not ready");
	        }
	        
// Verify LOGIN button and Click on Login Button
	        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button']"));
	        String expLabel = "LOG IN";
	        
	        if(loginButton.getAttribute("value").toUpperCase().equals(expLabel)) {
	        	System.out.println("Buttion label is currect");
	        }else {
	        	System.out.println("Incorrect lable is added");
	        }
	        loginButton.click();
	        Thread.sleep(1000);
// Verify error message
	         
	        String expError="The username and password could not be verified.";
	   /*    
	        WebElement errorMassage = driver.findElement(By.xpath("//p[@class='error']"));
	        
	        if(errorMassage.getText().equals(expError)) {
	        	System.out.println("User getting incorrect error message for invalid credentials");
	        }else {
	        	System.out.println("User getting incorrect error message for invalid credentials");
	        }
	         
	       */ 
 // Enter valid credentials in UserName And Password TexxtBoxes
	        
	        driver.navigate().back();
	        driver.getCurrentUrl();
	        
	        Thread.sleep(1000);
	        WebElement usernameTextbox1 = driver.findElement(By.xpath("//input[@name='username']"));
	        WebElement passwordTextbox1 = driver.findElement(By.xpath("//input[@name='password']"));
	        
	        if(usernameTextbox1.isDisplayed()&&usernameTextbox1.isEnabled()) {
	        	usernameTextbox1.clear();
	        	usernameTextbox1.sendKeys("nageswararao");
	        }else {
	             System.out.println("usernameTextbox is not ready");
	               }
	        
	        if(passwordTextbox1.isDisplayed()&&passwordTextbox1.isEnabled()) {
	        	passwordTextbox1.clear();
	        	passwordTextbox1.sendKeys("12345");
	        }else {
	        	System.out.println("password Textbox is not ready");
	        } 
	        
	        WebElement loginButton1 = driver.findElement(By.xpath("//input[@class='button']"));
	        loginButton1.click();
	   	        
	        Thread.sleep(1000); 
	        
// click on Adminpage page
	        WebElement adminPageLink= driver.findElement(By.xpath("//a[text()='Admin Page']"));
	        adminPageLink.click();
	        
// Wite for Admin page	        
	        if(driver.getCurrentUrl().contains("https://parabank.parasoft.com/parabank/admin.htm")) {
	        	System.out.println("Admin page is launched");
	        }else {
	        	System.out.println("Admin page is not launched");
	        }
	        
// Select Data access mode as "SOAP"
	        WebElement dataAccessMode= driver.findElement(By.xpath("//input[@id='accessMode1']"));
	        dataAccessMode.click();
	        Thread.sleep(1000);
// Scrolldown till Lone provider
	        WebElement loneProviderDrp = driver.findElement(By.xpath("//select[@id='loanProvider']"));
	   //     ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",loneProviderDrp);
	        
// Select Loneprovider as 'Web Service'
	      Select s = new Select(loneProviderDrp);
	       s.selectByVisibleText("Web Service");
	        Thread.sleep(1000);
// Click on Submit buttion	        
              WebElement submitButtio = driver.findElement(By.xpath("//input[@value='Submit']"));	
              submitButtio.click();
              
//Wait for Successful Submission massage
              WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(10));
              explicitWait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//b[contains(text(),'Settings')]"), 0));
              System.out.println("Submittion Successfully");
              
              Thread.sleep(1000); 
// Click on Services Link
             WebElement serviceLink= driver.findElement(By.xpath("(//a[text()='Services'])[1]"));
             serviceLink.click();
              
// Wait for Services page
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
              
            Thread.sleep(1000); 
            
// Scrolldown till Bookstore services
            WebElement bookStoreServices = driver.findElement(By.xpath("//span[text()='Bookstore services:']"));
           ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", bookStoreServices);
           
              
// Get totle rows, columns in the bookstore Sevice table
        /*   
           List<WebElement> rows = (List<WebElement>) driver
        		   .findElement(By.xpath("//span[text()='Available ParaBank SOAP services:']/preceding::td[text()='Method']/ancestor::table//tr[1]"));
           int totalRows = rows.size();
	        System.out.println("Total rows"+totalRows);
	        
	        Thread.sleep(1000);   
	        List<WebElement> columns = driver
	        		.findElements(By.xpath("//span[text()='Available ParaBank SOAP services:']/preceding::td[text()='Method']/ancestor::table//tr[1]//td[3]"));
	        Thread.sleep(1000); 
// Get column headers of book store services table
	        for(int i=0;i<columns.size();i++) {
	        	System.out.println("Column"+i+"header is:"+columns.get(i).getText());
	        }
	        
// get all the data from book store service table
	        
	        WebElement row2Col2=driver.findElement(dataCell(2,2));
	        System.out.println("row 2 column 2 data is:"+row2Col2.getText());
	        
	        for(int r=2;r<=totalRows;r++) {
	        	for(int c=1;c<=totalColumns;c++) {
	        	
	        	WebElement element = driver.findElement(dataCell(r,c));
	        }
	        }*/
	     driver.quit();
		
        
		
	}
//	private static By dataCell(int i, int j) {
		// TODO Auto-generated method stub
	//	return null;
	//}
	public static By dataAccessMode(String option) {
		return By.xpath("//input[@value='"+option+"']");
	}
	
	public static By dataCell(int row, int col) {
		return By
				.xpath("//span[text()='Available ParaBank SOAP service:']"
						+ "/preceding::td[text()='Method']/ancestor::table//tr["+row+"]//td["+col+"]");
		
	}

}
