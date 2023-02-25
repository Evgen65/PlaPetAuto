import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import screens.LoginRegistrationPage;
import screens.StartPage;

public class StartPageTests extends TestBase{

    @Test
    public void openLogRegFormTest_buttonSignIn(){
        Assert.assertTrue(new StartPage(driver)
                .openLogRegPage_buttonSignIn()
                .isPresent_buttonSubmit())
        ;

    }

    @Test
    public void openLogRegFormTest_buttonILostMyPet(){
        Assert.assertTrue(new StartPage(driver)
                .openLogRegPage_buttonILostMyPet()
                .isPresent_buttonSubmit())
        ;

    }

    @Test
    public void openLogRegFormTest_buttonIFoundAPet(){
        Assert.assertTrue(new StartPage(driver)
                .openLogRegPage_buttonIFoundAPet()
                .isPresent_buttonSubmit())
        ;

    }@Test
    public void openLogRegFormTest_buttonJoin(){
        Assert.assertTrue(new StartPage(driver)
                .openLogRegPage_buttonJoin()
                .isPresent_buttonSubmit())
        ;

    }

    @AfterMethod
    public void postCondition(){
        new LoginRegistrationPage(driver).clickButtonCansel();
    }
}
