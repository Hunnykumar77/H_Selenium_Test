package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check_Box {

	public static void main(String[] args) 
	{
		String key="webdriver.gecko.driver";
		String value="./drivers/geckodriver.exe";
		System.setProperty(key, value);
	     FirefoxDriver driver=new FirefoxDriver();
	     //driver.get("file:///C:/Users/H kumar/OneDrive/Desktop/facebook.html");
	     driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	     List<WebElement> wb=driver.findElements(By.xpath("//input[@type='checkbox']"));
	      int nn=wb.size();
	      System.out.print("The number of checkbox is "  + nn);
	      for(int i=0;i<nn;i++)
	      {
	    	 WebElement ww=wb.get(i);
	    	 System.out.print(ww);
	    	 String ss=ww.getText();
	    	 System.out.println("The chechBox is "+ ss);
	    	 ww.click();
	      }
	      System.out.print("All are enabled");
	      
	     
	}

}
