package SalesForce;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_TrailFree {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.salesforce.com/in/work/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"globalnavbar-header-container\"]/div[3]/div/div/div/a/span")).click();
	Set<String> Allwh=driver.getWindowHandles();
	int count = Allwh.size();
	System.out.println(count);
	Thread.sleep(2000);
	Iterator<String> windows=Allwh.iterator();
	Thread.sleep(2000);
	String window1=windows.next();
	Thread.sleep(2000);
	String window2=windows.next();
	Thread.sleep(2000);
	driver.switchTo().window(window2);
	driver.findElement(By.name("UserFirstName")).sendKeys("Manneela");
	Thread.sleep(3000);
	driver.findElement(By.name("UserLastName")).sendKeys("Naveen");
	Thread.sleep(2000);
	driver.findElement(By.name("UserEmail")).sendKeys("navi@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("UserTitle")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("UserTitle")).sendKeys("Developer / Software Engineer / Analyst");
	Thread.sleep(2000);
	driver.findElement(By.name("CompanyName")).sendKeys("cognizant");
	Thread.sleep(2000);
	driver.findElement(By.name("CompanyEmployees")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("CompanyEmployees")).sendKeys("1501+ employees");
	Thread.sleep(2000);
	driver.findElement(By.name("UserPhone")).sendKeys("1050501052");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='start my free trial']")).click();
	Thread.sleep(2000);
}
}
