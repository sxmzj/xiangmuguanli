
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class New {
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
		WebElement test=driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/ul[1]/li[6]/a/span[1]"));
		test.click();
	WebElement	keyword=driver.findElement(By.xpath("//*[@id=\"title\"]"));
//		keyword.sendKeys("����");
//		WebElement test=driver.findElement(By.name("content"));
//		test.sendKeys("����");
//		driver.findElement(By.id("save-post")).click();
//		Thread.sleep(5000);
		Thread.sleep(5000);
		driver.findElement(By.id("post-title-0")).sendKeys("����");
		driver.findElement(By.id("block-32cc1afe-bfa1-4b09-9bc5-e88f90d096b0")).sendKeys("����");
		driver.quit();
  }
public void f1() {
	
}
}
