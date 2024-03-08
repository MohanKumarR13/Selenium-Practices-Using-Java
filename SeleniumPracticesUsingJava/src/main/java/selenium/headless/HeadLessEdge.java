package selenium.headless;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessEdge {
	static WebDriver driver;

	public static void main(String[] args) {
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.setHeadless(true);
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver(edgeOptions);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	}

}
