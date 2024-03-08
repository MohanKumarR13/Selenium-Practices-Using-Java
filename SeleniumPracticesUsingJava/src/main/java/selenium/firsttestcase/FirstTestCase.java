package selenium.firsttestcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestCase {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/selenium/newtours/login.php");
		driver.findElement(By.name("userName")).sendKeys("mohan");
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.name("submit")).click();

		String expTitle = "Sign-on: Mercury Tours ";
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		if (expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		driver.quit();

	}

}
