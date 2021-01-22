package irctc_site;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindSATrains {
	public static WebDriver oBrowser = null;
	public static WebElement from = null;
	public static WebElement to = null;
	public static void main(String[] args) {
			
			try{
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Libraries\\driver\\chromedriver.exe");
				oBrowser = new ChromeDriver();
				oBrowser.manage().window().maximize();
				oBrowser.get("https://www.irctc.co.in/nget/train-search");
				////from station//
				from=oBrowser.findElement(By.xpath("//*[@placeholder='From*']"));
				from.sendKeys("sbc");
				Thread.sleep(1000);
				from.sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				////to station//
				to=oBrowser.findElement(By.xpath("//*[@placeholder='To*']"));
				to.sendKeys("SALEM JN - SA");
				Thread.sleep(2000);
				to.sendKeys(Keys.TAB);
				Thread.sleep(2000);
				to.sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				
				
				////No. of trains available//
				WebElement trains = oBrowser.findElement(By.xpath("//b[@class='ng-star-inserted']"));
				Thread.sleep(2000);
				System.out.println(trains.getText());
				Thread.sleep(2000);
				oBrowser.close();
				}
				
			catch(Exception e)
			{
				e.printStackTrace();
			}
		

	}

}
