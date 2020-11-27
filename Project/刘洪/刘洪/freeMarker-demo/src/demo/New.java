package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class New {
  @Test
  public void test1() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "F:\\demoa\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:81/wordpress-5.4.2-zh_CN/wp-admin/index.php");
		Thread.sleep(5000);
		driver.findElement(By.id("user_login")).sendKeys("myl");
		driver.findElement(By.id("user_pass")).sendKeys("123456");
		driver.findElement(By.name("wp-submit")).submit();
		Thread.sleep(5000);
		WebElement	keyword=driver.findElement(By.xpath("//*[@id=\"title\"]"));
		keyword.sendKeys("≤‚ ‘");
		WebElement test=driver.findElement(By.name("content"));
		test.sendKeys("≤‚ ‘");
		driver.findElement(By.id("save-post")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("post-title-0")).sendKeys("≤‚ ‘");
		driver.findElement(By.id("block-1e682d28-4dfc-4348-b30d-86ec301deaa9")).sendKeys("≤‚ ‘");
//		driver.quit();
		WebElement botton=driver.findElement(By.xpath(""));
		botton.click();
  }
  public void test2() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "F:\\demoa\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:81/wordpress-5.4.2-zh_CN/wp-admin/index.php");
		Thread.sleep(5000);
		driver.findElement(By.id("user_login")).sendKeys("myl");
		driver.findElement(By.id("user_pass")).sendKeys("123456");
		driver.findElement(By.name("wp-submit")).submit();
		Thread.sleep(5000);
		WebElement	keyword=driver.findElement(By.xpath("//*[@id=\"title\"]"));
		keyword.sendKeys("≤‚ ‘");
		WebElement test=driver.findElement(By.name("content"));
		test.sendKeys("≤‚ ‘");
		driver.findElement(By.id("save-post")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("post-title-0")).sendKeys("≤‚ ‘");
		driver.findElement(By.id("block-1e682d28-4dfc-4348-b30d-86ec301deaa9")).sendKeys("≤‚ ‘");
//		driver.quit();
		WebElement botton=driver.findElement(By.xpath(""));
		botton.click();
}
  
  public void test3() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "F:\\demoa\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:81/wordpress-5.4.2-zh_CN/wp-admin/index.php");
		Thread.sleep(5000);
		driver.findElement(By.id("user_login")).sendKeys("myl");
		driver.findElement(By.id("user_pass")).sendKeys("123456");
		driver.findElement(By.name("wp-submit")).submit();
		Thread.sleep(5000);
		WebElement	keyword=driver.findElement(By.xpath("//*[@id=\"title\"]"));
		keyword.sendKeys("≤‚ ‘");
		WebElement test=driver.findElement(By.name("content"));
		test.sendKeys("≤‚ ‘");
		driver.findElement(By.id("save-post")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("post-title-0")).sendKeys("≤‚ ‘");
		driver.findElement(By.id("block-1e682d28-4dfc-4348-b30d-86ec301deaa9")).sendKeys("≤‚ ‘");
//		driver.quit();
		WebElement botton=driver.findElement(By.xpath(""));
		botton.click();
}
  public void test4() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "F:\\demoa\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:81/wordpress-5.4.2-zh_CN/wp-admin/index.php");
		Thread.sleep(5000);
		driver.findElement(By.id("user_login")).sendKeys("myl");
		driver.findElement(By.id("user_pass")).sendKeys("123456");
		driver.findElement(By.name("wp-submit")).submit();
		Thread.sleep(5000);
		WebElement	keyword=driver.findElement(By.xpath("//*[@id=\"title\"]"));
		keyword.sendKeys("≤‚ ‘");
		WebElement test=driver.findElement(By.name("content"));
		test.sendKeys("≤‚ ‘");
		driver.findElement(By.id("save-post")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("post-title-0")).sendKeys("≤‚ ‘");
		driver.findElement(By.id("block-1e682d28-4dfc-4348-b30d-86ec301deaa9")).sendKeys("≤‚ ‘");
//		driver.quit();
		WebElement botton=driver.findElement(By.xpath(""));
		botton.click();
}
  public void test5() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "F:\\demoa\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:81/wordpress-5.4.2-zh_CN/wp-admin/index.php");
		Thread.sleep(5000);
		driver.findElement(By.id("user_login")).sendKeys("myl");
		driver.findElement(By.id("user_pass")).sendKeys("123456");
		driver.findElement(By.name("wp-submit")).submit();
		Thread.sleep(5000);
		WebElement	keyword=driver.findElement(By.xpath("//*[@id=\"title\"]"));
		keyword.sendKeys("≤‚ ‘");
		WebElement test=driver.findElement(By.name("content"));
		test.sendKeys("≤‚ ‘");
		driver.findElement(By.id("save-post")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("post-title-0")).sendKeys("≤‚ ‘");
		driver.findElement(By.className("edit-post-header-toolbar")).click();
//		driver.quit();
		WebElement botton=driver.findElement(By.xpath(""));
		botton.click();
}
  
}