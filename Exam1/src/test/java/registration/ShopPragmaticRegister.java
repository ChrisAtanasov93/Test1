package registration;

import core.BaseTest;
import org.testng.annotations.Test;
import shopPragmaticPages.ShopPragmaticHome;
import shopPragmaticPages.ShopPragmaticRegistration;
import shopPragmaticPages.ShopPragmaticRegistrationFinal;

public class ShopPragmaticRegister extends BaseTest {

    @Test
    public void shopRegistration (){
        ShopPragmaticHome.shopPageGet();
        ShopPragmaticHome.myAccountGet();
        ShopPragmaticRegistration.userRegistrationData("Ivan","Grozdanov" ,"mnogoqkaparola123!");
        ShopPragmaticRegistration.registrationFinish();
        ShopPragmaticRegistrationFinal.accountCreationVerify();
    }
}
