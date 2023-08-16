package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		//Get Title

		String title = driver.getTitle();

		System.out.println(title);

		//click crmsfa

		driver.findElement(By.linkText("CRM/SFA")).click();

		//click leads

		driver.findElement(By.linkText("Leads")).click();
		
		//Goto Find Leads
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Enter Lead Id
		
		
		
		//Enter Lead Id (11842)
		
		driver.findElement(By.xpath("//*[@id=\"ext-gen246\"]")).sendKeys("11842");
		
		//Enter First name
		
		driver.findElement(By.xpath("//*[@id=\"ext-gen248\"]")).sendKeys("Jonam");
		
		//Enter Last name
		
		driver.findElement(By.xpath("//*[@id=\"ext-gen250\"]")).sendKeys("Mano");
		
		//Enter Company Name
		
		driver.findElement(By.xpath("//*[@id=\"ext-gen252\"]")).sendKeys("Google");
		
		//Click Find Leads
		
		driver.findElement(By.xpath("//*[@id=\"ext-gen334\"]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"ext-gen869\"]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"ext-gen870\"]")).click();
		
		//Get Title
		
		String title2 = driver.getTitle();
		
		System.out.println(title2);
		
			
		
		

	}

}
