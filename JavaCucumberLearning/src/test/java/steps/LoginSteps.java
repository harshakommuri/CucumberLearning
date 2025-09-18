package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.But;
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

//	@Given("User enter user name as standard_user")
//	public void userEnterUserNameAsOrtoni() {
//	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
//	}
//
//	@Given("User enter password as secret_sauce")
//	public void userEnterPasswordAsPass() {
//	    driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("secret_sauce");
//	}

	@When("User click on login button")
	public void userClickOnLoginButton() {
	    driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	}

	@Then("Login should be success")
	public void loginShouldBeSuccess() {
		System.out.println("Logged in successfully");
		System.out.println(driver.getTitle());
		driver.quit();
	    
	}
	
//	@Given("User enter user name as standard_users")
//	public void userEnterUserNameAsStandard_users() {
//		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_users");
//	}
//
//	@Given("User enter password as secret_auce")
//	public void userEnterPasswordAsSecret_auce() {
//		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("secret_auce");
//	}

	@But("Login should not be success")
	public void loginShouldNotBeSuccess() {
		String text = driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]")).getText();
		Assert.assertEquals(text.trim(), "Epic sadface: Username and password do not match any user in this service");
		driver.quit();
	}
	
	@Given("User enter user name as {string}")
	public void userEnterUserNameAs(String username) {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
	}

	@Given("User enter password as {string}")
	public void userEnterPasswordAs(String password) {
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys(password);
	}
	
}
