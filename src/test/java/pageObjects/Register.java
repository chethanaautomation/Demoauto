package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Register extends Basepage {
	
	
public Register(WebDriver driver) {
	
	super(driver);
	
}
  @FindBy(xpath="//a[@class='trd-links register_link']") 
  WebElement Register;

	@FindBy(xpath="//div[@class='form-group for-tr']//input[@id='reguserid']") 
	WebElement useerid;
	

	@FindBy(xpath="//input[@id='regemail']") 
	WebElement emailid ;
	
	@FindBy(xpath="//input[@id='regpwd']") 
	WebElement pwd ;
	
	@FindBy(xpath="//input[@id='reg-re-enter-pwd']") 
	WebElement repwd ;

	@FindBy(xpath="//input[@id='regMobileNumber']") 
	WebElement phno ;
	
	@FindBy(xpath="//div[@class='col-md-6']") 
	WebElement submit ;
	
	@FindBy(xpath="//p[contains(text(),\"User doesn't exist\")]") 
	WebElement verification ;
	
	public void Register()
	{
		Register.click();
	}
	public void Regidterid(String user)
	{
		 useerid.sendKeys(user);
	}
	
	public void email(String email)
	{
		emailid.sendKeys(email);
	}
	public void password(String pwdd)
	{
		pwd.sendKeys(pwdd);

	}
	public void repassword(String password)
	{
		repwd.sendKeys(password);

	}
	public void Phnono(String pho)
	{
		phno.sendKeys(pho);

	}
	public void submit()
	{
		submit.click();

	}
	public String getconfirmation() {
		try {
			return(verification.getText());
		}catch(Exception e) {
			return(e.getMessage());
			
		}
	}
}



