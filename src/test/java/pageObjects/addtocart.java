package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addtocart extends Basepage{
	
		public addtocart(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	
		//public Home(WebDriver driver) {
			
		//	super(driver);
		}
		@FindBy(xpath="//input[contains(@class,'sizeQtyInput  Qty_')]/..//input[not(contains(@class,'stockNA'))]") 
		  WebElement sizeselectt;

		@FindBy(xpath="//button[contains(text(),'Buy')]") 
		  WebElement addtocartt;
		
		@FindBy(xpath="//span[@class='shopping-cart-count text-center shopping_cart_count']") 
		  WebElement shopingcart;
		
		@FindBy(xpath="//a[@class='font-13 font-bold']")
		WebElement verificationcart ;

		
		public void selectsize() {
			sizeselectt.click();
		}
		public void addtocart() {
			addtocartt.click();
		}
		public void shopingcat() {
			shopingcart.click();
		}
			
		public String getconfirmationn() {
			try {
				return(verificationcart.getText());
			}catch(Exception e) {
				return(e.getMessage());
			}
}}

		
