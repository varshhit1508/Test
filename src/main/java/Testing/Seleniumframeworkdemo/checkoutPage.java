package Testing.Seleniumframeworkdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.utilities;

public class checkoutPage extends utilities {
	
	WebDriver driver;
	
	public checkoutPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkoutbutton;
	
	public orderSummaryPage clickOnCheckout() {
		
		checkoutbutton.click();
		orderSummaryPage order=new orderSummaryPage(driver);
		return(order);
	}

}
