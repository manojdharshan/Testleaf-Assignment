package week3day5.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys("bags ");
		
		driver.findElement(By.xpath("//span[text()='for boys']")).click();
		
		String gtxt = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		
		System.out.println("Search Result : " + gtxt);
		
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//a)[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//a)[3]")).click();
		
		driver.findElement(By.xpath("//span[@class='a-dropdown-container']")).click();
		
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		String nameBag = driver.findElement(By.xpath("//span[text()='Unisex Grey Jacqard 34L Laptop Bags']")).getText();
		
		System.out.println("Bag Name : " + nameBag);
		
		String bagPrice = driver.findElement(By.xpath("//div[@class='a-row a-size-base a-color-base']//span[@class='a-price-whole']")).getText();
		
		System.out.println("Bag Price " + bagPrice);
		
		String pageTitle = driver.getTitle();
		
		System.out.println("Name of the title page : " + pageTitle);
		
		//driver.close();
		
		
		


	}

}
