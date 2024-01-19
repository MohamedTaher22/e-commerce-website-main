import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllProductPage {
    WebDriver driver;

    public AllProductPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By FirstItem_ViewProduct = By.cssSelector("a[href='/product_details/1']");
    private By searchField = By.xpath("//input[@name='search']");
    private By searchButton = By.xpath("//button[@id='submit_search']");
    private By AddToCartFirstItemButton = By.xpath("(//a[@data-product-id='1'])[1]");
    private By AddToCartSecondItemButton = By.xpath("(//a[@data-product-id='2'])[1]");
    private By continueShoppingButton = By.xpath("//button[contains(@class,'btn-success')]");
    private By viewCartButton = By.xpath("(//a[@href='/view_cart'])[2]");

    public PDP ClickingOnViewProductButton ()
    {
        Utility.clicking(driver,FirstItem_ViewProduct);
        return new PDP(driver);
    }

    public AllProductPage ProductSearch(String pName)
    {
        Utility.enterText(driver,searchField,pName);
        Utility.clicking(driver,searchButton);
        return new AllProductPage(driver);
    }

    public AllProductPage AddFirstItemToCart()
    {
        Utility.clicking(driver,AddToCartFirstItemButton);
        return new AllProductPage(driver);
    }
    public AllProductPage AddSecondItemToCart()
    {
        Utility.clicking(driver,AddToCartSecondItemButton);
        return new AllProductPage(driver);
    }
    public AllProductPage clickOnContinueShoppingButton()
    {
        Utility.clicking(driver,continueShoppingButton);
        return new AllProductPage(driver);
    }
    public CartPage clickOnViewCartButton()
    {
        Utility.clicking(driver,viewCartButton);
        return new CartPage(driver);
    }

}
