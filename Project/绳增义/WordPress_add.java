import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WordPress_add {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","H:\\Firefoxdemo\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "H:\\Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost2/wp-login.php?loggedout=true&wp_lang=zh_CN");
		driver.findElement(By.name("log")).sendKeys("username");
		driver.findElement(By.name("pwd")).sendKeys("sheng0604X");
		driver.findElement(By.xpath("//input[@value='µÇÂ¼']")).click();
		Thread.sleep(2000);
		//Ìí¼ÓÓÃ»§
		driver.findElement(By.xpath("html/body/div/div[1]/div[2]/ul/li[10]/a/div[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/div[1]/div[4]/a")).click();
		Thread.sleep(2000);
		WebElement content=driver.findElement(By.name("user_login"));
		content.sendKeys("demo");
		WebElement content1=driver.findElement(By.name("email"));
		content1.sendKeys("123@qq.com");
		driver.findElement(By.xpath("//*[@id=\"createusersub\"]")).click();
		Thread.sleep(3000);
		}
}