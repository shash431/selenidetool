package base;

import pagesandsteps.pagefactory.pmtool.auth.LoginPageFactory;
import pagesandsteps.steps.pmtoolsteps.auth.AuthSteps;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

/**
 * @author: matcievskiy on 29.02.2016.
 */
public class BaseWebSteps {

   public LoginPageFactory loginPageFactory = null;


    public BaseWebSteps() throws InterruptedException {

        loginPageFactory = page(LoginPageFactory.class);

    }


    @Step("Open PmTool")
    public void goToPmTool(){

       open("https://pmtool-uat.magora.team/");
    }

    @Step("Login as Martynov")
    public void loginAsMart(){

        loginPageFactory.fillLoginAndPassword("martynov","j2uvOuaTFJ");
        loginPageFactory.clickLoginButton();
    }

    @Step("Logout")
    public void logoutFromPmTool(){

        loginPageFactory.logoutFromPmTool();
    }

    //----------------- Пока нет в них необходимости
    /*@Step("Login as Sales")
    public void loginAsSales(){

        loginPageFactory.fillLoginAndPassword("test_sales","123456");
        loginPageFactory.clickLoginButton();

    }

    @Step("Login as Project Manager")
    public void loginAsProjectManager(){

        loginPageFactory.fillLoginAndPassword("test_pm","123456");
        loginPageFactory.clickLoginButton();
    }

    @Step("Login as Developer")
    public void loginAsDeveloper(){

        loginPageFactory.fillLoginAndPassword("","");
        loginPageFactory.clickLoginButton();
    }

    @Step("Login as PMTool Admin")
    public void loginAsPMToolAdmin(){

        loginPageFactory.fillLoginAndPassword("pmtadmin","TC1euoCf8i0p");
        loginPageFactory.clickLoginButton();
    }*/

}
