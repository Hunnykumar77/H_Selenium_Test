package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Finding_Auto_Suggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.gecko.driver";
		String value="./drivers/geckodriver.exe";
		System.setProperty(key, value);
	     FirefoxDriver driver=new FirefoxDriver();
	     Thread.sleep(1000);
	     driver.get("http://www.google.com");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//input[@name='q']")).sendKeys("qspider");
	     List<WebElement> wb=driver.findElements(By.className("sbab"));
	     int cc=wb.size();
	     System.out.println(cc);
	     for(WebElement ss:wb)
	     {
	    	 String hunny=ss.getText();
	    	 System.out.println(hunny);
	     }
	     wb.get(cc-1).click();
	     
	     
	}

}
