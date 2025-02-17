package Stepdefination;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Steps {
	WebDriver driver;
	@Given("Access to Application")
	public void access_to_application() {
	 driver= new ChromeDriver();
	//	driver.get("https://www.mflbooking.in/");
	//	driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@When("user Enter credentials\\(user name:{string}, Password:{string})")
	public void user_enter_credentials_user_name_password(String user, String pwd) {
	   driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(user);
	   driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys(pwd);

	}

	@When("user click on Login button")
	public void user_click_on_login_button() {
	    driver.findElement(By.xpath("//button[@id='login-btn']")).click();
	}

	@Then("user should be navigate to My account page")
	public void user_should_be_navigate_to_my_account_page() {
	   driver.findElement(By.xpath("//a[@class='dropdown-toggle font-12 clearfix text-left']//span[@class='profile font-13'][normalize-space()='H']")).click();
	}

	@Then("user should be see My profile")
	public void user_should_be_see_my_profile() {
	 boolean welcome=driver.findElement(By.xpath("//span[normalize-space()='My Profile']")).isDisplayed();
	  Assert.assertEquals(welcome, true);
	  driver.quit();
	}
}
