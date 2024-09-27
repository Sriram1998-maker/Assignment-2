package homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ChromeDriver driver = new ChromeDriver();
	       driver.get("https://leafground.com/button.xhtml");
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath("//button[text()='Click and Confirm title.']")).click();
	       String pageTitle = driver.getTitle();
	       System.out.println("Page title verified: " + pageTitle);
	       driver.navigate().back();
	       driver.findElement(By.xpath("//button[text()='Confirm if the button is disabled']"));
	       WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
           System.out.println("Position of 'Submit' button: " + submitButton.getLocation());
           WebElement saveButton = driver.findElement(By.xpath("//button[text()='Find the Save button color.']"));
           String backgroundColor = saveButton.getCssValue("background-color");
           WebElement sizeButton = driver.findElement(By.xpath("//button[text()='Find the height and width of this button.']"));
           int height = sizeButton.getSize().getHeight();
           int width = sizeButton.getSize().getWidth();
           driver.quit();
	}
}
	       

	         
	         

	          

	         


