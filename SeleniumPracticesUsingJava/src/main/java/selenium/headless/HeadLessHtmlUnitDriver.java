package selenium.headless;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessHtmlUnitDriver {
	static WebDriver driver;

	public static void main(String[] args) {
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
