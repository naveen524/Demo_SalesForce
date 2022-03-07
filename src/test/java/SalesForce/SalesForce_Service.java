package SalesForce;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce_Service {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.salesforce.com/in/work/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement Products = driver.findElement(By.xpath("(//span[text()='Products'])[1]"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(Products).perform();
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Sales '])")));
		driver.findElement(By.xpath("//*[@id=\"drawer_products\"]/div/div/div[1]/ul/li/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"globalnavbar-header-container\"]/div[3]/div/div/div/a")).click();
		Thread.sleep(3000);
		Set<String> windows=driver.getWindowHandles();
		int count = windows.size();
		System.out.println(count);
		Thread.sleep(2000);
		Iterator<String> window=windows.iterator();
		Thread.sleep(2000);
		String window1=window.next();
		Thread.sleep(2000);
		String window2=window.next();
		Thread.sleep(2000);
		driver.switchTo().window(window2);
		driver.findElement(By.name("UserFirstName")).sendKeys("Manneela");
		Thread.sleep(3000);
		driver.findElement(By.name("UserLastName")).sendKeys("Naveen");
		Thread.sleep(2000);
		driver.findElement(By.name("UserEmail")).sendKeys("naveenmanneela@gmail.com");
		Thread.sleep(2000);
		WebElement Job_Title = driver.findElement(By.id("UserTitle-ScJg"));
		Thread.sleep(3000);
		Select s = new Select(Job_Title);
		List<WebElement> alloptions = s.getOptions();
		alloptions.size();
	}
}
