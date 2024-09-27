package homeassignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
	     driver.get("https://www.facebook.com");
	     driver.findElement(By.linkText("Create new account")).click();
	     driver.findElement(By.name("First Name")).sendKeys("Sriram");
	     driver.findElement(By.name("Surname")).sendKeys("Mathiyazhagan");
	     driver.findElement(By.name("Email")).sendKeys("sriram.mathi@ext.com");
	     driver.findElement(By.name("Password")).sendKeys("sriram@123");
	     Select DD = new Select(driver.findElement(By.name("Birthday")));
         DD.selectByVisibleText("15");
         Select MD = new Select(driver.findElement(By.name("Month")));
         MD.selectByVisibleText("April");
         Select Year = new Select(driver.findElement(By.name("Year")));
         Year.selectByVisibleText("1990");
         WebElement RadioButton = driver.findElement(By.xpath("//input[@value='2']"));
         RadioButton.click();
         System.out.println("Registration form filled out successfully.");
         driver.quit();

	}

}
