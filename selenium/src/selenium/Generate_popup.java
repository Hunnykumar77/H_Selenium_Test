package selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Generate_popup {

	public static void main(String[] args) throws InterruptedException, AWTException
	{

		String key="webdriver.gecko.driver";
		String value="./drivers/geckodriver.exe";
		System.setProperty(key, value);
	     FirefoxDriver driver=new FirefoxDriver();
	    driver.get("file:///C:/Users/H%20kumar/OneDrive/Desktop/aa.html");
	    Thread.sleep(1000);
	     driver.findElement(By.xpath("//button[@onclick='confirmFunction()']")).click();
	     Thread.sleep(2000);
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.dismiss();
			
			
			
	    // driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
	   //  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	   //  Thread.sleep(1000);
	   
	    // driver.findElement(By.name("cusid")).sendKeys("121");
	    // Thread.sleep(1000);
	    // driver.findElement(By.name("submit")).click();
	    // Thread.sleep(1000);
	  
	    // Alert a=driver.switchTo().alert();
	    // a.accept();*/
	     
	}
}
	    