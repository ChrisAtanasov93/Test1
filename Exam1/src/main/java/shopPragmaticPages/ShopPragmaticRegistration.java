package shopPragmaticPages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import utils.Browser;

public class ShopPragmaticRegistration {

    private static final By FIRST_NAME = By.id("input-firstname");
    private static final By LAST_NAME = By.id("input-lastname");
    private static final By EMAIL = By.id("input-email");
    private static final By TELEPHONE = By.id("input-telephone");
    private static final By PASSWORD = By.id("input-password");
    private static final By PASSWORD_CONFIRM = By.id("input-confirm");
    private static final By RADIO_BUTTON_NO = By.xpath("//div [@class='col-sm-10']//child::label[2]");
    private static final By TERMS_AND_CONDITIONS = By.xpath("//div [@class='pull-right']//child::input[1]");
    private static final By CONTINUE = By.xpath("//div [@class='pull-right']//child::input[2]");
    private static final String randomEmail = RandomStringUtils.randomAlphabetic(7) + "@somemail.com";
    private static final String randomPhoneNumber = RandomStringUtils.randomNumeric(10);

    public static void userRegistrationData (String firstName , String lastName ,String password ) {
        Browser.implicitWaitVisibility(CONTINUE);
        Browser.driver.findElement(FIRST_NAME).sendKeys(firstName);
        Browser.driver.findElement(LAST_NAME).sendKeys(lastName);
        Browser.driver.findElement(EMAIL).sendKeys(randomEmail);
        Browser.driver.findElement(TELEPHONE).sendKeys(randomPhoneNumber);
        Browser.driver.findElement(PASSWORD).sendKeys(password);
        Browser.driver.findElement(PASSWORD_CONFIRM).sendKeys(password);
    }

    public static void registrationFinish () {
        Browser.implicitWaitVisibility(CONTINUE);
        Browser.driver.findElement(RADIO_BUTTON_NO).click();
        Browser.driver.findElement(TERMS_AND_CONDITIONS).click();
        Browser.driver.findElement(CONTINUE).click();
    }
}
