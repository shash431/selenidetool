package pmtool.chrome.auth;

import com.codeborne.selenide.Configuration;
import entities.user.UserEntity;
import helpers.dataproviders.AuthDataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagesandsteps.steps.pmtoolsteps.auth.AuthSteps;

/**
 * @author: matcievskiy on 29.02.2016.
 */

/*
* Этот тест переделан. Был по ролям с дата-провайдером, сделан на логин по одним кредам и проверкой элементов, которые
* характерны тем или иным ролям.
* */
public class RoleBasedAuthTest {

    private AuthSteps authSteps = null;

    @Test
    public void loginTest(){
        authSteps.
                openPmTool().
                loginMart().
                waitTable().
                checkNavBar().
                logoutFromPmTool();
    }

    /*@Test(dataProvider = "RolesAuthProvider",dataProviderClass = AuthDataProvider.class)
    public void roleBasedAuthentication(UserEntity userEntity) {

        authSteps.
                openPmTool().
                loginToPmTool(userEntity.getLogin(), userEntity.getPassword(), userEntity.getRole()).
                logoutFromPMTool();
    }*/

    @BeforeTest()
    public void setUp() throws InterruptedException {

       /* //System.setProperty("webdriver.chrome.driver", "src/main/resources/selenium/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver/chromedriver.exe");
        Configuration.browser ="chrome";
        Configuration.timeout   =  15000;*/
        authSteps = new AuthSteps();

    }
}
