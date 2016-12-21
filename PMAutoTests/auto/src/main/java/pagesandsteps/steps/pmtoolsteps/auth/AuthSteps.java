package pagesandsteps.steps.pmtoolsteps.auth;

import base.BaseWebSteps;
import pagesandsteps.pagefactory.pmtool.auth.LoginPageFactory;
import pagesandsteps.pagefactory.pmtool.navigation.NavigationBarFactory;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selenide.navigator;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * @author: matcievskiy on 29.02.2016.
 */
public class AuthSteps extends BaseWebSteps {

    NavigationBarFactory navigationBarFactory = null;

    public AuthSteps() throws InterruptedException {
        navigationBarFactory = page(NavigationBarFactory.class);
    }


    @Step("Open PmTool")
    public AuthSteps openPmTool(){

        super.goToPmTool();
        return this;
    }

    @Step("Login as Martynov")
    public AuthSteps loginMart(){

        super.loginAsMart();
        return this;
    }

    @Step("Check that login page displayed correctly")
    public AuthSteps checkThatElementsIsDisplayed(){

        loginPageFactory.elementsIsDisplayed();
        return this;
    }

    @Step("Wait Table After Login")
    public AuthSteps waitTable(){

        navigationBarFactory.waitMainTable();
        return this;
    }

    @Step("Check elements of Navigation Bar after Login")
    public AuthSteps checkNavBar(){

        navigationBarFactory.checkRoleNavigationBar();
        return this;
    }
    @Step("Try to login with several credentials")
    public AuthSteps loginToPmTool(String login,String password,String key){

        loginPageFactory.fillLoginAndPassword(login, password);
        loginPageFactory.clickLoginButton();
        if(key.contains("Project")||key.contains("Sales")||key.contains("admin")){

            System.out.println("eneity key " + key);
            loginPageFactory.checkLoginAndUserName(key);
        }
        else{

            loginPageFactory.checkAuthValidation(key);
        }

        return this;
    }


    //------------------- Пока нет в них необходимости
    /*@Step("Logout from PmTool")
    public AuthSteps logoutFromPMTool(){

        loginPageFactory.logoutFromPmTool();
        return this;
    }*/


    /*@Step("Login as admin")
    public AuthSteps loginAsAdmin(){

        super.loginAsPMToolAdmin();
        return this;
    }

    @Step("Login as PMTDeveloper")
    public AuthSteps loginAsDev(){

        super.loginAsDeveloper();
        return this;
    }

    @Step("Login as Sales")
    public AuthSteps loginAsSalesManager(){

        super.loginAsSales();
        return this;
    }

    @Step("Login as Project Managet")
    public AuthSteps loginAsManager(){

        super.loginAsProjectManager();
        return this;
    }*/

}
