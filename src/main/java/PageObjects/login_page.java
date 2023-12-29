package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	
	WebDriver driver;
	
	public login_page(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="Email")
	WebElement email;
	@FindBy(id="Password")
	WebElement pass;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement logbtn;
	
	@FindBy(xpath="//li/a[@class='ico-logout']")
	WebElement logout;

	public void loginpage(String username,String password) {
		email.sendKeys(username);
		pass.sendKeys(password);
		
		
	}
	public void clickthelg() {
		logbtn.click();
	}
	public void clicklogout() {
		logout.click();
		
	}
}
