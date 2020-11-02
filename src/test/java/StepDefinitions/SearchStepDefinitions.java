package StepDefinitions;

import Pages.MainPage;
import Utils.ConfigReader;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class SearchStepDefinitions {
    WebDriver driver = Driver.getDriver();
    MainPage page = new MainPage();

    @Given("the user logged in  in account page")
    public void theUserLoggedInInAccountPage() {
        driver.get(ConfigReader.getProperty("url"));
        page.logIn.click();
        page.userName.sendKeys(ConfigReader.getProperty("username"));
        page.password.sendKeys(ConfigReader.getProperty("password"));
        page.submit.click();
        System.out.println("User successfully logged in");
    }


    @Given("the user enters name of book to search")
    public void theUserEntersNameOfBookToSearch() {
        page.search.click();
        page.searchField.sendKeys(ConfigReader.getProperty("book"));
        page.searchB.click();
        System.out.println("User is searching book to purchase");
    }

    @When("page opens user validates the message {string}")
    public void pageOpensUserValidatesTheMessage(String expectedText) {
        String actualText = page.resultsText.getText();
        Assert.assertEquals(actualText, expectedText);
        System.out.println("Validation of results message was succesful");
    }


    @Then("he validates  that all books have same button View Details  on that page")
    public void heValidatesThatAllBooksHaveSameButtonViewDetailsOnThatPage() throws InterruptedException {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollBy(0,15000)");
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,-15000)");
        List<WebElement> vDbuttons = page.viewDetailsB;
        for (WebElement button : vDbuttons) {
            String actualViewButton = button.getText();
            String expectedViewButton = "View Details";
            Assert.assertEquals(actualViewButton, expectedViewButton);

        }
        System.out.println("User validated that View details button is displayed for all books ");
    }


    @When("the user enters only numbers in books search field {string}")
    public void theUserEntersOnlyNumbersInBooksSearchField(String numberCredentials) {
        page.search.click();
        page.searchField.sendKeys(numberCredentials);
        page.searchB.click();
    }


    @Then("he validates  message {string}")
    public void heValidatesMessage(String expNoResultText) {
        String actualNoresultText = page.noResultsText.getText();
        Assert.assertEquals(actualNoresultText, expNoResultText);

    }


    @When("the user enters only symbols in books search field {string}")
    public void theUserEntersOnlySymbolsInBooksSearchField(String symbols) {
        page.search.click();
        page.searchField.sendKeys(symbols);
        page.searchB.click();

    }


    @Then("user will see  message {string}")
    public void userWillSeeMessage(String anotherMsg) {
        String realMsg = page.noResultsText2.getText();
        Assert.assertEquals(realMsg, anotherMsg);
    }



}














