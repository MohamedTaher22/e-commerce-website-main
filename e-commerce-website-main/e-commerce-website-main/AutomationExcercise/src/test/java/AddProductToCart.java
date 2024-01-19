import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductToCart extends TestBase{
    @Test
    public void AddProductToCartTC() throws InterruptedException {
        new HomePage(driver)
                .ClickingOnProductsButton()
                .AddFirstItemToCart();
        Thread.sleep(2000);
        WebElement AddToCartWindow = driver.findElement(By.xpath("//div[@class='modal-content']"));
        Assert.assertTrue(AddToCartWindow.isDisplayed());
        new AllProductPage(driver)
                .clickOnContinueShoppingButton()
                .AddSecondItemToCart()
                .clickOnViewCartButton();
        String ActualName1 = driver.findElement(By.xpath("(//h4)[2]")).getText();
        String ExpectedName1 = "Blue Top";
        String ActualName2 = driver.findElement(By.xpath("(//h4)[3]")).getText();
        String ExpectedName2 = "Men Tshirt";
        Assert.assertEquals(ActualName1,ExpectedName1);
        Assert.assertEquals(ActualName2,ExpectedName2);

    }
}
