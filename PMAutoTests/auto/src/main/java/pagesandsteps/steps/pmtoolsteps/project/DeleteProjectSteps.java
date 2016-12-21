package pagesandsteps.steps.pmtoolsteps.project;

import base.BaseWebSteps;
import pagesandsteps.pagefactory.pmtool.navigation.NavigationBarFactory;
import pagesandsteps.pagefactory.pmtool.project.ProjectListPageFactory;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selenide.page;
/**
 * @author: matcievskiy on 01.03.2016.
 */
public class DeleteProjectSteps extends BaseWebSteps {

    NavigationBarFactory navigationBarFactory = null;
    ProjectListPageFactory projectListPageFactory = null;

    public DeleteProjectSteps() throws InterruptedException {
        navigationBarFactory = page(NavigationBarFactory.class);
        projectListPageFactory = page(ProjectListPageFactory.class);
    }

    @Step("Open PMTool")
    public DeleteProjectSteps openPmt(){

        super.goToPmTool();
        return this;
    }

    @Step("Login as Martynov")
    public DeleteProjectSteps loginAsPM(){

        super.loginAsMart();
        return this;
    }

    @Step("Wait Table After Login")
    public DeleteProjectSteps waitTable(){

        navigationBarFactory.waitMainTable();
        return this;
    }

    @Step("Go to Project List")
    public DeleteProjectSteps goToProjectList(){

        navigationBarFactory.clickProjectList();
        projectListPageFactory.waitProjectList();
        return this;
    }

    @Step("Delete project")
    public DeleteProjectSteps clickDeleteProject(){

        projectListPageFactory.deleteProject();
        return this;
    }

    @Step("Check that project is deleted")
    public DeleteProjectSteps checkThatProjectIsDeleted(String projectName){

        projectListPageFactory.checkDelete(projectName);
        return this;
    }

    @Step("Logout from system")
    public DeleteProjectSteps logout(){


        super.logoutFromPmTool();
        return this;
    }
}
