package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.AddCategoryPage;
import util.BrowserFactory;

public class AddCategoryTest {

	WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
	driver = BrowserFactory.startBrowser();
	}
	@Test
	public void userShouldBeAbleToGoToSite() {
		
		driver.get("https://techfios.com/test/101/");
		
		System.out.println("Before Adding " + driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		AddCategoryPage addCategoryPage = PageFactory.initElements(driver, AddCategoryPage.class);
		addCategoryPage.userShouldBeAbleToAddNewCategory();
		System.out.println("After Adding " + driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
		
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
}
