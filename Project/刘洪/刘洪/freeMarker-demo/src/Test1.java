
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "F:\\demoa\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:81/wordpress-5.4.2-zh_CN/wp-admin/index.php");
		Thread.sleep(5000);
		driver.findElement(By.id("user_login")).sendKeys("myl");
		driver.findElement(By.id("user_pass")).sendKeys("123456");
		driver.findElement(By.name("wp-submit")).submit();
	    Thread.sleep(5000);
//	    driver.findElement(By.id("wp-admin-bar-new-content")).click();
//	    Thread.sleep(5000);
		WebElement	keyword=driver.findElement(By.id("title"));
	    keyword.sendKeys("≤‚ ‘1");
	    WebElement test=driver.findElement(By.name("content"));
        test.sendKeys("≤‚ ‘1");
		driver.findElement(By.id("save-post")).click();
		driver.findElement(By.className("welcome-icon welcome-write-blog")).click();
        Thread.sleep(5000);
//		driver.quit();
  }
}
