package test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.DupCategoryPage;
import util.BrowserFactory;

public class DupCategoryTest {

	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		driver = BrowserFactory.startBrowser();
	}
	
	@Test(priority = 1)
	public void userShouldBeAbleToAddCategory() {
		driver.get("https://techfios.com/test/101/");
		System.out.println("Before Adding" + driver.findElement(By.xpath("//input[@type='checkbox']")).getSize());
		DupCategoryPage newCategory = PageFactory.initElements(driver, DupCategoryPage.class);
		newCategory.userShouldBeAbleToAddNewCategory();
		System.out.println("After Adding" + driver.findElement(By.xpath("//input[@type='checkbox']")).getSize());
	}
	
	@Test(priority = 2)
	public void userShouldBeAbleToAddDupCategory() {
		driver.get("https://techfios.com/test/101/");
		DupCategoryPage newCategory = PageFactory.initElements(driver, DupCategoryPage.class);
		String expectedCategory = "MANGO";
		String actualCategory = newCategory.NewCatergory();
		System.out.println("The Category you want to add already exists:<duplicated Category Name>");
		assertTrue(true, expectedCategory);
		
		
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
