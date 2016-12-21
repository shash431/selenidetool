package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pagesandsteps.steps.pmtoolsteps.project.CreateProjectSteps;

/**
 * Created by matcievskiy on 04.03.2016.
 */
public class BaseWebTest {

    @BeforeTest()
    public void setUp() throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "src/main/resources/selenium/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver/chromedriver.exe");
        Configuration.browser ="chrome";
        Configuration.timeout   =  15000;
        WebDriverRunner.clearBrowserCache();

    }

}
