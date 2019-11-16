package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate_get {

	public static void main(String[] args) throws InterruptedException
	{
		String key="webdriver.gecko.driver";
		String value="./drivers/geckodriver.exe";
		System.setProperty(key, value);
	     FirefoxDriver driver=new FirefoxDriver();
	     
	     driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	    Thread.sleep(1000);
	    driver.navigate().to("http://www.facebook.com");
	    Thread.sleep(1000);
	    
	  //  Thread.sleep(1000);
	    
	    driver.navigate().back();
	    Thread.sleep(1000);
	    driver.navigate().forward();
	    Thread.sleep(1000);
	    driver.navigate().refresh();
	}

}
