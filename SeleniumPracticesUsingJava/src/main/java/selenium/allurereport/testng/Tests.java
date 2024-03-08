package selenium.allurereport.testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
/*https://repo.maven.apache.org/maven2/io/qameta/allure/allure-commandline/2.9.0/
*/
@Listeners({AllureListeners.class})
public class Tests extends Base_Class{
	
	@Test(priority=1,description="Verify logo")
	@Description("Verify logo")
	@Epic(value = "Ep001")
	@Feature("Feature1:Logo")
	@Story("Logo Presence")
	@Step("Verify Logos")
	@Severity(SeverityLevel.MINOR)
	public void logoPresence() {
	boolean status=	driver.findElement(By.xpath("//div[@class='header-logo']//a//img")).isDisplayed();
	Assert.assertEquals(status, true);
	}
	@Test(priority=2,description="Verify login")
	@Description("Verify login")
	@Epic(value = "Ep002")
	@Feature("Feature2:Login")
	@Story("Login Presence")
	@Step("Verify Login")
	@Severity(SeverityLevel.BLOCKER)
	public void loginTest() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("svgvedha@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("moh@n&kum@rR13");
	
		driver.findElement(By.linkText("Log in")).click();
		//Assert.assertEquals(driver.getTitle(), "nopCommerce demo store123");
	}
	
	@Test(priority=3)
	@Description("Verify Skip")
	@Epic(value = "Ep003")
	@Feature("Feature3:Skip")
	@Story("Skip")
	@Step("Verify Skip")
	@Severity(SeverityLevel.NORMAL)
	public void registerationTest() {
		throw new SkipException("Skipping this Test");
	}
/*	@AfterClass
	public void tearDown() {
		driver.quit();
	
}*/


}