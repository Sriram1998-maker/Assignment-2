package homeassignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ChromeDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("http://leaftaps.com/opentaps");
	      driver.findElement(By.id("Username")).sendKeys("demoSalesManager");
	      driver.findElement(By.name("Password")).sendKeys("crmsfa");
	      driver.findElement(By.linkText("Accounts")).click();
	      driver.findElement(By.linkText("Create Account")).click();
	      driver.findElement(By.id("accountName")).sendKeys("Test Account");
	      driver.findElement(By.id("description")).sendKeys("Selenium Automation Tester");
	      Select iD = new Select(driver.findElement(By.id("industryId")));
          iD.selectByVisibleText("Computer Software");
          Select OD = new Select(driver.findElement(By.id("ownershipId")));
          OD.selectByVisibleText("S-Corporation");
          Select SD = new Select(driver.findElement(By.id("dataSource")));
          SD.selectByValue("Employee");
          Select CD = new Select(driver.findElement(By.id("marketingCampaign")));
          CD.selectByIndex(1);
          Select stateDropdown = new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
          stateDropdown .selectByValue("Texas");
          driver.findElement(By.name("submitButton")).click();
          driver.quit();
	      
	}

}
