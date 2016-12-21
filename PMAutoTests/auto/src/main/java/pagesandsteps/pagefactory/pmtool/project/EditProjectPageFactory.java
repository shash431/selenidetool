package pagesandsteps.pagefactory.pmtool.project;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * @author: matcievskiy on 01.03.2016.
 */
public class EditProjectPageFactory extends CreateProjectPageFactory {

    @FindBy(xpath = ".//button[contains(.,'Update')]")
    private SelenideElement updateButton;

    @FindBy(xpath = ".//*[@id='ManagersContainer']")
    private SelenideElement managersContainer;

    @FindBy(xpath = ".//*[@class='popup ui-dialog-content ui-widget-content']")
    private SelenideElement selectProjectManager;

    @FindBy(xpath = ".//*[@id='ProjectMembersHoursSpentInfo']")
    private SelenideElement projectMembers;

    @FindBy(xpath = ".//*[@id='MilestonesContainer']")
    private SelenideElement milestoneContainer;

    public void editProject(String projectName){
        super.fillProjectName(projectName);
    }

    public void selectSM(){
        managersContainer.find(By.xpath(".//div[1]/div/button")).should(Condition.present).shouldBe(Condition.visible).click();
        selectProjectManager.find(By.xpath(".//span[contains(.,'Mart')]")).should(Condition.present).shouldBe(Condition.visible).click();
    }

    public void selectPM(){
        managersContainer.find(By.xpath(".//div[2]/div/button")).should(Condition.present).shouldBe(Condition.visible).click();
        selectProjectManager.find(By.xpath(".//span[contains(.,'Mart')]")).should(Condition.present).shouldBe(Condition.visible).click();
    }

    public void selectPL(){
        managersContainer.find(By.xpath(".//div[3]/div/button")).should(Condition.present).shouldBe(Condition.visible).click();
        selectProjectManager.find(By.xpath(".//span[contains(.,'Mart')]")).should(Condition.present).shouldBe(Condition.visible).click();
    }

    public void checkDepartmentEdit(){
        super.checkDepartment();
    }

    public void checkBudgetEdit(){
        super.checkBudget();
    }

    public void checkMempers(){
        projectMembers.should(Condition.present).shouldBe(Condition.visible);
    }

    public void checkMilestoneEdit(){
        super.checkMilestone();
    }

    public void checkClientEdit(){
        super.checkClient();
    }

    public void fillNameAndSumMilestone(){
        milestoneContainer.find(By.className("milestone_name")).should(Condition.present).shouldBe(Condition.visible).sendKeys("MilName1");
        milestoneContainer.find(By.className("milestone_sum")).should(Condition.present).shouldBe(Condition.visible).sendKeys("5000");
    }

    public void chooseDate(){
        milestoneContainer.find(By.xpath(".//div[2]/table[1]/tbody/tr/td[5]/div/div[1]/div[2]/div[1]/div[2]")).should(Condition.present).shouldBe(Condition.visible).click();

    }

    public void clickUpdate() throws InterruptedException {
        updateButton.should(Condition.present).click();
        Thread.sleep(2000);
        Selenide.back();
    }

    public void checkThatNewProjectIsSaved(String project) throws InterruptedException {
        super.checkNewProject(project);
    }

    public void deleteNewProject(){
        super.deleteProject();
    }

}
