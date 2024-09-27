package homeassignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class LeafTap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("http://leaftaps.com/opentaps");
	      driver.manage().window().maximize();
	      driver.findElement(By.id("Username")).sendKeys("demoSalesManager");
	      driver.findElement(By.name("Password")).sendKeys("crmsfa");
	      driver.findElement(By.className("decorativeSubmit")).click();
	      driver.findElement(By.linkText("CRM/SFA")).click();
	      driver.findElement(By.linkText("Accounts")).click();
	      driver.findElement(By.linkText("Create Account")).click();
	      driver.findElement(By.id("accountName")).sendKeys("Test Account");
	      driver.findElement(By.id("description")).sendKeys("Selenium Automation Tester.");
	      driver.findElement(By.id("numberOfEmployees")).sendKeys("50");
	      driver.findElement(By.id("siteName")).sendKeys("LeafTaps");
	      driver.findElement(By.name("submitButton")).click();
	      System.out.println("Page title is: " + driver.getTitle());
	      driver.quit();

	      
	}

}
