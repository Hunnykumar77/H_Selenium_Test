//input[@type='checkbox']package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook 
{

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
	
	String key="webdriver.gecko.driver";
	String value="./drivers/geckodriver.exe";
	System.setProperty(key, value);
     FirefoxDriver driver=new FirefoxDriver();
     
     driver.get("https://www.monster.com/resumes/post-resume2?landedFrom=Header");
    driver.findElement(By.id("btnUploadFromMyComputer")).click();
   String path="D:\\H Kumar\\Hunny kumar.doc";
   StringSelection ss=new StringSelection(path);
    
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    Thread.sleep(1000);
    Robot rb=new Robot();
    rb.setAutoDelay(3000);
   
    rb.keyPress(KeyEvent.VK_CONTROL);
    rb.keyPress(KeyEvent.VK_V);
    rb.setAutoDelay(2000);
    rb.keyRelease(KeyEvent.VK_CONTROL);
    rb.keyRelease(KeyEvent.VK_V);
    rb.setAutoDelay(3000);
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
    
     //driver.findElementsByName("fb");
	}

}
