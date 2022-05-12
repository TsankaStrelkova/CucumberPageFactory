package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.GlobalVars;

public class LoginPage extends BasePage {

    // !!! Important - default access modifier private, no need to add private before @FindBy

    @FindBy(id = "text")
    WebElement userNameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "login-button")
    WebElement loginButton;


    public LoginPage() {

        super();
    }

    public void navigateToWebdriverUniversity_Login_Page() {
        navigateTo_URL(GlobalVars.WEBDRIVER_UNIVERSITY_HOME_PAGE_URL+"/Login-Portal/index.html?");
    }

    public void populateUserName(String username) {
        sendKeys(userNameField, username);
    }

    public void populatePassword(String password) {
        sendKeys(passwordField, password);
    }

    public void clickOnLogin() {
        waitForWebElementAndClick(loginButton);
    }

    public void validateSuccsessfulLoginMessage() {
        waitForAlertAndValidateMessageFromAlert("validation succeeded");
    }

    public void validateUnsuccsessfulLoginMessage() {
        waitForAlertAndValidateMessageFromAlert("validation failed");
    }

}
