package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

   public static void main(String[] args) throws Exception {

	   String key="webdriver.gecko.driver";
		String value="./drivers/geckodriver.exe";
		System.setProperty(key, value);
	     FirefoxDriver driver=new FirefoxDriver();
	    
      // Initialize WebDriver
     

      // Wait For Page To Load
      //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      // Go to URL
      driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		driver.manage().window().maximize();
		
		//Mouseover on submit button
		Actions action = new Actions(driver);
		WebElement btn = driver.findElement(By.id("idOfButton"));
		action.moveToElement(btn).perform();
		
		//Thread.sleep just for user to notice the event
		Thread.sleep(3000);
		
		//Closing the driver instance
		driver.quit();  }
}