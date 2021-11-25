package core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Browser;

public class BaseTest {

    @BeforeMethod
    public static void browserUp () {
        Browser.setUp();
    }

    @AfterMethod
    public static void tearDown () {
        Browser.tearDown();
    }
}
