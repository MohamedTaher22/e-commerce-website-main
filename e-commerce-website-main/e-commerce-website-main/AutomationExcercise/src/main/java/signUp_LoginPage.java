import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signUp_LoginPage {
    WebDriver driver;
    public signUp_LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By signUpNameField = By.xpath("//input[@type='text']");
    private By signUpEmailField = By.xpath("(//input[@type='email'])[2]");
    private By signUpButton = By.xpath("(//button[@type='submit'])[2]");
    private By title = By.xpath("(//input[@type='radio'])[1]");
    private By password = By.xpath("//input[@type='password']");
    private By BirthDay = By.id("days");
    private By BirthMonth = By.id("months");
    private By BirthYear = By.id("years");
    private By firstName = By.id("first_name");
    private By lastName = By.id("last_name");
    private By companyName = By.id("company");
    private By address1 = By.id("address1");
    private By country = By.id("country");
    private By State = By.id("state");
    private By city = By.xpath("(//input[@type='text'])[9]");
    private By zipCode = By.xpath("(//input[@type='text'])[10]");
    private By mobileNumber = By.xpath("(//input[@type='text'])[11]");
    private By createAccountButton = By.xpath("(//button[@type='submit'])[1]");
    private By continueButton = By.xpath("(//a[@href='/'])[3]");
    private By loginEmailField = By.xpath("(//input[@name='email'])[1]");
    private By loginPasswordField = By.xpath("//input[@name='password']");
    private By loginButton = By.xpath("(//button[@type='submit'])[1]");


    public signUp_LoginPage enterNameAndAddress(String Name, String Address)
    {
        Utility.enterText(driver,signUpNameField,Name);
        Utility.enterText(driver,signUpEmailField,Address);
        return new signUp_LoginPage(driver);
    }

    public signUp_LoginPage clickingOnSignUpButton()
    {
        Utility.clicking(driver,signUpButton);
        return new signUp_LoginPage(driver);
    }

    public signUp_LoginPage enterTitleAndPassword(String pass)
    {
        Utility.clicking(driver,title);
        Utility.enterText(driver,password,pass);
        return new signUp_LoginPage(driver);
    }

    public signUp_LoginPage enterBirthDate(String day , String month , String year)
    {
        Utility.enterText(driver,BirthDay,day);
        Utility.enterText(driver,BirthMonth,month);
        Utility.enterText(driver,BirthYear,year);
        return new signUp_LoginPage(driver);
    }

    public signUp_LoginPage enterFirstAndLastNames(String fName , String lName)
    {
        Utility.enterText(driver,firstName,fName);
        Utility.enterText(driver,lastName,lName);
        return new signUp_LoginPage(driver);
    }

    public signUp_LoginPage enterCompanyName(String comp)
    {
        Utility.enterText(driver,companyName,comp);
        return new signUp_LoginPage(driver);
    }

    public signUp_LoginPage enterAddress(String add)
    {
        Utility.enterText(driver,address1,add);
        return new signUp_LoginPage(driver);
    }

    public signUp_LoginPage enterCountryAndStateAndCity(String coun , String St , String cit)
    {
        Utility.enterText(driver,country,coun);
        Utility.enterText(driver,State,St);
        Utility.enterText(driver,city,cit);
        return new signUp_LoginPage(driver);
    }

    public signUp_LoginPage enterZipCode(String zip)
    {
        Utility.enterText(driver,zipCode,zip);
        return new signUp_LoginPage(driver);
    }

    public signUp_LoginPage enterMobileNumber(String mNumber)
    {
        Utility.enterText(driver,mobileNumber,mNumber);
        return new signUp_LoginPage(driver);
    }

    public signUp_LoginPage ClickingOnCreateAccountButton()
    {
        Utility.clicking(driver,createAccountButton);
        return new signUp_LoginPage(driver);
    }

    public HomePage ClickingOnContinueButton()
    {
        Utility.clicking(driver,continueButton);
        return new HomePage(driver);
    }

    public signUp_LoginPage enterLoginCredentials(String lEmail , String lPassword)
    {
        Utility.enterText(driver,loginEmailField,lEmail);
        Utility.enterText(driver,loginPasswordField,lPassword);
        return new signUp_LoginPage(driver);
    }

    public HomePage clickOnLoginButton()
    {
        Utility.clicking(driver,loginButton);
        return new HomePage(driver);
    }

}
