package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_table_content {

	public static void main(String[] args)
	{
		String key="webdriver.gecko.driver";
		String value="./drivers/geckodriver.exe";
		System.setProperty(key, value);
	     FirefoxDriver driver=new FirefoxDriver();
	     
	     driver.get("file:///C:/Users/H%20kumar/OneDrive/Desktop/aa.html");
	     String ss="//*[@id=\"t1\"]//tr";
	     List<WebElement> wb2=driver.findElements(By.xpath(ss));
	     
	      int nn=wb2.size();
	    
	      System.out.print("The number of table rows is "  + nn);
	      for(WebElement cell:wb2)
	      {
	    	  String hunny=cell.getText();
	    	  System.out.println(hunny);
	      }
	      driver.close();
	      
	      
	      
	}

}
