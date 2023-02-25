package screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePage{

    public StartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[text()='Sign in']")
    WebElement buttonSignIn;

    @FindBy(xpath = "//span[text()='I lost my pet!']")
    WebElement buttonILostMyPet;

    @FindBy(xpath = "//span[text()='I found a pet!']")
    WebElement buttonIFoundAPet;

    @FindBy(xpath = "//span[text()='join']")
    WebElement buttonJoin;

    public LoginRegistrationPage openLogRegPage_buttonSignIn(){
        buttonSignIn.click();
        return  new LoginRegistrationPage(driver);
    }

    public LoginRegistrationPage openLogRegPage_buttonILostMyPet(){
        buttonILostMyPet.click();
        return  new LoginRegistrationPage(driver);
    }

    public LoginRegistrationPage openLogRegPage_buttonIFoundAPet(){
        buttonIFoundAPet.click();
        return  new LoginRegistrationPage(driver);
    }

    public LoginRegistrationPage openLogRegPage_buttonJoin(){
        buttonJoin.click();
        return  new LoginRegistrationPage(driver);
    }



}
