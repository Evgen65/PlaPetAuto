import models.UserModel;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import screens.HomePage;
import screens.LoginRegistrationPage;
import screens.StartPage;

import java.util.Random;

public class RegistrationTests extends TestBase{


    @Test(invocationCount=5)
    public void registrationPositiveTest(){
        int i = new Random().nextInt(1000)+1000;
        new StartPage(driver)
                .openLogRegPage_buttonJoin()
                .clickButtonSignUpForm()
                .fillRegistrationForm(UserModel.builder()
                        .name("Qwerty"+i)
                        .email("Qwerty"+i+"@gmail.com")
                        .password(i+"Qwerty_")
                        .confirmPassword(i+"Qwerty_")
                        .build())
                .clickButtonSubmit()
                ;
    }

    @AfterMethod
    public void postCondition(){
        new HomePage(driver).clickButtonLogout();
    }

}
