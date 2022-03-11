package testscript;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestScript1 {
	WebDriver driver;
	@Given("user open chrome browser")
	public void user_open_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91912\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@Given("navigates to newtours")
	public void navigates_to_newtours() {
		 driver.get("https://demo.guru99.com/test/newtours/");
	   
	}

	@When("user enters valid username")
	public void user_enters_valid_username() {
	    driver.findElement(By.name("userName")).sendKeys("mercury");
	}

	@When("user enters valid password")
	public void user_enters_valid_password() {
	    driver.findElement(By.name("password")).sendKeys("mercury");
	}

	@When("usetr clicks on sunmit")
	public void usetr_clicks_on_sunmit() {
	   driver.findElement(By.name("submit")).click();
	}

	@Then("verify login success")
	public void verify_login_success() {
	    Assert.assertTrue(driver.getTitle().contains("Login"));
	}

	@Then("close the browser")
	public void close_the_browser() {
	    driver.close();
	}
	@When("user clicks on register link")
	public void user_clicks_on_register_link() {
	  driver.findElement(By.linkText("REGISTER")).click();
	}

	@When("user enter username")
	public void user_enter_username() {
	   driver.findElement(By.name("email")).sendKeys("chavaku");
	}

	@When("user enter password")
	public void user_enter_password() {
	    driver.findElement(By.name("password")).sendKeys("raju1234");
	}

	@When("users enter confirmpassword")
	public void users_enter_confirmpassword() {
	   driver.findElement(By.name("confirmPassword")).sendKeys("raju1234");
	}

	@Then("click on Register button")
	public void click_on_Register_button() {
	   driver.findElement(By.name("submit")).click();
	}

	@Then("verify register success")
	public void verify_register_success() {
	   String signoff=driver.findElement(By.linkText("SIGN-OFF")).getText();
	   Assert.assertEquals("SIGN-OFF",signoff);
	}
}