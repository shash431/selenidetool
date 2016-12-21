package pmtool.chrome.auth;

import com.codeborne.selenide.Configuration;
import helpers.dataproviders.AuthDataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagesandsteps.steps.pmtoolsteps.auth.AuthSteps;

/**
 * @author: matcievskiy on 29.02.2016.
 */
public class InvalidCredentialsTest {

    private AuthSteps authSteps = null;




    @Test(dataProvider = "InvalidCredentialsProvider",dataProviderClass = AuthDataProvider.class)
    public void invalidCredentialsTest(String login,String password,String key) {

        authSteps.openPmTool().loginToPmTool(login,password,key);
    }

    @BeforeTest()
    public void setUp() throws InterruptedException {
      /*  //System.setProperty("webdriver.chrome.driver", "src/main/resources/selenium/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver/chromedriver.exe");
        Configuration.browser ="chrome";
        Configuration.startMaximized=true;
        Configuration.timeout   =  15000;*/
        authSteps = new AuthSteps();

    }
}
