package Testing.Seleniumframeworkdemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		LandingPage l1=new LandingPage(driver);
		l1.goTo();
		ProductCatalogue p1=l1.Loginapplication("harshitp@gmail.com", "Minku@123");
		
		p1.getProductList();
		WebElement p4=p1.getProductByName("ZARA COAT 3");
		System.out.println(p4.getText());
		Cartpage c1=p1.clickOnCart("ZARA COAT 3");
		checkoutPage check=c1.checkoutButton();
		orderSummaryPage o1=check.clickOnCheckout();
		o1.enterDropdown("india");
		o1.selectDropdown();
		orderNotification o2=o1.placeOrder();
		String s2=o2.getLabel();
		
		
		
		
		
		
	
		Assert.assertEquals(s2,"THANKYOU FOR THE ORDER.");
		driver.quit();

	}

}
