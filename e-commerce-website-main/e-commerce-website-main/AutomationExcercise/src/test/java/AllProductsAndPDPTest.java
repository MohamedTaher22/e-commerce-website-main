import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllProductsAndPDPTest extends TestBase{
    @Test
    public void PDP_TC() throws InterruptedException {
        new HomePage(driver)
                .ClickingOnProductsButton();
        Assert.assertTrue(driver.findElement(By.className("features_items")).isDisplayed());
        new AllProductPage(driver)
                .ClickingOnViewProductButton();
        Thread.sleep(2000);
        String ActualProdName = driver.findElement(By.xpath("//h2[contains(text(), 'Blue Top')]")).getText();
        String ExpectedProdName = "Blue Top";
        String ActualCat = driver.findElement(By.xpath("//p[contains(text(), 'Category: Women > Tops')]")).getText();
        String ExpectedCat = "Category: Women > Tops";
        String ActualPrice = driver.findElement(By.xpath("//span[contains(text(), 'Rs. 500')]")).getText();
        String ExpectedPrice = "Rs. 500";
        String ActualAvailability = driver.findElement(By.xpath("//p[contains(text(), ' In Stock')]")).getText();
        String ExpectedAvailability = "Availability: In Stock";
        String ActualCondition = driver.findElement(By.xpath("//p[contains(text(),'New')]")).getText();
        String ExpectedCondition = "Condition: New";
        String ActualBrand = driver.findElement(By.xpath("//p[contains(text(),'Polo')]")).getText();
        String ExpectedBrand = "Brand: Polo";
        Assert.assertEquals(ActualProdName,ExpectedProdName);
        Assert.assertEquals(ActualCat,ExpectedCat);
        Assert.assertEquals(ActualPrice,ExpectedPrice);
        Assert.assertEquals(ActualAvailability,ExpectedAvailability);
        Assert.assertEquals(ActualCondition,ExpectedCondition);
        Assert.assertEquals(ActualBrand,ExpectedBrand);

    }
}
