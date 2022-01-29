import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div/a[@data-nav-ref='nav_ya_signin']"))).build().perform();
		WebElement move=driver.findElement(By.id("twotabsearchtextbox"));
		//a.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		a.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		a.moveToElement(driver.findElement(By.xpath("//div/a[@data-nav-ref='nav_ya_signin']"))).contextClick().build().perform();
		
		
	}

}
