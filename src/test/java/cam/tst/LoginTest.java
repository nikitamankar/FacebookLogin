package cam.tst;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();

	}
	
	@Test
	public void doLogin(){
		
		System.out.println("Executing Login Test");
       driver.get("https://www.facebook.com/");
        
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nikitamankar 9975210059");
		
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		System.out.println(driver.getTitle());

	}
	@AfterTest
	public void close() {
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.close();
	}
	

}
