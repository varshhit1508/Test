package Testing.Seleniumframeworkdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.utilities;

public class Cartpage extends utilities {
	WebDriver driver;

	public Cartpage(WebDriver driver) {
		
	super(driver);
	this.driver=driver;
	PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkoutbutton;
	
	public checkoutPage checkoutButton() {
		
		checkoutbutton.click();
		checkoutPage checkout=new checkoutPage(driver);
		return(checkout);
	}

}
