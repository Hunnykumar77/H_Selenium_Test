package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

//import org.apache.commons.io.FileUtils;
public class Screen_shots 

{
		@Test
		public void acc() throws InterruptedException, IOException
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			WebDriver hunny=new FirefoxDriver();
			hunny.manage().window().maximize();
			hunny.get("http://www.facebook.com");
			Thread.sleep(1000);
			hunny.findElement(By.id("email")).sendKeys("hunnykumar77@gmail.com");
			TakesScreenshot src=(TakesScreenshot)hunny;
			File ss=src.getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile( src, new File("./selenium/facebook.png"));
			System.out.println("Succesfully taken");
			hunny.quit();
		}
	}


