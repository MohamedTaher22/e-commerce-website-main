import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubscriptionTest extends TestBase {
    @Test
    public void SubscriptionTC()
    {
        new HomePage(driver)
                .ScrollToSubscription()
                .enterSubscriptionEmail("test@test.com")
                .clickOnSubscriptionButton();
        WebElement SuccessfulMsg = driver.findElement(By.xpath("//div[contains(@class,'alert-success')]"));
        Assert.assertTrue(SuccessfulMsg.isDisplayed());
    }
}
