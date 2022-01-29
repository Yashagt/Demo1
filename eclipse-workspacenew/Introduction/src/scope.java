import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\work\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				//1. count of all links
				
				System.out.println(driver.findElements(By.tagName("a")).size());
				//2.Footer links
				WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
				
				System.out.println(footerDriver.findElements(By.tagName("a")).size());
				//3. 1st column.
				
				WebElement columnDriver=driver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
				System.out.println(columnDriver.findElements(By.tagName("a")).size());
				//4. opens all link and verify new pages are opened
				Thread.sleep(5000);
				
				
				for(int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++)
				{
					Thread.sleep(5000L);
				String linkclick=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
				columnDriver.findElements(By.tagName("a")).get(i).sendKeys(linkclick);
					
					
					Set<String> abc=driver.getWindowHandles();
				Iterator<String> it=abc.iterator();
			while(it.hasNext())
			{
					
					driver.switchTo().window(it.next());
					System.out.println(driver.getTitle());
			}
				//5. title of all tabs
				
}
	}
}
//
//		
//
//
//	


