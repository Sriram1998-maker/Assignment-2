package homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.leafground.com/radio.xhtml");
	    driver.manage().window().maximize();
	    WebElement favoriteBrowser = driver.findElement(By.xpath("//label[text()='Chrome']/preceding-sibling::input"));
	    favoriteBrowser.click();
	    System.out.println("Selected 'Your most favourite browser': Chrome");
	    if (favoriteBrowser.isSelected()) {
            System.out.println("The radio button 'Chrome' is now unselected.");
        } else {
            System.out.println("The radio button 'Chrome' is still selected.");
        }
	    driver.findElement(By.xpath("//input[@name='age' and @checked]/following-sibiling::label"));
	    WebElement ageGroup = driver.findElement(By.xpath("//label[text()='21-40 Years']/preceding-sibling::input"));
	    ageGroup.click();
	    if (ageGroup.isSelected()) {
	    	System.out.println("Selected the age group: 21-40 Years");
        } else {
            System.out.println("The age group '21-40 Years' was already selected.");
        }
        driver.quit();
	}
}

	    


	          
	         
	          
	            
	            

	        

	    
}
