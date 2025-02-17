package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Basepage {
	public Home(WebDriver driver) {
		
		super(driver);
}
	@FindBy(xpath="//input[@id='userid']") 
	  WebElement username;

	@FindBy(xpath="//input[@id='pwd']") 
	  WebElement pwd;
	
	@FindBy(xpath="//button[@id='login-btn']") 
	  WebElement Login;
	
	@FindBy(xpath="//div[@id='tab-2']//div[@class='subBrandTitle'][normalize-space()='SEASON']") 
	WebElement verification ;
	
	
public void username() {
	username.sendKeys("1212121212");
}
public void pwd() {
	pwd.sendKeys("Dress@123");
}
	public void loginto() {
		Login.click();
	}

	
	public String getconfirmation() {
		try {
			return(verification.getText());
		}catch(Exception e) {
			return(e.getMessage());
}
}}