import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utility {
        public static void clicking (WebDriver driver, By locator)
        {
            new WebDriverWait(driver, Duration.ofSeconds(20))
                    .until(ExpectedConditions.elementToBeClickable(locator));
            driver.findElement(locator).click();
        }

        public static void enterText (WebDriver driver, By locator , String text)
        {
            new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(locator));
            driver.findElement(locator).sendKeys(text);
        }

}
