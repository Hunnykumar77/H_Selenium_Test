package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_tables
{
	public static void main(String as[])
	{
		String key="webdriver.gecko.driver";
		String value="./drivers/geckodriver.exe";
		System.setProperty(key, value);
	     FirefoxDriver driver=new FirefoxDriver();
	     
	     driver.get("file:///C:/Users/H%20kumar/OneDrive/Desktop/aa.html");
	     String ss="//*[@id=\"t1\"]//tr";
	     String ss1="//*[@id=\"t1\"]//td";
	     String ss2="//*[@id=\"t1\"]//tr[1]//td"; 
	     List<WebElement> wb=driver.findElements(By.xpath(ss));
	     List<WebElement> wb1=driver.findElements(By.xpath(ss1));
	     List<WebElement> wb2=driver.findElements(By.xpath(ss2));
	     
	      int nn=wb.size();
	      int nn1=wb1.size();
	      int nn2=wb2.size();
	      
	      System.out.print("The number of table rows is "  + nn);
	      System.out.print("The number of cells in table is "  + nn1);
	      System.out.print("The number of column in the table is "  + nn2);
	      
	}
}
