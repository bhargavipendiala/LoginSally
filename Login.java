
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Login 
{
	public static void main (String[] args)
	{
		System.out.println("Opening Firefox browser");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\manag\\Downloads\\Firefox driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.dev.sallybeauty.com/my-account/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[contains(@id,'login_username')]")).sendKeys("bhargavi@thidiff.com");
	driver.findElement(By.xpath("//input[contains(@id,'login_password')]")).sendKeys("Thidiff01*");
	//driver.findElement(By.id("dwfrm_login_username_d0ooamjyqrzz")).sendKeys("bhargavi@thidiff.com");
	//driver.findElement(By.id("dwfrm_login_password")).sendKeys("Thidiff01*");
		driver.findElement(By.xpath("//button[@name='dwfrm_login_login']")).click();
		driver.close();
	}
}
