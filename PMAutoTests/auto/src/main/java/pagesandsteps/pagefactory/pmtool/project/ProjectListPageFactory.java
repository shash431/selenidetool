package pagesandsteps.pagefactory.pmtool.project;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import helpers.elements.Table;
import org.hibernate.annotations.common.test.reflection.java.generics.deep.ANN612IssueTest;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;

import java.util.List;

/**
 * @author: matcievskiy on 29.02.2016.
 */
public class ProjectListPageFactory  {

    @FindBy(xpath = ".//button[contains(.,'Add project')]")
    private SelenideElement createProjectButton;

    @FindBy(xpath = ".//*[@class='modal-content']")
    private SelenideElement popupSelectEstimation;

    @FindBy(id = "redmineEstimationId")
    private SelenideElement redmineEstimationSelect;

    @FindBy(id = "estimation")
    private SelenideElement estimationSelect;

    @FindBy(id = "reasonId")
    private SelenideElement reasonSelect;

    @FindBy(className = "btn btn-cancel")
    private SelenideElement cancelButton;

    @FindBy(xpath = ".//button[contains(.,'Save changes')]")
    private SelenideElement saveButton;


    @FindBy(id = "ProjectName")
    private SelenideElement projectNameField;

    @FindBy(xpath = ".//button[contains(.,'Filter')]")
    private SelenideElement filterButton;

    @FindBy(xpath = ".//button[contains(.,'Clear')]")
    private SelenideElement clearButton;

    @FindBys(@FindBy(xpath = ".//*[@type='checkbox']"))
    private List<SelenideElement> statuses;

    @FindBys(@FindBy(xpath = ".//*[@type='radio']"))
    private List<SelenideElement> projectTypes;

    @FindBy(xpath = ".//*[@id='ProjectsGridContainer']/table/tbody/tr[2]/td[8]/div/a[1]")
    private SelenideElement editProject;

    @FindBy(xpath = ".//*[@id='ProjectsGridContainer']/table/tbody/tr[2]/td[8]/div[1]/form/button")
    private SelenideElement deleletProject;

    //Миша не костыль!!!!!!
    @FindBy(xpath = ".//*[@id='ProjectsGridContainer']/table/tbody/tr[2]/td[1]/div/a[1]")// временный икс пас. хотя не костыль, а надежное решение
    private SelenideElement projectInList;

    @FindBy(xpath = ".//*[@id='ProjectsGridContainer']/table/tbody")
    private SelenideElement projectList;


    public void waitProjectList(){
        projectList.should(Condition.present).should(Condition.visible).shouldBe(Condition.visible);
    }

    public void clickCreateProject(){
        createProjectButton.should(Condition.present).shouldBe(Condition.visible).click();
    }

    public void checkEstimatiomForm(){
        popupSelectEstimation.should(Condition.present).shouldBe(Condition.visible);
    }

    public void checkFieldsEstimation(){
        redmineEstimationSelect.should(Condition.present).shouldBe(Condition.visible);
        estimationSelect.should(Condition.present).shouldBe(Condition.visible);
        reasonSelect.should(Condition.present).shouldBe(Condition.visible);
    }

    public void checkButtonsEstimation(){
        cancelButton.should(Condition.present).shouldBe(Condition.visible);
        saveButton.should(Condition.present).shouldBe(Condition.visible);
    }

    public void clickSaveButton(){                      //батон Estimation перед переходом в форму создания проекта
        saveButton.should(Condition.present).shouldBe(Condition.visible).click();
    }

    public void checkElementsProjectList(){
        deleletProject.should(Condition.present);
        Assert.assertTrue(projectList.exists());
        Assert.assertTrue(!projectList.getText().isEmpty());
    }

    public void clickEditProject(){
        editProject.should(Condition.present).click();
    }

    public void checkNewProject(String newProjectName){
        projectInList.should(Condition.present).should(Condition.visible).shouldBe(Condition.present)
                .shouldBe(Condition.appear)
                .shouldBe(Condition.matchesText(newProjectName));
    }

    public void deleteProject(){
        deleletProject.should(Condition.present).should(Condition.visible).click();
        Selenide.confirm();
    }

    public void checkDelete(String project){
        projectList.should(Condition.visible).should(Condition.present);
        Assert.assertTrue(projectList.getText().contains(project));
    }

    public void filterProject(String projectName, String status, String projectType){

        projectNameField.should(Condition.present).clear();
        projectNameField.sendKeys(projectName);

        switch (status){
            case "0": statuses.get(0).should(Condition.present).click();
                break;
            case "1": statuses.get(1).should(Condition.present).click();
                break;
            case "2": statuses.get(2).should(Condition.present).click();
                break;
        }

        switch (projectType){
            case "0": projectTypes.get(0).should(Condition.present).click();
                break;
            case "1": projectTypes.get(1).should(Condition.present).click();
                break;
            case "2": projectTypes.get(2).should(Condition.present).click();
                break;
        }

    }

    public void clickFilter(){
        filterButton.should(Condition.present).click();
    }

    public void clearFilter(){
        clearButton.should(Condition.present).should(Condition.visible).click();
    }

    public void checkSearchProject(){
        Assert.assertTrue(projectList.getText().contains("Planme"));
    }

    public void checkEmptyList(){
        Assert.assertFalse(projectList.getText().contains("2352352rwgrwg"));
    }
}
