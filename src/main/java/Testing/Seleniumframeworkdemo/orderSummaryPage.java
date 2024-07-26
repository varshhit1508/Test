package Testing.Seleniumframeworkdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.utilities;

public class orderSummaryPage extends utilities{
	WebDriver driver;

	public orderSummaryPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".input.txt.text-validated:nth-child(1)")
	WebElement dropdown;
	
	@FindBy(xpath="(//button[@class='ta-item list-group-item ng-star-inserted'])[2]")
	WebElement dropdownvalue;
	
	@FindBy(xpath="//a[@class='btnn action__submit ng-star-inserted']")
	WebElement submit;
	
	public void enterDropdown(String value) {
		dropdown.sendKeys(value);
		
	}
	
	public void selectDropdown() {
		dropdownvalue.click();
	}
	
	public orderNotification placeOrder() {
		submit.click();
		orderNotification ord=new orderNotification(driver);
		return(ord);
		
	}

}
