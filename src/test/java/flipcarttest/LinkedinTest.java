package flipcarttest;

import com.bridgelabz.selenium.base.Base;
import com.bridgelabz.selenium.pages.LinkedinLogin;
import org.testng.annotations.Test;

import java.io.IOException;


public class LinkedinTest extends Base {

 LinkedinLogin linkedinLogin;

    @Test(priority = 0)
    public void linkedin_login() throws InterruptedException, IOException {
        linkedinLogin = new LinkedinLogin(driver);
        linkedinLogin.loggedInToApp();
    }
}

