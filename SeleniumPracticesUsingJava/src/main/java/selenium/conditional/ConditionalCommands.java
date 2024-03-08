package selenium.conditional;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalCommands {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[normalize-space()='Create new account'])[1]")).click();
		WebElement email = driver.findElement(By.id("u_e_g_K9"));
		WebElement pwd = driver.findElement(By.id("password_step_input"));

		if (email.isDisplayed() && email.isEnabled()) {
			email.sendKeys("pavan@gmail");
		}

		if (pwd.isDisplayed() && pwd.isEnabled()) {
			pwd.sendKeys("pavan@1234");
		}
		System.out.println(driver.findElement(By.id("u_e_4_80")).isSelected());
		System.out.println(driver.findElement(By.id("u_e_5_OK")).isSelected());
		if (driver.findElement(By.id("u_e_5_OK")).isSelected() == false) {
			driver.findElement(By.id("u_e_5_OK")).click();
		}
		driver.quit();

	}

}
