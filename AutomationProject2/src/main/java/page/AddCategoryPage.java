package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategoryPage {

	WebDriver driver;

	public AddCategoryPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "data")
	WebElement addNewData;
	@FindBy(how = How.XPATH, using = "//input[@value='Add']")
	WebElement addButton;

	public void userShouldBeAbleToAddNewCategory() {
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(21);
		addNewData.sendKeys("JUNGLE" + randomNumber);
		addButton.click();
	}

}
