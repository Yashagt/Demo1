import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class multipleItems {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);-implicit wait
		
		//WebDriverWait w=new WebDriverWait(driver,5);
		//w.until(ExpectedConditions.visibilityOfElementLocated("By.cssSelector("div.product-action")")); -explicit wait
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] itemsNeeded= {"Cucumber","Brinjal","Pumpkin"};
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++)
		{
			String[] name=products.get(i).getText().split("-");
			String formattedText=name[0].trim();
			List itemsNeededList=Arrays.asList(itemsNeeded);
			int j=0;
			if(itemsNeededList.contains(formattedText))
			{
				driver.findElements(By.cssSelector("div.product-action")).get(i).click();
				j++;
				if(j==itemsNeeded.length)
				{
					break;
				}
			}
			
		}
		
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		Actions a =new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("input.promoCode"))).click().sendKeys("rahulshettyacademy").build().perform();
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
	}
	
}



