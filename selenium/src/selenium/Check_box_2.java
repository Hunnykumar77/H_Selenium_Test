package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check_box_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";
		String value="./drivers/geckodriver.exe";
		System.setProperty(key, value);
	     FirefoxDriver driver=new FirefoxDriver();
	     
	     driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	     List<WebElement> wb=driver.findElements(By.xpath("//input[@type='checkbox']"));
	      int nn=wb.size();
	      System.out.print("The number of checkbox is "  + nn);
	      for(int i=nn-1;i>=0;i--)
	      {
	    	 WebElement ww=wb.get(i);
	    	 System.out.print(ww);
	    	 String ss=ww.getText();
	    	// System.out.println("The chechBox is "+ ss);
	    	 ww.click();
	    
	     
	}

	}
}
