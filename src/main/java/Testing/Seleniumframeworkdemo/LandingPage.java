package Testing.Seleniumframeworkdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.utilities;

public class LandingPage extends utilities {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="userEmail")
	WebElement useremail;
	@FindBy(id="userPassword")
	WebElement userpassword;
	@FindBy(id="login")
	WebElement button;
	
	public ProductCatalogue Loginapplication(String email1,String pass1) {
		useremail.sendKeys(email1);
		userpassword.sendKeys(pass1);
		button.click();
		ProductCatalogue product=new ProductCatalogue(driver);
		return(product);
	}
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}

}
