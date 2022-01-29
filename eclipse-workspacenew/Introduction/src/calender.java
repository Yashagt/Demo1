import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//*[@name='travel_date']")).click();
		//apr 14
		
		while(!driver.findElement(By.cssSelector("div.datepicker-days th.datepicker-switch")).getText().contains("April"))
		{
			driver.findElement(By.cssSelector("div.datepicker-days th.next")).click();
		}
		List<WebElement> days=driver.findElements(By.cssSelector("div.datepicker-days td.day"));
		for(int i=1;i<driver.findElements(By.cssSelector("div.datepicker-days td.day")).size();i++)
		{
			String date=driver.findElements(By.cssSelector("div.datepicker-days td.day")).get(i).getText();
			if(date.contains("23"))
			{
				driver.findElements(By.cssSelector("div.datepicker-days td.day")).get(i).click();
			}
		}
	}

}