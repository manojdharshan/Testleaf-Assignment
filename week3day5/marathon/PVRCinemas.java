package week3day5.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import week1day1.Chrome;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://www.pvrcinemas.com/");

		driver.findElement(By.className("nav-icon")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();

		Thread.sleep(3000);

		WebElement city = driver.findElement(By.xpath("//select[@name='city']"));

		Select nameCity = new Select(city);

		nameCity.selectByVisibleText("Chennai");

		Thread.sleep(3000);

		WebElement genre = driver.findElement(By.xpath("//select[@name='genre']"));

		Select genreList = new Select(genre);

		genreList.selectByVisibleText("ANIMATION");

		Thread.sleep(3000);

		WebElement lang = driver.findElement(By.xpath("//select[@name='lang']"));

		Select langList = new Select(lang);

		langList.selectByVisibleText("ENGLISH");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class='btn btn-submit btn-primary']")).click();
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,250)", "");
		js.executeScript("window.scrollBy(0,-500)");

		driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		
		Thread.sleep(3000);

		WebElement cineName = driver.findElement(By.xpath("//select[@name='cinemaName']"));

		Select cName = new Select(cineName);

		cName.selectByVisibleText("PVR Velachery Chennai");

		Thread.sleep(2000);

		//driver.findElement(By.xpath("//label[text()='Minimum 5 days of prior notice']")).click();
		
		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();

		driver.findElement(By.xpath("//div[@class='main-calendar-days']//span[@class='day-unit ng-star-inserted']")).click();
		
		//driver.findElement(By.xpath("//span[@class='day-unit ng-star-inserted']")).click();

		WebElement cineTiming = driver.findElement(By.xpath("//select[@name='timings']"));

		Select cTime = new Select(cineTiming);

		cTime.selectByVisibleText("06:00 PM - 09:00 PM");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='form-group col-sm-6 input-list']//input[@name='noOfTickets']")).sendKeys("2");

		driver.findElement(By.xpath("//div[@class='form-group col-sm-6 input-list']//input[@name='name']")).sendKeys("Manoj");

		driver.findElement(By.xpath("//div[@class='form-group col-sm-6 input-list']//input[@name='email']")).sendKeys("abc@gmail.com");

		driver.findElement(By.xpath("//div[@class='form-group col-sm-6 input-list']//input[@name='mobile']")).sendKeys("9876554321");

		WebElement food = driver.findElement(By.xpath("//select[@name='food']"));

		Select fdbvgs = new Select(food);

		fdbvgs.selectByVisibleText("Yes");

		driver.findElement(By.xpath("//div[@class='form-group col-sm-6 input-list']//input[@name='comment']")).sendKeys("No Comments");

		driver.findElement(By.xpath("//span[@class='custom-control-description display-block']")).click();

		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();

		driver.findElement(By.xpath("(//li[@class='cancel-btn text-center']//button[text()='CANCEL'])[2]")).click();

		driver.findElement(By.xpath("//button[@aria-label='Close this dialog']")).click();

		String pageTitle = driver.getTitle();

		System.out.println("The current page title is : " + pageTitle);


	}

}
