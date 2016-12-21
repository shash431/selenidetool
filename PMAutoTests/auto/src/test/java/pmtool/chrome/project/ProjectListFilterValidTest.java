package pmtool.chrome.project;

import base.BaseWebTest;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import helpers.dataproviders.ProjectListFilterDataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagesandsteps.steps.pmtoolsteps.project.ProjectListSteps;

/**
 * @author: matcievskiy on 29.02.2016.
 */
public class ProjectListFilterValidTest /*extends BaseWebTest*/{
    private ProjectListSteps filterSteps;

    public ProjectListFilterValidTest() throws InterruptedException {
        filterSteps = new ProjectListSteps();
    }

    @Test(dataProvider = "FieldsFilterProvider",dataProviderClass = ProjectListFilterDataProvider.class)
    public void filterValidProject(String projectName, String status, String projectType){
        filterSteps.
                openPmt().
                loginAsPM().
                waitTable().
                goToProjectList().
                checkElements().
                clearFilter().
                fillFilter(projectName,status,projectType).
                //waitTable(). нужно переделать ожидание
                checkSearch().
                logout();

    }

    /*@BeforeTest()
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/selenium/chromedriver.exe");
        Configuration.browser ="firefox";
        Configuration.startMaximized=true;
        Configuration.timeout   =  15000;
        filterSteps = new ProjectListSteps();

    }*/


}
