package selenium;
//package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_dRop {

	public static void main(String[] args) throws InterruptedException, AWTException
	{

		String key="webdriver.gecko.driver";
		String value="./drivers/geckodriver.exe";
		System.setProperty(key, value);
	     FirefoxDriver driver=new FirefoxDriver();
	     driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
	     driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	     System.out.println("Hi");
	     Thread.sleep(1000);
	     Robot robot = new Robot();
	     robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	     robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	     Thread.sleep(1000);
	     Actions act = new Actions(driver); 
	     Thread.sleep(1000);
	     WebElement from = driver.findElement(By.id("sourceImage")); 
	 
	   
	  
	     WebElement to = driver.findElement(By.id("targetDiv"));  
	    act.dragAndDrop(from,to).build().perform();   
	}
}