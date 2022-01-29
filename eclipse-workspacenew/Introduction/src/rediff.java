import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sign in
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://rediff.com");
		
		driver.findElement(By.xpath("//a[@title='Already a user? Sign in']")).click();//xpath//tagname[@attribute='value']-xpath
		driver.findElement(By.cssSelector("input[name='login']")).sendKeys("input value");//css tagname[attribute='value']
		driver.findElement(By.cssSelector("input#password")).sendKeys("12345");//css tagname#id
		//driver.findElement(By.cssSelector("input.signinbtn")).click();//css tagname.classname
		driver.findElement(By.linkText("Forgot Password?")).click();//linkText
		driver.findElement(By.xpath("//input[contains(@id,'txtlogi')]")).sendKeys("yashagt"); //xpath regular exp //tagname[contains(@attribute,'value')]s
		driver.findElement(By.cssSelector("input[type*='submi']")).click();//css reg exp tagname[attribute*='value']
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle()); 
		

	}

}
