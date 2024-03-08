package selenium.allurereport.testng;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	public WebDriver driver;
	public static ThreadLocal<WebDriver>tdriver=new ThreadLocal<WebDriver>();
	@BeforeTest
	public WebDriver intialize_driver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		//driver.get("https://demo.nopcommerce.com/");
		driver.get("https://demo.nopcommerce.com/");
//		driver.manage().window().maximize();
		driver.manage().window().maximize();
		tdriver.set(driver);
		return getDriver();
	}

	public static synchronized WebDriver getDriver() {
		// TODO Auto-generated method stub
		return tdriver.get();
	}


	
}