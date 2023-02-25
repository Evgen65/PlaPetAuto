package screens;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public StartPage clickButtonLogout(){
        buttonLogout.click();
        return new StartPage(driver);
    }

}
