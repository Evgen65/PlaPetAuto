package screens;

import models.UserModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginRegistrationPage extends BasePage{

    @FindBy(xpath = "//div[text()='Cancel']")
    WebElement buttonCansel;

    @FindBy(xpath = "//div[text()='Submit']")
    WebElement buttonSubmit;

    @FindBy(xpath = "//div[@class='sc-edoYdd cZhezb']")
    WebElement buttonSignIn;

    @FindBy(xpath = "//div[@class='sc-edoYdd WPXJZ']")
    WebElement buttonSignUp;

    @FindBy(xpath = "//input[@placeholder='Peter']")
    WebElement name;

    @FindBy(xpath = "//input[@placeholder='peter@gmail.com']")
    WebElement email;

    @FindBy(xpath = "//div[@class='sc-jlIlqL CnIuH']/div[3]/input")
    WebElement password;

    @FindBy(xpath = "//div[@class='sc-jlIlqL CnIuH']/div[4]/input")
    WebElement confirmPassword;
    public LoginRegistrationPage(WebDriver driver) {
        super(driver);
    }

    public StartPage clickButtonCansel(){
        buttonCansel.click();
        return new StartPage(driver);
    }

    public boolean isPresent_buttonSubmit(){
        return isElementPresent(By.xpath("//div[text()='Submit']"));
    }


    public LoginRegistrationPage clickButtonSignUpForm() {
        buttonSignUp.click();
        return this;
    }

    public LoginRegistrationPage fillRegistrationForm(UserModel model) {
        type(name, model.getName());
        type(email, model.getEmail());
        type(password, model.getPassword());
        type(confirmPassword, model.getConfirmPassword());
        return this;
    }

    public HomePage clickButtonSubmit() {
        buttonSubmit.click();
        return new HomePage(driver);
    }
}
