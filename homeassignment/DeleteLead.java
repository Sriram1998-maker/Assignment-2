package homeassignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ChromeDriver driver = new ChromeDriver();
	            // Load the URL
	            driver.get("http://leaftaps.com/opentaps/");

	            // Maximize the browser window
	            driver.manage().window().maximize();
	            driver.findElement(By.name("Username")).sendKeys("Sriram");
	            driver.findElement(By.name("Password")).sendKeys("sriram@123");
	            driver.findElement(By.className("Submit")).click();
	            driver.findElement(By.linkText("CRM/SFA")).click();
	            driver.findElement(By.linkText("Leads")).click();
	            driver.findElement(By.linkText("Find Leads")).click();
	            driver.findElement(By.xpath("//a[text()='Phone']")).click();
	            driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
	            driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	            driver.findElement(By.xpath("//a[text()='Delete']")).click();
	            driver.findElement(By.name("id")).sendKeys("leadID");
	            driver.findElement(By.xpath("//div[text()='No records to display']"));
	            driver.quit();
	}
}

