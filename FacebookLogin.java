import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin 
{
	public static void main (String[] args)
	{
		System.out.println("Opening Firefox browser");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\manag\\Downloads\\Firefox driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dev@thidiff.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("thidiff01");
	driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		driver.close();
}
}
