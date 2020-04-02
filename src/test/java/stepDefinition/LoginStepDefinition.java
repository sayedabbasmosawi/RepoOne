package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;

	
	
	@Given("^use is already in login page$")
	public void use_is_already_in_login_page() {

		System.setProperty("webdriver.chrome.driver", "/Users/sam/eclipse-workspace/freeCEMBdda/driver/chromedriver");
		 driver = new ChromeDriver();
		driver.get("http://hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@When("^title of login page is HubSpt$")
	public void title_of_login_page_is_HubSpt() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("HubSpot"));
		String title = driver.getTitle();
		System.out.println("page title is: "+title);
		Assert.assertEquals(title, "HubSpot Login");
	 
	}
	//      user enters <username> and <password> 
	//      \"(.*)\"
	//  	\"([^\"]*)\"

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		By username1 = By.id("username");
		By password1 = By.id("password");
		driver.findElement(username1).sendKeys(username);
		driver.findElement(password1).sendKeys(password);

	    
	}

	@Then("^user click on button$")
	public void user_click_on_button() {
		driver.findElement(By.id("loginBtn")).click();

	   
	}

	@Then("^user is on homepage$")
	public void user_is_on_homepage() {
		System.out.println("helooooooo");
	}
	
	@Then("^user moves to contact page$")
	public void user_moves_to_contact_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_and(String string, String string2, String string3) {
	   
	}

	@Then("^User close the browser$")
	public void user_close_the_browser() {
	    driver.quit();

	}


	
	
	
	
	

}
