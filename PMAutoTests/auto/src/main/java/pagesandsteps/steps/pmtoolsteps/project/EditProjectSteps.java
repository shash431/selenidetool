package pagesandsteps.steps.pmtoolsteps.project;

import base.BaseWebSteps;
import org.hibernate.annotations.Check;
import org.openqa.selenium.ElementNotVisibleException;
import pagesandsteps.pagefactory.pmtool.navigation.NavigationBarFactory;
import pagesandsteps.pagefactory.pmtool.project.EditProjectPageFactory;
import pagesandsteps.pagefactory.pmtool.project.ProjectListPageFactory;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selenide.page;

/**
 * @author: matcievskiy on 01.03.2016.
 */
public class EditProjectSteps extends BaseWebSteps {
    NavigationBarFactory navigationBarFactory = null;
    ProjectListPageFactory projectListPageFactory = null;
    EditProjectPageFactory editProjectPageFactory = null;

    public EditProjectSteps() throws InterruptedException {
        navigationBarFactory = page(NavigationBarFactory.class);
        projectListPageFactory = page(ProjectListPageFactory.class);
        editProjectPageFactory = page(EditProjectPageFactory.class);
    }


    @Step("Open PMTool")
    public EditProjectSteps openPmt() {

        super.goToPmTool();
        return this;
    }

    @Step("Login as Martynov")
    public EditProjectSteps loginAsPM() {

        super.loginAsMart();
        return this;
    }

    @Step("Wait Table After Login")
    public EditProjectSteps waitTable(){

        navigationBarFactory.waitMainTable();
        return this;
    }

    @Step("Go to Project List")
    public EditProjectSteps goToProjectList(){

        navigationBarFactory.clickProjectList();
        projectListPageFactory.waitProjectList();
        return this;
    }

    @Step("Click edit project")
    public EditProjectSteps clickEditProject() {

        editProjectPageFactory.clickEditProject();
        return this;
    }

    @Step("Edit project name")
    public EditProjectSteps editProjectName(String newProjectName) {

        editProjectPageFactory.editProject(newProjectName);
        return this;
    }

    @Step("Save project")
    public EditProjectSteps saveProject() throws InterruptedException {

        editProjectPageFactory.clickUpdate();
        return this;
    }

    @Step("Check that project was updated")
    public EditProjectSteps checkProjectUpdating(String newProjectName) throws InterruptedException {

        editProjectPageFactory.checkThatNewProjectIsSaved(newProjectName);
        return this;
    }

    @Step("Logout")
    public EditProjectSteps logout() {

        super.logoutFromPmTool();
        return this;
    }

    @Step("Check and Select SM")
    public EditProjectSteps checkSM() {
        editProjectPageFactory.selectSM();
        return this;
    }

    @Step("Check and Select PM")
    public EditProjectSteps checkPM() {
        editProjectPageFactory.selectPM();
        return this;
    }

    @Step("Check and Select PL")
    public EditProjectSteps checkPL() {
        editProjectPageFactory.selectPL();
        return this;
    }

    @Step("Check Department")
    public EditProjectSteps checkDepartment() {
        editProjectPageFactory.checkDepartmentEdit();
        return this;
    }

    @Step("Check Budget")
    public EditProjectSteps checkBudget() {
        editProjectPageFactory.checkBudgetEdit();
        return this;
    }

    @Step("Check Members")
    public EditProjectSteps checkMembers() {
        editProjectPageFactory.checkMempers();
        return this;
    }

    @Step("Check Milestone")
    public EditProjectSteps checkMilestone() {
        editProjectPageFactory.checkMilestoneEdit();
        return this;
    }

    @Step("Check Client")
    public EditProjectSteps checkClient() {
        editProjectPageFactory.checkClientEdit();
        return this;
    }

    @Step("Delete Project")
    public EditProjectSteps deleteProject() {
        editProjectPageFactory.deleteProject();
        return this;
    }
}