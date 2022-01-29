import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Free Access to InterviewQues/ResumeAssistance/Mate')]")).click();
Set<String> window=driver.getWindowHandles();
Iterator<String> it=window.iterator();
String parentId=it.next();
String childId=it.next();
driver.switchTo().window(childId);
driver.findElement(By.xpath("//div[@class='login-btn'][2]")).click();


	}

}
