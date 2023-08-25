package week3day5.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.abhibus.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("(//a[text()='Bus'])[2]")).click();

		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Chennai");

		driver.findElement(By.xpath("//li[text()='Chennai']")).click();

		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Bangalore");

		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();

		driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();

		driver.findElement(By.xpath("(//a[text()='26'])[1]")).click();

		driver.findElement(By.xpath("//a[@class='btn btn-main px-5 py-2 border-right-radius']")).click();

		//String title = driver.getTitle();

		//System.out.println("Title of the page : " + title);

		String nameText = driver.findElement(By.xpath("//h2[@class='TravelAgntNm ng-binding']")).getText();

		System.out.println("Name of the First Bus : " + nameText);

		driver.findElement(By.xpath("//input[@title='SLEEPER']")).click();

		String seatsAvailable = driver.findElement(By.xpath("//div[@class='search-column2-col1']//p[@class='noseats AvailSts ng-binding']")).getText();

		System.out.println("Seats Available : " + seatsAvailable);

		//select seat 

		driver.findElement(By.xpath("//a[@class='btn-seatselect book1']//span[1]")).click();

		driver.findElement(By.xpath("//a[@id='UO4-1ZZ']")).click();

		String seatNumber = driver.findElement(By.xpath("//div[@class='clearfix']//span[@id='seatnos']")).getText();

		System.out.println("The Seat Number is : " + seatNumber);

		String ticketPrice = driver.findElement(By.xpath("//div[@class='clearfix']//span[@id='ticketfare']")).getText();

		System.out.println("The Ticket Price is : " + ticketPrice);

		//select boarding point

		driver.findElement(By.xpath("//div[@class='f-boarding-point']")).click();

		driver.findElement(By.xpath("//div[@class='f-b-p-search filter-list']//label[text()='Aminjikarai Market']")).click();

		Thread.sleep(3000);

		//driver.findElement(By.xpath("//div[@class='f-boarding-point']")).click();

		//select dropping point

		driver.findElement(By.xpath("//div[@class='f-dropping-point']")).click();

		driver.findElement(By.xpath("//div[@class='f-d-p-search filter-list']//label[text()='Anand Rao Circle(Race Course Road)']")).click();

		Thread.sleep(3000);

		//driver.findElement(By.xpath("//div[@class='f-dropping-point']")).click();

		//get title

		String pageTitle = driver.getTitle();

		System.out.println("The title of the page is : " + pageTitle);




	}

}
