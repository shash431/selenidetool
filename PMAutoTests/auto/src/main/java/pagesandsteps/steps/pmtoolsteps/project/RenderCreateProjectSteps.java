package pagesandsteps.steps.pmtoolsteps.project;

import base.BaseWebSteps;
import pagesandsteps.pagefactory.pmtool.navigation.NavigationBarFactory;
import pagesandsteps.pagefactory.pmtool.project.CreateProjectPageFactory;
import pagesandsteps.pagefactory.pmtool.project.ProjectListPageFactory;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selenide.page;

/**
 * Created by martynov on 17.03.2016.
 */
public class RenderCreateProjectSteps extends BaseWebSteps{
    NavigationBarFactory navigationBarFactory = null;
    CreateProjectPageFactory createProjectPageFactory = null;
    ProjectListPageFactory projectListPageFactory = null;

    public RenderCreateProjectSteps() throws InterruptedException{
        navigationBarFactory = page(NavigationBarFactory.class);
        createProjectPageFactory = page(CreateProjectPageFactory.class);
        projectListPageFactory = page(ProjectListPageFactory.class);
    }

    @Step("Open PMTool")
    public RenderCreateProjectSteps openPmt(){
        super.goToPmTool();
        return this;
    }

    //-------------------- временно. у ПМ_тест нет соответствующих прав
    /*@Step("Login as project manager")
    public RenderCreateProjectSteps loginAsPM(){
        super.loginAsProjectManager();
        return this;
    }*/

    @Step("Login as Martynov")
    public RenderCreateProjectSteps loginAsAdmin(){
        super.loginAsMart();
        return this;
    }

    @Step("Wait Table After Login")
    public RenderCreateProjectSteps waitTable(){

        navigationBarFactory.waitMainTable();
        return this;
    }

    @Step("Go to Project List")
    public RenderCreateProjectSteps goToProjectList(){

        navigationBarFactory.clickProjectList();
        //projectListPageFactory.waitProjectList();
        return this;
    }

    @Step("Click add project on project list page")
    public RenderCreateProjectSteps clickAddProject(){

        createProjectPageFactory.clickCreateProject();
        return this;
    }

    @Step("Check Elements in the Estimation Form")
    public RenderCreateProjectSteps checkEstimationElements(){
        projectListPageFactory.checkEstimatiomForm();
        return this;
    }

    @Step("Click Save Button in the Estimation Form")
    public RenderCreateProjectSteps clickSaveEstimation(){
        projectListPageFactory.clickSaveButton();
        return this;
    }


    @Step("Check Elements in the Main Inf")
    public RenderCreateProjectSteps checkMainInf(){
        createProjectPageFactory.checkMainInf();
        return this;
    }

    @Step("Check Manager")
    public RenderCreateProjectSteps checkManager(){
        createProjectPageFactory.checkManager();
        return this;
    }

    @Step("Check Department")
    public RenderCreateProjectSteps checkDepartment(){
        createProjectPageFactory.checkDepartment();
        return this;
    }

    @Step("Check Budget")
    public RenderCreateProjectSteps checkBudget(){
        createProjectPageFactory.checkBudget();
        return this;
    }

    @Step("Check Milestone")
    public RenderCreateProjectSteps checkMilestone(){
        createProjectPageFactory.checkMilestone();
        return this;
    }

    @Step("Check Client")
    public RenderCreateProjectSteps checkClient(){
        createProjectPageFactory.checkClient();
        return this;
    }

    @Step("Check Create Button")
    public RenderCreateProjectSteps checkCreateButton(){
        createProjectPageFactory.checkCreateButton();
        return this;
    }

    @Step("Logout PMTool")
    public RenderCreateProjectSteps logout(){
        super.logoutFromPmTool();
        return this;
    }
}
