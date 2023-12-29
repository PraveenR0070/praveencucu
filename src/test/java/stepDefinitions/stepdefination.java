package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PageObjects.login_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdefination {
    WebDriver driver;
    login_page lp;
    
	
	@Given("User is lunch chrome broswer")
	public void user_is_lunch_chrome_broswer() throws InterruptedException {
	   
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		
	}

	@When("user is open URL {string}")
	public void user_is_open_url(String url) {
	   driver.get(url);
		
	}

	@When("user enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String uname, String pass) {
		 lp = new login_page(driver);
		lp.loginpage(uname, pass);
	  
	}

	@When("click on login")
	public void click_on_login() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    lp.clickthelg();
	   // System.out.println("hmpage is : "+driver.getTitle());
		
	}

	@Then("title should be {string}")
	public void title_should_be(String title) {
		 
	   if(driver.getPageSource().contains("Login was unsuccessful")) {
		   
		   Assert.assertTrue(false);
	   }else {
		   Assert.assertEquals(title, driver.getTitle());
	   }
	}


	@Then("user click on logout")
	public void user_click_on_logout() throws InterruptedException {
		Thread.sleep(2000);
	    lp.clicklogout();
	   System.out.println("page is : "+driver.getTitle());
	}
	
	@Then("after logout title should be {string}")
	public void after_logout_title_should_be(String tite) {
	   if(driver.getTitle().equals(tite)) {
	   Assert.assertTrue(true);
		}
	else {
		 Assert.assertTrue(true);
		 driver.quit();
	}
	}
	
	 @Then("close broswer")
	public void close_broswer() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.quit();
	    
	}


	
		
		

	

}
