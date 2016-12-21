package pagesandsteps.pagefactory.pmtool.auth;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;

import java.util.List;

/**
 * @author: matcievskiy on 29.02.2016.
 */
public class LoginPageFactory {



    @FindBy(xpath = ".//*[@placeholder='Login']")
    private SelenideElement loginInput;

    @FindBy(xpath = ".//*[@placeholder='Password']")
    private SelenideElement passwordInput;

    @FindBy(xpath = ".//button[@class='login_btn']")
    private SelenideElement loginButton;

    @FindBy(xpath = ".//*[@class='welcome']")
    private SelenideElement welcomeText;

    @FindBy(xpath = ".//div[@class='login_error']")
    private SelenideElement validator;

    @FindBy(xpath = ".//a[contains(.,'Logout')]")
    private SelenideElement logout;

    @FindBys({@FindBy(xpath = ".//*[@placeholder='Login']"),
            @FindBy(xpath = ".//*[@placeholder='Password']"),
            @FindBy(xpath = ".//button[@class='login_btn']")
    })
    private List<SelenideElement> loginPageElementsList;

    public void elementsIsDisplayed(){

       for(SelenideElement element: loginPageElementsList){

           Assert.assertTrue(element.shouldBe(Condition.be(Condition.present)).exists(),"Login page displays uncorrectly");
       }
    }


    public void fillLoginAndPassword(String login,String password){

        loginInput.should(Condition.present).clear();
        loginInput.sendKeys(login);
        passwordInput.should(Condition.present).clear();
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton(){

        loginButton.should(Condition.present).click();
    }

    public void logoutFromPmTool(){

        logout.should(Condition.present).click();
    }

    public void checkLoginAndUserName(String key){

        Assert.assertTrue(welcomeText.should(Condition.present).getText().contains(key), "Invalid user name identification");
    }

    public void checkAuthValidation(String key){

        Assert.assertTrue(validator.should(Condition.present).isDisplayed(),"Validation doesn't work on "+ key);

    }
}
