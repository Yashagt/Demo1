import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingDemo {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000L);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> amount=driver.findElements(By.xpath("//td[4]"));
		int sum=0;
		
		for(int i=1;i<amount.size();i++)
		{
			String value=amount.get(i).getText();
			int value1=Integer.parseInt(value);
			sum=sum+value1;
			
			
			
		}
System.out.println(sum);
	}

}
