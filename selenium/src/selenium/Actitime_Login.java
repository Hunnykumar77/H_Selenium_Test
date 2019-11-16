package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime_Login {

	public static void main(String[] args) throws InterruptedException
	{

		String key="webdriver.gecko.driver";
		String value="./drivers/geckodriver.exe";
		System.setProperty(key, value);
	     FirefoxDriver driver=new FirefoxDriver();
	     driver.get("https://demo.actitime.com/login.do");
	     Thread.sleep(1000);
	    
	    // Thread.sleep(1000);
	     driver.findElement(By.id("username")).sendKeys("admin");
	     Thread.sleep(1000);
	     driver.findElement(By.name("pwd")).sendKeys("manager");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();
	    Thread.sleep(2000);
	    // driver.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
	    driver.findElement(By.id("addTasksLink")).click();
	    
	}

}
