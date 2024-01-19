import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductSearchTest extends TestBase{
    @Test
    public void ProductSearchTC()
    {
        new HomePage(driver)
                .ClickingOnProductsButton()
                .ProductSearch("T-shirt");
        String ActualTitle = driver.findElement(By.cssSelector("h2[class]")).getText();
        String ExpectedTitle = "SEARCHED PRODUCTS";
        String Actualprod1 = driver.findElement(By.xpath("(//p[contains(text(),'Pure Cotton V-Neck T-Shirt')])[1]")).getText();
        String ExpectedProd1 = "Pure Cotton V-Neck T-Shirt";
        Assert.assertEquals(ActualTitle,ExpectedTitle);
        Assert.assertEquals(Actualprod1,ExpectedProd1);
    }
}
