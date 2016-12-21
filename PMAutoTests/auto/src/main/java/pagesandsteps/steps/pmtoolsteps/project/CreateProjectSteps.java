package pagesandsteps.steps.pmtoolsteps.project;

import base.BaseWebSteps;
import pagesandsteps.pagefactory.pmtool.navigation.NavigationBarFactory;
import pagesandsteps.pagefactory.pmtool.project.CreateProjectPageFactory;
import pagesandsteps.pagefactory.pmtool.project.ProjectListPageFactory;
import ru.yandex.qatools.allure.annotations.Step;
import static com.codeborne.selenide.Selenide.page;

/**
 * @author: matcievskiy on 29.02.2016.
 */
public class CreateProjectSteps extends BaseWebSteps {
    NavigationBarFactory navigationBarFactory = null;
    CreateProjectPageFactory createProjectPageFactory = null;
    ProjectListPageFactory projectListPageFactory = null;

    public CreateProjectSteps() throws InterruptedException {
        navigationBarFactory = page(NavigationBarFactory.class);
        createProjectPageFactory = page(CreateProjectPageFactory.class);
        projectListPageFactory = page(ProjectListPageFactory.class);
    }

    @Step("Open PMTool")
    public CreateProjectSteps openPmt(){

        super.goToPmTool();
        return this;
    }

    @Step("Login as Martynov")
    public CreateProjectSteps loginAsPM(){

        super.loginAsMart();
        return this;
    }

    @Step("Wait Table After Login")
    public CreateProjectSteps waitTable(){

        navigationBarFactory.waitMainTable();
        return this;
    }

    @Step("Go to Project List")
    public CreateProjectSteps goToProjectList(){

        navigationBarFactory.clickProjectList();
        projectListPageFactory.waitProjectList();
        return this;
    }

    @Step("Click add project on project list page")
    public CreateProjectSteps clickAddProject(){
        projectListPageFactory.clickCreateProject();
        return this;
    }

    @Step("Check Elements in the Estimation Form")
    public CreateProjectSteps checkEstimationElements(){

        projectListPageFactory.checkEstimatiomForm();
        return this;
    }

    @Step("Click Save Button in the Estimation Form")
    public CreateProjectSteps clickSaveEstimation(){

        projectListPageFactory.clickSaveButton();
        return this;
    }

    @Step("Fill main projectInfo")
    public CreateProjectSteps fillMainProjectInfo(String projectPrimaryData){

        createProjectPageFactory.fillPrimaryProjectInfo(projectPrimaryData);
        return this;
    }

    @Step("Fill sales manager info")
    public CreateProjectSteps fillProjectSalesManager(){

        createProjectPageFactory.selectManager();
        return this;
    }

    @Step("Fill project payment info")
    public CreateProjectSteps fillProjectPaymentInfo(){

        createProjectPageFactory.fillBudget();
        return this;
    }

    @Step("Fill client info")
    public CreateProjectSteps fillClientInfo(){

        createProjectPageFactory.fillClientInfo();
        return this;
    }

    @Step("Creation finfished. Save project ")
    public CreateProjectSteps saveProject() throws InterruptedException {

        createProjectPageFactory.saveNewProject();
        return this;
    }

    @Step("Check that new project is created")
    public CreateProjectSteps checkProject(String newProjectName) throws InterruptedException {

        createProjectPageFactory.checkProject(newProjectName);
        return this;
    }

    @Step("Logout from systems")
    public CreateProjectSteps logout(){
        super.logoutFromPmTool();
        return this;
    }

    /*@Step("Wait Table After Login")
    public CreateProjectSteps waitTable(){

        navigationBarFactory.waitMainTable();
        return this;
    }*/
}
