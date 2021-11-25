package shopPragmaticPages;

import org.openqa.selenium.By;
import utils.Browser;

public class ShopPragmaticHome {

    private static final String url = "http://shop.pragmatic.bg";

    private static final By MY_ACCOUNT_BUTTON = By.xpath("//li [@class='dropdown']//child::i[1]");
    private static final By REGISTRATION_BUTTON = By.xpath("//ul [@class='dropdown-menu dropdown-menu-right']//child::li[1]");

    public static void shopPageGet () {
        Browser.driver.get(url);
    }

    public static void myAccountGet () {
        Browser.driver.findElement(MY_ACCOUNT_BUTTON).click();
        Browser.implicitWaitVisibility(REGISTRATION_BUTTON);
        Browser.driver.findElement(REGISTRATION_BUTTON).click();
    }
}
