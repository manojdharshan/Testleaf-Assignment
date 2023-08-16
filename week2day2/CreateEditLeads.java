package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateEditLeads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");


		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//driver.findElement(By.id("password")).sendKeys("crmsfa",Keys.ENTER);

		driver.findElement(By.className("decorativeSubmit")).click();

		//Get Title

		String title = driver.getTitle();

		System.out.println(title);

		//click crmsfa

		driver.findElement(By.linkText("CRM/SFA")).click();

		//click leads

		driver.findElement(By.linkText("Leads")).click();

		//create leads

		driver.findElement(By.linkText("Create Lead")).click();

		//Enter company name

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Dell");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sjonam");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sman");

		//driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyzabc@gmail.com");

		//driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8876543210");

		driver.findElement(By.name("submitButton")).click();

		//Verify the text

		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();

		System.out.println(text);
		
		//Edit Lead
		
		driver.findElement(By.linkText("Edit")).click();
		
		//Update Company Name
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Alphabet");
		
		driver.findElement(By.name("submitButton")).click();
		
		
	}

}
