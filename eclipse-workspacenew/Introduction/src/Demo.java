import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("This is my first code");//email
		driver.findElement(By.id("pass")).sendKeys("123456");//pwd
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.cssSelector("u_0_2_ST")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Hello");
		
		
		
		
		
		
		
		
		
		
	}
}
		

	