package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MonthDropDownPage extends BasePage {

	WebDriver driver;
	
	public MonthDropDownPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//select[option='None'] [3]")WebElement monthList;
	
	public void monthDropDownList() throws InterruptedException {
		monthList.click();
		Thread.sleep(3000);
	}
	 
	public String allMonths() {
		return driver.getTitle();
		
	}
	
}
