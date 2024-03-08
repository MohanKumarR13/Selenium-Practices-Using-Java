package selenium.brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/selenium/newtours/login.php");
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Links" + totalLinks.size());

		for (int i = 0; i <= totalLinks.size(); i++) {
			WebElement element = totalLinks.get(i);
			String url = element.getAttribute("href");

			URL link = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) link.openConnection();
			connection.connect();
			int resCode = connection.getResponseCode();
			if (resCode >= 400)
				System.out.println(url + "Link is broken");
			else
				System.out.println(url + "Link is Valid");

		}
	}

}
