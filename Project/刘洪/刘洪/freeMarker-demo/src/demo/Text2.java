package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Text2 {
	public void text1() throws InterruptedException {
		  System.setProperty("webdriver.gecko.driver", "F:\\demoa\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("http://localhost:81/wordpress-5.4.2-zh_CN/wp-admin/index.php");
			Thread.sleep(5000);

}

}