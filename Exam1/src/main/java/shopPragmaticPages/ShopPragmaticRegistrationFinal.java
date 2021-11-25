package shopPragmaticPages;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

public class ShopPragmaticRegistrationFinal {

    private static final By YOUR_ACCOUNT = By.xpath("//div [@id='content']//child::h1[1]");
    private static final String expectedMessage = "Your Account Has Been Created!";

    public static void accountCreationVerify () {
        String actualMessage = Browser.driver.findElement(YOUR_ACCOUNT).getText();
        Assert.assertEquals(actualMessage,expectedMessage);
    }
}
