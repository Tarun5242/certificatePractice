package certificatePracticeCode;
t;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\tarun\\Desktop\\Seljar\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   //driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 
	    driver.quit();
	   
	}
	

}
