package Maven.MavenId;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		String url="https://rahulshettyacademy.com/seleniumPractise/#/";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.className("product-action")).click();//Add a product in Cart

		// Add a particular product by its name
		WebElement Name = driver.findElement(By.xpath("//h4[contains(text(),'Cucumber - 1 Kg')]"));
//		Name.click();
		Thread.sleep(2000);
		WebElement Maindiv = Name.findElement(By.xpath("./..")); //Going to its parent tag
		WebElement IncQty = Maindiv.findElement(By.className("increment")); //Increasing no.of quantity
		IncQty.click();
		IncQty.click();
		Thread.sleep(2000);
		Maindiv.findElement(By.className("product-action")).click(); //Add the product in Cart
		
		Thread.sleep(3000);
		driver.findElement(By.className("cart-icon")).click(); //Show the products in cart
		Thread.sleep(2000);
		driver.findElement(By.className("product-remove")).click(); // Remove a product from cart


		// Remove a particular product by its name fromcart
//		WebElement CartDiv = driver.findElement(By.className("cart-item")); 
//		Thread.sleep(2000);
//		WebElement ParticularProdDiv = CartDiv.findElement(By.xpath("//p[contains(text(),'Cucumber - 1 Kg')]"));
//		Thread.sleep(2000);
//		WebElement RmvParticularProd = ParticularProdDiv.findElement(By.xpath("./..")); 

//		WebElement Name = driver.findElement(By.cssSelector("h4[text()*='Cucumber']"));
//		Thread.sleep(2000);
//		RmvParticularProd.findElement(By.className("product-remove")).click(); 
				
				
		Thread.sleep(4000);
		driver.close();
	}

}
