package Pages;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {
    public MainPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/accounts/login/']")
    public WebElement logIn;

    @FindBy(xpath = "//input[@placeholder='email@address.com']")
    public WebElement userName;

    @FindBy(xpath = "//input[@placeholder='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@title='Log In To Account']")
    public WebElement submit;

    @FindBy(xpath = "//div[@title=\"Log In Failed\"]")
    public WebElement errorMessage;

    @FindBy(xpath = "//button[@class='rs-navbar-search-button hide-search']")
    public WebElement search;

    @FindBy(xpath = "//input[@class='rs-navbar-search-input']")
    public WebElement searchField;

    @FindBy(xpath = "//button[@data-role='rs-navbar-search-trigger']")
    public WebElement searchB;

    @FindBy(xpath = "//div[@class='btn btn-primary pricing-container digital-price']")
    public List<WebElement> viewDetailsB;

    @FindBy(xpath = "//div[@class='col-xs-12 col-sm-8']")
    public WebElement resultsText;

    @FindBy(xpath = "//h1[@class='text-center']")
    public WebElement noResultsText;

    @FindBy(xpath = "//p[@class='text-center']")
    public WebElement noResultsText2;



}
