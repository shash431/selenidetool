package pagesandsteps.pagefactory.pmtool.project;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.hibernate.annotations.common.test.reflection.java.generics.deep.ANN612IssueTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.SystemClock;
import org.testng.Assert;

import java.util.Date;
import java.util.List;

/**
 * @author: matcievskiy on 29.02.2016.
 */
public class CreateProjectPageFactory extends ProjectListPageFactory{

    @FindBy(xpath = ".//input[@id='BitbucketLink']")
    private SelenideElement bitbucketLink;

    @FindBy(xpath = ".//*[@name='ElanceName' and @class='control-responsive']")
    private SelenideElement elanceName;

    @FindBy(xpath = ".//*[@name='ElanceLink' and @class='control-responsive']")
    private SelenideElement elanceLink;

    @FindBy(xpath = ".//*[@id='ManagersContainer']")
    private SelenideElement managersContainer;

    @FindBy(xpath = ".//*[@id='departmentsContainer']")
    private SelenideElement departmentContainer;


    @FindBy(xpath = ".//*[@id='PaymentSchemeId']")
    private SelenideElement paymentScheme;

    @FindBy(xpath = ".//*[@id='BudgetHours']")
    private SelenideElement budgetHours;

    @FindBy(xpath = ".//*[@id='Deadline']")
    private SelenideElement deadLine;


    @FindBy(xpath = ".//*[@id='MilestonesContainer']")
    private SelenideElement milestoneContainer;

    @FindBy(xpath = ".//*[@class='popup ui-dialog-content ui-widget-content']")
    private SelenideElement selectProjectManager;

    @FindBy(xpath = ".//*[@id='ClientName']")
    private SelenideElement clientName;


    @FindBy(xpath = ".//*[@id='CreateButton']")
    private SelenideElement createButton;


    public void fillPrimaryProjectInfo(String projectData){

        bitbucketLink.should(Condition.present).sendKeys(projectData);
        elanceName.should(Condition.present).sendKeys(projectData);
        elanceLink.should(Condition.present).sendKeys(projectData);
    }

    public void fillProjectName(String projectData){

        elanceName.should(Condition.present).should(Condition.visible).clear();
        elanceName.should(Condition.present).sendKeys(projectData);

    }

    public void selectManager(){

        managersContainer.find(By.tagName("button")).should(Condition.present).click();
        selectProjectManager.find(By.xpath(".//span[contains(.,'Martynov')]")).should(Condition.present).click();

    }

    public void fillBudget(){

        paymentScheme.should(Condition.visible).should(Condition.present).getText();
        System.out.println(paymentScheme.should(Condition.visible).should(Condition.present).getText());

        if(paymentScheme.getText().equals("Fixed Price")){
            paymentScheme.selectOption("Hourly Rate");
            budgetHours.should(Condition.visible).should(Condition.present).sendKeys("100");
            deadLine.should(Condition.visible).sendKeys("29.12.2016");
        }

        else {
            budgetHours.should(Condition.visible).should(Condition.present).sendKeys("100");
            deadLine.should(Condition.visible).sendKeys("29.12.2016");//Написать нормальный генератор даты.
        }

    }

    public void fillClientInfo(){

                clientName
                .should(Condition.visible)
                .should(Condition.present)
                .sendKeys("testClient");

    }

    public void saveNewProject() throws InterruptedException {

        createButton.should(Condition.present).click();

    }

    public void checkProject(String newProjectName) throws InterruptedException {

        super.checkNewProject(newProjectName);

    }

    public void checkMainInf(){

        bitbucketLink.should(Condition.present).shouldBe(Condition.visible);
        elanceName.shouldBe(Condition.visible);
        elanceLink.shouldBe(Condition.visible);

    }

    public void checkManager(){

        managersContainer.find(By.tagName("button")).should(Condition.present).shouldBe(Condition.visible).click();
        selectProjectManager.find(By.xpath(".//span[contains(.,'Martynov')]")).should(Condition.present).shouldBe(Condition.visible).click();

    }

    public void checkDepartment(){

        departmentContainer.should(Condition.present).shouldBe(Condition.visible).find(By.tagName("button")).should(Condition.present).click();
        managersContainer.find(By.tagName("button")).should(Condition.present).shouldBe(Condition.visible);

    }

    public void checkBudget(){

        paymentScheme.should(Condition.present).shouldBe(Condition.visible);
        deadLine.should(Condition.present).shouldBe(Condition.visible);

    }

    public void checkMilestone(){

        milestoneContainer.find(By.tagName("button")).should(Condition.present).click();
        milestoneContainer.should(Condition.present).shouldBe(Condition.visible);

    }

    public void checkClient(){

        clientName.should(Condition.present).shouldBe(Condition.visible);

    }

    public void checkCreateButton(){

        createButton.should(Condition.present).shouldBe(Condition.visible);

    }
}
