package StepDefinitions;
import Pages.MainPage;
import Utils.ConfigReader;
import Utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginInStepDefinitions {
    WebDriver driver= Driver.getDriver();
    MainPage page=new MainPage();

    @Given("the user navigate to the Red Shelf main page")
    public void theUserNavigateToTheRedShelfMainPage() {
        System.out.println();
        driver.get(ConfigReader.getProperty("url"));
        page.logIn.click();
        System.out.println("User navigated to the page");
    }

    @When("the user provide valid username")
    public void the_user_provide_valid_username() {
        page.userName.sendKeys(ConfigReader.getProperty("username"));
        System.out.println("Has entered valid username");
    }

    @When("the user provide valid password")
    public void the_user_provide_valid_password() {
        System.out.println("The user sent test");
        page.password.sendKeys(ConfigReader.getProperty("password"));
        page.submit.click();
        System.out.println("and valid password");
    }

        @Then("the user should see home page")
        public void the_user_should_see_home_page() {

            String expectedTitle = "My Library RedShelf";
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle);
            System.out.println("User was able to succesfully loggin in and validate title of page ");


        }


    @When("the user provide  invalid username {string}")
    public void the_user_provide_invalid_username(String wName) throws InterruptedException {
       Thread.sleep(5000);
        page.userName.sendKeys(wName);
        System.out.println("User entered invalid username ");
    }




    @When("the user provide  invalid password {string}")
    public void the_user_provide_invalid_password(String wPass) {
        page.password.sendKeys(wPass);
        page.submit.click();
        System.out.println("and invalid password");

    }
    @Then("the user validate text {string}")
    public void the_user_validate_text(String expected) {
        String actual=page.errorMessage.getText();
        Assert.assertEquals(actual,expected);
        System.out.println("User was unable to log in with these wrong  credentials");

    }
    @When("the user provide username {string}")
    public void theUserProvideUsername(String numUser) throws InterruptedException {
       Thread.sleep(5000);
        page.userName.sendKeys(numUser);
        System.out.println("User provided only numbers as a username");


    }
    @And("the user provide password {string}")
    public void theUserProvidePassword(String numPass) {
        page.password.sendKeys(numPass);
        page.submit.click();
        System.out.println("User provided only numbers as a password");

    }
    @Then("the user validate message {string}")
    public void the_user_validate_message(String message) {
        String actual=page.errorMessage.getText();
        Assert.assertEquals(actual,message);
        System.out.println("System didnt accept  these numerical credentials");


    }



    }











