package pagesandsteps.pagefactory.pmtool.userGrid;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

/**
 * Created by martynov on 18.03.2016.
 */
public class UserGridPageFactory {

    @FindBy(xpath = ".//*[@id='UserGridContainer']/div/table")
    private SelenideElement userList;

    @FindBy(xpath = ".//*[@data-sort='FullName' and @placeholder='filter value']")
    private SelenideElement nameInGrid;

    @FindBy(xpath = ".//button[contains(.,'Apply')]")
    private SelenideElement applyButton;

    @FindBy(xpath = ".//button[contains(.,'Clear')]")
    private SelenideElement clearButton;

    @FindBy(xpath = ".//*[@class='modal-content']")
    private SelenideElement popupGrid;

    public void checkUserGrid(){
        userList.should(Condition.present).shouldBe(Condition.visible);
        applyButton.should(Condition.present).shouldBe(Condition.visible);
        clearButton.should(Condition.present).shouldBe(Condition.visible);
    }

    public void fillNameInGrid(){
        //nameInGrid.should(Condition.present).shouldBe(Condition.visible).sendKeys("martynov");
        userList.find(By.xpath(".//*[@data-sort='FullName' and @placeholder='filter value']")).should(Condition.present).sendKeys("martynov");
        applyButton.should(Condition.present).shouldBe(Condition.visible).click();
    }

    public void clickUser(){
        userList.find(By.xpath(".//*[contains(.,'Martynov')]")).should(Condition.present).shouldBe(Condition.visible).click();
    }

    public void checkAllPopUp(){
        popupGrid.should(Condition.present).shouldBe(Condition.visible);
    }

    public void checkPopUpPart(){
        popupGrid.find(By.id("userGroupsContainer")).shouldBe(Condition.visible);
        popupGrid.find(By.id("userSkillsContainer")).shouldBe(Condition.visible);
        popupGrid.find(By.id("DepartmentId")).shouldBe(Condition.visible);
    }

    public void checkPopUpButton(){
        popupGrid.find(By.xpath(".//button[contains(.,'Close')]")).shouldBe(Condition.visible);
        popupGrid.find(By.xpath(".//button[contains(.,'Save')]")).shouldBe(Condition.visible).click();
    }
}
