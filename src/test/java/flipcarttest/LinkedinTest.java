package flipcarttest;

import com.bridgelabz.selenium.base.Base;
import com.bridgelabz.selenium.driver.TestNGListeners;
import com.bridgelabz.selenium.pages.LinkedinLogin;
import com.bridgelabz.selenium.pages.Messaging;
import com.bridgelabz.selenium.pages.Search;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(TestNGListeners.class)
public class LinkedinTest extends Base {

 LinkedinLogin linkedinLogin;
 Messaging messaging;
 Search search;

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
    @Test(priority = 2)
    public void linkedin_search() throws InterruptedException, IOException {
        search = new Search(driver);
        search.setSearch();
    }
}

