package homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("Username")).sendKeys("Sriram");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("Submit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.xpath("//input[@id='Company Name']")).sendKeys("Indium Software");
        driver.findElement(By.xpath("//input[@id='First Name']")).sendKeys("Sriram");
        driver.findElement(By.xpath("//input[@id='Last Name']")).sendKeys("Mathi");
        driver.findElement(By.xpath("//input[@id='Lead Name']")).sendKeys("John");
        driver.findElement(By.name("departmentName")).sendKeys("IT");
        driver.findElement(By.id("Description")).sendKeys("This is sample description");
        driver.findElement(By.id("Primary Email address")).sendKeys("sriram.mathi@example.com");
        WebElement stateDropdown = driver.findElement(By.name("Country"));
        Select stateSelect = new Select(stateDropdown);
        stateSelect.selectByVisibleText("New York");
        driver.findElement(By.name("Submit")).click();
        driver.findElement(By.linkText("Edit")).click();
        WebElement descriptionField = driver.findElement(By.id("Description"));
        descriptionField.clear();
        driver.findElement(By.id("Important Note")).sendKeys("This is an important note.");
        driver.findElement(By.name("Submit")).click();
        String pageTitle = driver.getTitle();
        System.out.println("The title of the resulting page is: " + pageTitle);
        driver.quit();
	}
}
