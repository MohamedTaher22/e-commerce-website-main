import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage{
    private WebDriver driver;
    public ContactUsPage (WebDriver driver)
    {
        this.driver = driver;
    }

    private By nameField = By.xpath("(//input[@class='form-control'])[1]");
    private By EmailField = By.xpath("(//input[@class='form-control'])[2]");
    private By subjectField = By.xpath("(//input[@class='form-control'])[3]");
    private By msgField = By.xpath("//textarea[@name='message']");
    private By UploadFile = By.xpath("(//input[@class='form-control'])[4]");
    private By submit = By.xpath("//input[@name='submit']");
    private By HomeButton = By.xpath("(//a[@href='/'])[3]");

    public ContactUsPage enterName(String name)
    {
        Utility.enterText(driver,nameField,name);
        return new ContactUsPage(driver);
    }
    public ContactUsPage enterEmail(String email)
    {
        Utility.enterText(driver,EmailField,email);
        return new ContactUsPage(driver);
    }
    public ContactUsPage enterSubject(String subj)
    {
        Utility.enterText(driver,subjectField,subj);
        return new ContactUsPage(driver);
    }
    public ContactUsPage enterMsg(String msg)
    {
        Utility.enterText(driver,msgField,msg);
        return new ContactUsPage(driver);
    }
    public ContactUsPage UploadFile(String file)
    {
        Utility.enterText(driver,UploadFile,file);
        return new ContactUsPage(driver);
    }
    public ContactUsPage ClickOnSubmitButton() throws InterruptedException {
        Thread.sleep(1000);
        Utility.clicking(driver,submit);
        return new ContactUsPage(driver);
    }
    public ContactUsPage ClickOnOkFromPrompt()
    {
      Alert prompt = driver.switchTo().alert();
      prompt.accept();
      return new ContactUsPage(driver);
    }
    public HomePage ClickOnHomeButton()
    {
        Utility.clicking(driver,HomeButton);
        return new HomePage(driver);
    }

}
