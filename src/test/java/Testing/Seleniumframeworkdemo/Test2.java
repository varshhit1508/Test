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

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/client");
		LandingPage l1=new LandingPage(driver);
		l1.goTo();
		l1.Loginapplication("harshitp@gmail.com", "Minku@123");
		driver.findElement(By.id("userEmail")).sendKeys("harshitp@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Minku@123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		List<WebElement> w=driver.findElements(By.cssSelector(".col-lg-4"));
		
		for(WebElement ele:w) {
			System.out.println(ele.findElement(By.tagName("b")).getText());
			if(ele.findElement(By.tagName("b")).getText().equals("ZARA COAT 3")) {
				System.out.println("hello");
				ele.findElement(By.xpath("//button[@class='btn w-10 rounded']")).click();
			}
				
			
		}
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		w1.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("ng-animating")));
		
		
		
		driver.findElement(By.xpath("(//button[@class='btn btn-custom'])[3]")).click();
		driver.findElement(By.xpath("//button[text()='Checkout']")).click();
		driver.findElement(By.cssSelector(".input.txt.text-validated:nth-child(1)")).sendKeys("india");
		driver.findElement(By.xpath("(//button[@class='ta-item list-group-item ng-star-inserted'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='btnn action__submit ng-star-inserted']")).click();
		String s1=driver.findElement(By.cssSelector("h1:nth-child(1)")).getText();
		Assert.assertEquals(s1,"THANKYOU FOR THE ORDER.");
		driver.quit();

	}

}
