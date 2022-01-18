package jar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LuminorSetGet {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    String url = "https://luminor.ee/currency-rates";
	    driver.get(url);
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
        driver.findElement(By.xpath("//label[text()='I sell']//preceding::input")).sendKeys("100");
        /* driver.manage().deleteAllCookies();
       driver.findElement(By.xpath("//label[text()='I sell']//preceding::span[text()='EUR'][2]")).click();
       driver.findElement(By.xpath("//button[text()='USD']")).click();
       WebElement element = driver.findElement(By.id("input_name"));
        String elementval = element.getAttribute("value");*/
        String attribute=driver.findElement(By.xpath("//label[text()='I buy']//preceding::input[1]")).getAttribute("value");
        System.out.println("text is:"+attribute);
         
        
	}


}
