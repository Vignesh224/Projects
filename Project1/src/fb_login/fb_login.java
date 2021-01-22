package fb_login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class fb_login {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\eclipse-workspace\\Sikuli Test Run\\Chrome integration\\chromedriver.exe");   	
        WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();	 
 
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("vicky900666@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("12345678");
        driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
        
//        driver.close();

	}

}
