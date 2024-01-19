import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends TestBase{

    @Test(priority = 5)
    public void LogoutTC()

    {
        new HomePage(driver)
                .clickingOnSignUp_logInButton()
                .enterLoginCredentials("test.ttt@test.com" , "123456")
                .clickOnLoginButton()
                .clickingOnSignOutButton();
        String actualURL =  driver.getCurrentUrl();
        String expectedURL = "https://automationexercise.com/login";
        Assert.assertEquals(actualURL,expectedURL);

    }
}
