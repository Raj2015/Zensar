package Driver_Engine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Driver_Script {
	
	WebDriver driver;
	@Test
	public void e(){
		
		WebElement coffee = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div[2]/div[2]/ul/li[1]/a/strong"));
		Actions hover = new Actions(driver);
		hover.moveToElement(coffee).build().perform();
		driver.findElement(By.xpath("/html/body/div[3]/ol/li[1]/div[1]/ol/li[1]/ol/li[3]/a")).click();
		JavascriptExecutor scroll = ((JavascriptExecutor)driver);
		scroll.executeScript("windowscroll (0,300");
		
	}
  @Test(enabled = false)
  public void f() {
	  driver.get("");
	  driver.findElement(By.id(""));
	  driver.findElement(By.id("")).click();
 
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.get("http://www.starbucks.in/"); 
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	  
  }

  @AfterMethod
  public void afterMethod() throws Exception {
	  Thread.sleep(2000);
	  driver.navigate().back();
	  driver.navigate().refresh();
  }

  @BeforeTest
  public void beforeTest() {
	 
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(4000);
	  driver.close();
  }

}
