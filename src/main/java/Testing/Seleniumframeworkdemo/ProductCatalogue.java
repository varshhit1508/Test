package Testing.Seleniumframeworkdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.utilities;

public class ProductCatalogue extends utilities {
	WebDriver driver;
	
	public ProductCatalogue(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css=".col-lg-4")
	List<WebElement>product;
	
	By product1=By.cssSelector(".col-lg-4");
	By Addtocart=By.xpath("(//button[@class='btn btn-custom'])[3]");
	By toastmessage=By.cssSelector("#toast-container");
	By disappear=By.cssSelector("ng-animating");
	
	public List<WebElement>getProductList() {
		waitForElementToAppear(product1);
		return product;
		
	}
	
	public WebElement getProductByName(String productname) {
		WebElement prod=getProductList().stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals(productname)).findFirst().orElse(null);
		System.out.println(prod);
		return(prod);
	}
	public Cartpage clickOnCart(String productname) {
		WebElement prod=getProductByName(productname);
		prod.findElement(Addtocart).click();
		waitForElementToAppear(toastmessage);
		 waitForElementToDisAppear(disappear);
		 Cartpage cart=new Cartpage(driver);
		
		 return(cart);
	}
	

}
