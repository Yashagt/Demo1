import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.google.common.io.*;

public class miscellineous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize
		driver.manage().deleteAllCookies();//delete cookies
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//TakeScreenshot
		FileUtils.copyFile(src,new File("C:\\Users\\Dell\\screenshot.png"));
		

	}

}
