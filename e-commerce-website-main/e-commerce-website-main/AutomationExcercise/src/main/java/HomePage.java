import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage{
    private WebDriver driver;
    public HomePage (WebDriver driver)
    {
        this.driver = driver;
    }
    private By signUp_logIn = By.xpath("//a[@href='/login']");
    private By deleteAccountButton = By.xpath("//a[@href='/delete_account']");
    private By logoutButton = By.xpath("//a[@href='/logout']");
    private By contactUsButton = By.xpath("//a[@href='/contact_us']");
    private By productsButton = By.xpath("//a[@href='/products']");
    private By subscriptionEmail = By.id("susbscribe_email");
    private By subscriptionButton = By.id("subscribe");

        public signUp_LoginPage clickingOnSignUp_logInButton()
        {
            Utility.clicking(driver,signUp_logIn);
            return new signUp_LoginPage(driver);
        }

        public HomePage deleteAccount()
        {
            Utility.clicking(driver,deleteAccountButton);
            return new HomePage(driver);
        }
        public signUp_LoginPage clickingOnSignOutButton()
        {
            Utility.clicking(driver,logoutButton);
            return new signUp_LoginPage(driver);
        }
        public ContactUsPage clickingOnContactUsButton()
        {
            Utility.clicking(driver,contactUsButton);
            return new ContactUsPage(driver);
        }
        public AllProductPage ClickingOnProductsButton()
        {
            Utility.clicking(driver,productsButton);
            return new AllProductPage(driver);
        }
    public HomePage ScrollToSubscription()
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("susbscribe_email")));
        actions.perform();
        return new HomePage(driver);
    }
    public HomePage enterSubscriptionEmail(String sEmail)
    {
        Utility.enterText(driver,subscriptionEmail,sEmail);
        return new HomePage(driver);
    }
    public HomePage clickOnSubscriptionButton()
    {
        Utility.clicking(driver,subscriptionButton);
        return new HomePage(driver);
    }



}
