import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLoginTest extends TestBase{

    @Test(priority = 3)
    public void ValidLoginTC()
    {
        new HomePage(driver)
                .clickingOnSignUp_logInButton()
                .enterLoginCredentials("test.ttt@test.com" , "123456")
                .clickOnLoginButton();
        Assert.assertTrue(driver.findElement(By.xpath("//a[@href = '/logout']")).isDisplayed());
    }
}
