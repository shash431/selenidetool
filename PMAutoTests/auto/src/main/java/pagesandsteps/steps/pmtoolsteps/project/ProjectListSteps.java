package pagesandsteps.steps.pmtoolsteps.project;

import base.BaseWebSteps;
import pagesandsteps.pagefactory.pmtool.navigation.NavigationBarFactory;
import pagesandsteps.pagefactory.pmtool.project.ProjectListPageFactory;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selenide.page;

/**
 * Created by matcievskiy on 04.03.2016.
 */
public class ProjectListSteps extends BaseWebSteps {

    NavigationBarFactory navigationBarFactory = null;
    ProjectListPageFactory projectListPageFactory = null;

    public ProjectListSteps() throws InterruptedException {
        navigationBarFactory = page(NavigationBarFactory.class);
        projectListPageFactory = page(ProjectListPageFactory.class);
    }

    @Step("Open PMTool")
    public ProjectListSteps openPmt(){

        super.goToPmTool();
        return this;
    }

    @Step("Login as Martynov")
    public ProjectListSteps loginAsPM(){

        super.loginAsMart();
        return this;
    }

    @Step("Wait Table After Login")
    public ProjectListSteps waitTable(){

        navigationBarFactory.waitMainTable();
        return this;
    }

    @Step("Go to Project List")
    public ProjectListSteps goToProjectList(){

        navigationBarFactory.clickProjectList();
        projectListPageFactory.waitProjectList();
        return this;
    }

    @Step("Check Elements Page List")
    public ProjectListSteps checkElements(){
        projectListPageFactory.checkElementsProjectList();
        return this;
    }

    @Step("Try to filter with several data")
    public ProjectListSteps fillFilter(String projectName, String status, String projectType){
        projectListPageFactory.filterProject(projectName,status,projectType);
        projectListPageFactory.clickFilter();
        return this;
    }

    @Step("Click Clear Filter")
    public ProjectListSteps clearFilter(){
        projectListPageFactory.clearFilter();
        return this;
    }

    @Step("Check Elements after filter")
    public ProjectListSteps checkSearch(){
        projectListPageFactory.checkSearchProject();
        return this;
    }

    @Step("Check Empty Project List")
    public ProjectListSteps checkEmptyList(){
        projectListPageFactory.checkEmptyList();
        return this;
    }

    @Step("Logout PMTool")
    public ProjectListSteps logout(){
        super.logoutFromPmTool();
        return this;
    }
}
