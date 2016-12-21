package pagesandsteps.pagefactory.pmtool.navigation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;

import java.util.List;

/**
 * @author: matcievskiy on 09.03.2016.
 */
public class NavigationBarFactory {

    //стартовая таблица, для ожидания полной подгрузки после логина
    @FindBy(xpath = ".//*[@class='week']")
    private SelenideElement mainTable;

    @FindBys({
            @FindBy(xpath = ".//*[@class='menu-option-icon project-icon']"),
            @FindBy(xpath = ".//*[@class='menu-option-icon finance-icon']"),
            @FindBy(xpath = ".//li[3][@class='dropdown' and contains(.,'Dashboard')]"),
            @FindBy(xpath = ".//*[@class='menu-option-icon report-icon']"),
            @FindBy(xpath = ".//*[@class='menu-option-icon resource-icon']"),
            @FindBy(xpath = ".//*[@class='menu-option-icon admin-icon']")
    })
    private List<SelenideElement> navigationBarElements;

    @FindBy(xpath = ".//*[@class='menu-option-icon project-icon']")
    private SelenideElement projectButton;

    @FindBy(xpath = ".//li/ul/li[contains(.,'Project List')]")
    private SelenideElement projectListButton;

    @FindBy(xpath = ".//*[@id='bs-example-navbar-collapse-1']/ul/li[7]/a")
    private SelenideElement resourceAllocation;

    @FindBy(xpath = ".//*[@id='bs-example-navbar-collapse-1']/ul/li[5]/a")
    private SelenideElement hrSpace;

    public void waitMainTable(){
        mainTable.exists();
    }

    /*public void waitMainTable(){
        mainTable.should(Condition.present).should(Condition.visible);

    }*/

    //проверка на отображение кнопок меню, характерные ролям пользователей
    public void checkRoleNavigationBar(){

        for(SelenideElement element: navigationBarElements){

            Assert.assertTrue(element.shouldBe(Condition.be(Condition.present)).exists(),"Nav Bar displays uncorrectly");
        }
    }

    public void clickProjectList(){
        projectButton.shouldBe(Condition.present).click();
        projectListButton.should(Condition.present).shouldBe(Condition.visible).click();
    }

    public void clickAllocationMenu(){

        resourceAllocation.should(Condition.present).click();

    }



    public void clickHRSpace(){
        hrSpace.should(Condition.present).click();
    }
}
