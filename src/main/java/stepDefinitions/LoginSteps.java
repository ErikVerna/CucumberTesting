package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginSteps {

    WebDriver driver;

    @Given("^User is on Application Home Page$")
    public void user_is_on_Application_Home_Page() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

    }

    @When("Application Page Title is Facebook")
    public void applicationPageTitleIsFacebook() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - log in or sign up";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("^User enter username and password$")
    public void user_enter_username_and_password() {
        driver.findElement(By.name("email")).sendKeys("cuentagenericatesting@gmail.com");
        driver.findElement(By.name("password")).sendKeys("10Z&?£~9=Rmm");
    }

    @Then("^User clicks on Login Button$")
    public void user_clicks_on_Login_Button() {
        WebElement loginBtn = driver.findElement(By.name("login"));
        loginBtn.click();
    }

    @When("^User navigate to user Profile page$")
    public void user_navigate_to_user_Profile_page() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook";
        Assert.assertEquals(expectedTitle, actualTitle);
    }


}
