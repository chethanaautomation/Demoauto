package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends Basepage
{
public Search(WebDriver driver) {
	super(driver);
		
}
@FindBy(xpath="//div[@id='tab-2']//div[@class='subBrandBlock season']//div[@class='subBrandLogoBlock']//div[2]//a[1]//div[1]//div[1]//img[1]") 
WebElement subbrnd;

@FindBy(xpath="//a[@class='headerSearchIcon']//*[name()='svg']") 
WebElement search;

@FindBy(xpath="//input[@id='top_search']")
WebElement Searchtrigger;

/*@FindBy(xpath="//input[@id='top_search']")
WebElement Searchenter;

@FindBy(xpath="div[id='searchInputBlock'] li:nth-child(1) a:nth-child(1)")
WebElement selectedstylcode;

@FindBy(xpath="//input[@id='top_search']")
WebElement selectedstylenterandclick;*/


@FindBy(xpath="//a[@class='addNewProductId']")
WebElement verification ;


public void subbrand() {
	subbrnd.click();
}
public void search() {
	search.click();
}
//public void searchtrigger() {
//	Searchenter.sendKeys("ALDNVTRFG51402");
//}

public void enterAndSubmit(String inputText) {
    // Locate the input field
    WebElement inputField = driver.findElement(By.xpath("//input[@id='top_search']"));

    // Enter the text and then press Enter
    inputField.sendKeys(inputText+ Keys.ENTER);
}

//public void select () {
	//selectedstylcode.click();
	
	
//}

//public void enter() {
//	selectedstylenterandclick.click();
//}

public String getconfirmation() {
	try {
		return(verification.getText());
	}catch(Exception e) {
		return(e.getMessage());
}
}}