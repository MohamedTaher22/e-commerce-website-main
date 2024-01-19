import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.Assert;

public class RegisterTest extends TestBase{
    @Test(priority = 2)
public void ValidRegisterTC() throws InterruptedException {
        new HomePage(driver)
                .clickingOnSignUp_logInButton()
                .enterNameAndAddress("test","test.a23@test.com")
                .clickingOnSignUpButton()
                .enterTitleAndPassword("Password1")
                .enterBirthDate("10","8","1999")
                .enterFirstAndLastNames("Test","Test")
                .enterCompanyName("ABC")
                .enterAddress("ST.10")
                .enterCountryAndStateAndCity("Canda", "N/A" ,"Montairy")
                .enterZipCode("1234")
                .enterMobileNumber("000111222333")
                .ClickingOnCreateAccountButton();
        String actual = driver.findElement(By.xpath("//b")).getText();
        String expected = "ACCOUNT CREATED!";
        Assert.assertEquals(actual,expected);
        new signUp_LoginPage(driver)
                .ClickingOnContinueButton()
                .deleteAccount();
        String act = driver.findElement(By.xpath("//b[contains(text(), 'Account Deleted!')]")).getText();
        String exp = "ACCOUNT DELETED!";
        Assert.assertEquals(act,exp);
    }

    @Test(priority = 1)
    public void InvalidRegisterTC()
    {
        new HomePage(driver)
                .clickingOnSignUp_logInButton()
                .enterNameAndAddress("test","test.aas@test.com")
                .clickingOnSignUpButton();
        String actual = driver.findElement(By.xpath("//p[contains(text(),'Email Address already exist!')]")).getText();
        String expected = "Email Address already exist!";
        Assert.assertEquals(actual,expected);
    }

}
