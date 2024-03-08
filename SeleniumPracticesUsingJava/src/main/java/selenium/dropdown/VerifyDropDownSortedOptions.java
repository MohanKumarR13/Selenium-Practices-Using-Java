package selenium.dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyDropDownSortedOptions {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println(driver.getTitle());
		WebElement element = driver.findElement(By.id("animals"));
		Select select = new Select(element);
		List originalList = new ArrayList();
		List tempList = new ArrayList();

		List<WebElement> options = select.getOptions();
		for (WebElement webElement : options) {
			originalList.add(webElement.getText());
			tempList.add(webElement.getText());
		}
		System.out.println(originalList);
		tempList = originalList;
		System.out.println("Before Sorting Original" + originalList);
		System.out.println("Before Sorting " + tempList);

		Collections.sort(tempList);
		System.out.println("After Sorting" + tempList);
		System.out.println("After Sorting Original" + originalList);
		if (originalList == tempList) {
			System.out.println("Dropdown Sorted");
		} else {
			System.out.println("Dropdown Sorted");

		}

	}

}
