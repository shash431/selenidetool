package pmtool.chrome.auth;

import com.codeborne.selenide.Configuration;
import entities.user.UserEntity;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagesandsteps.steps.pmtoolsteps.auth.AuthSteps;

/**
 * @author: matcievskiy on 29.02.2016.
 */
public class AuthElementsTest {

    private AuthSteps authSteps = null;

    @Test
    public void authElementsDisplays() {

        authSteps.
                openPmTool().
                checkThatElementsIsDisplayed();
    }

    @BeforeTest()
    public void setUp() throws InterruptedException {

        /*//System.setProperty("webdriver.chrome.driver", "src/main/resources/selenium/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver/chromedriver.exe");
        Configuration.browser ="chrome";
        Configuration.timeout   =  15000;*/
        authSteps = new AuthSteps();

    }

}
