package selenium.getmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCommands {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/selenium/newtours/login.php");
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		String date = driver.findElement(By.xpath("(//b[normalize-space()='Jul 6, 2017'])[1]")).getText();
		System.out.println(date);
		driver.quit();

	}

}
