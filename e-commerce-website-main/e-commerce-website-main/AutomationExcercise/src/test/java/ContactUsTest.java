import org.testng.annotations.Test;

public class ContactUsTest extends TestBase{
    @Test
    public void ContactUsTC() throws InterruptedException {
        new HomePage(driver)
                .clickingOnContactUsButton()
                .enterName("Test")
                .enterEmail("test@test.com")
                .enterSubject("test")
                .enterMsg("testing purpose")
                .UploadFile("C:\\Users\\Asser\\OneDrive\\Desktop\\Test.txt")
                .ClickOnSubmitButton()
                .ClickOnOkFromPrompt();
    }
}
