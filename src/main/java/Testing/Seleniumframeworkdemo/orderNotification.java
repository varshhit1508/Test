package Testing.Seleniumframeworkdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.utilities;

public class orderNotification extends utilities {
	WebDriver driver;

	public orderNotification(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="h1:nth-child(1)")
	WebElement label;
	String s1;
	public String getLabel() {
		s1=label.getText();
		return(s1);
	}
	

}
