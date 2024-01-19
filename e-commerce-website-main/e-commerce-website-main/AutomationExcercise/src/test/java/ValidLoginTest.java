import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidLoginTest extends TestBase{

    @Test(priority = 4)
    public void InValidLoginTC()
    {
        new HomePage(driver)
                .clickingOnSignUp_logInButton()
                .enterLoginCredentials("A.B@g.com","11111")
                .clickOnLoginButton();
        String actual = driver.findElement(By.xpath("//p[@style]")).getText();
        String expected = "Your email or password is incorrect!";
        Assert.assertEquals(actual,expected);
    }


}
