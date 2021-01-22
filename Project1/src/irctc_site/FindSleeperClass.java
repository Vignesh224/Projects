package irctc_site;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindSleeperClass {

	
		public static WebDriver oBrowser = null;
		public static void main(String[] args) {
			try{
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Libraries\\\\driver\\\\chromedriver.exe");
				oBrowser = new ChromeDriver();
				oBrowser.manage().window().maximize();
				oBrowser.navigate().to("https://www.irctc.co.in/nget/train-search");
				Thread.sleep(2000);
				WebElement oEle = null;
				List<WebElement> oLists = null;
				
				//++++++++++++++++++++++++++++++++++++++++++++++++
				//Edit field validations
				//Findout how many edit fields are present
				oLists = oBrowser.findElements(By.xpath("//input[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
				System.out.println(oLists.size());
				
				oEle=oBrowser.findElement(By.xpath("//input[@placeholder='From*']"));
				oEle.sendKeys("kze");
				Thread.sleep(2000);
				oEle.sendKeys(Keys.ENTER);
					Thread.sleep(2000);
					oEle=oBrowser.findElement(By.xpath("//input[@placeholder='To*']"));
					
					oEle.sendKeys("NLE");
					Thread.sleep(2000);
					oEle.sendKeys(Keys.ENTER);
					Thread.sleep(2000);
					System.out.println(oLists.get(0).getAttribute("value"));
					System.out.println(oLists.get(1).getAttribute("value"));
					Thread.sleep(2000);
					//for date
					
					//for clicking drop down
					oBrowser.findElement(By.xpath("//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right']")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//span[text()='Sleeper (SL)']")).click();
					Thread.sleep(1000);
					oBrowser.findElement(By.xpath("//input[@placeholder='Journey Date(dd-mm-yyyy)*']")).clear();
					Thread.sleep(1000);
					oBrowser.findElement(By.xpath("//input[@placeholder='Journey Date(dd-mm-yyyy)*']")).sendKeys("15-08-2018");
					Thread.sleep(1000);
					oBrowser.findElement(By.xpath("//label[@class='css-label_c t_c']")).click();
					Thread.sleep(2000);
					//oBrowser.findElement(By.xpath("//label[@class='search_btn']")).click();
					//Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//button[@class='search_btn']")).click();
					Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

}


