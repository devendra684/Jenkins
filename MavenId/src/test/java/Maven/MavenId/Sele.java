package Maven.MavenId;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sele {
	
	@Test(enabled = false)
	public void tc01(String[] args) {
		// TODO Auto-generated method stub

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		String url = "https://www.google.co.in/";
		driver.get(url);
	}
	@Test
	public void tc2(String[] args) throws InterruptedException {

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver2=new ChromeDriver();

		WebDriverManager.edgedriver().setup();
		WebDriver driver2 = new EdgeDriver();
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver2.get(url);
//		driver2.getTitle();
//		driver2.getCurrentUrl();
//		driver2.getPageSource();
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		Thread.sleep(5000);
		driver2.findElement(By.name("username")).sendKeys("Devendra Singh");
		driver2.findElement(By.name("password")).sendKeys("1234");
		driver2.findElement(By.className("oxd-button")).click();
		Thread.sleep(3000);
		WebElement error = driver2.findElement(By.className("oxd-alert-content-text"));
		
		System.out.println(error.getText());
		Thread.sleep(3000);

		driver2.findElement(By.name("username")).sendKeys("Admin");
		driver2.findElement(By.name("password")).sendKeys("admin123");
		driver2.findElement(By.className("oxd-button")).click();
		Thread.sleep(5000);

		driver2.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
		Thread.sleep(3000);
		driver2.findElement(By.className("bi-plus")).click();
		Thread.sleep(4000);
		
		driver2.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Devendra");
		driver2.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Singh");
		WebElement Eid = driver2.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]"));
		Eid.sendKeys(Keys.CONTROL+"a");
		Eid.sendKeys(Keys.DELETE);
		
				Thread.sleep(2000);
		Eid.sendKeys("3535");
		driver2.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		driver2.findElement(By.className("oxd-userdropdown")).click();
		driver2.findElement(By.xpath("//a[@href='/web/index.php/auth/logout']")).click();
		
//		Thread.sleep(3000);
		driver2.quit();
	}
}
