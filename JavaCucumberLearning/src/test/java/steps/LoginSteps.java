package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	WebDriver driver = new ChromeDriver();
	@Given("User navigate to the Swag Labs application")
	public void userNavigateToTheBookcartApplication() {
	    driver.get("https://www.saucedemo.com/");
	    System.out.println(driver.getTitle());
	}
	
//	@Given("User click on login button1")
//	public void userClickOnLoginButton1() {
//	    driver.findElement(By.xpath("//span[normalize-space() = 'Login']")).click();
//	}

	@Given("User enter user name as standard_user")
	public void userEnterUserNameAsOrtoni() {
	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	}

	@Given("User enter password as secret_sauce")
	public void userEnterPasswordAsPass() {
	    driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("secret_sauce");
	}

	@When("User click on login button")
	public void userClickOnLoginButton() {
	    driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	}

	@Then("Login should be success")
	public void loginShouldBeSuccess() {
		System.out.println("Logged in successfully");
		System.out.println(driver.getTitle());
	    
	}
}
