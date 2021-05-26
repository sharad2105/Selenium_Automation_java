package flipcarttest;

import com.bridgelabz.selenium.base.Base;
import com.bridgelabz.selenium.driver.TestNGListeners;
import com.bridgelabz.selenium.pages.LinkedinLogin;
import com.bridgelabz.selenium.pages.Messaging;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(TestNGListeners.class)
public class LinkedinTest extends Base {

 LinkedinLogin linkedinLogin;
 Messaging messaging;

    @Test(priority = 0)
    public void linkedin_login() throws InterruptedException, IOException {
        linkedinLogin = new LinkedinLogin(driver);
        linkedinLogin.loggedInToApp();
    }
    @Test(priority = 1)
    public void linkedin_messaging() throws InterruptedException, IOException {
        messaging = new Messaging(driver);
        messaging.openMessaging();
    }
}

