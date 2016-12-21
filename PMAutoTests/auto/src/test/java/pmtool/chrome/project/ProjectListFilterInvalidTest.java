package pmtool.chrome.project;

import helpers.dataproviders.ProjectListFilterDataProvider;
import org.testng.annotations.Test;
import pagesandsteps.steps.pmtoolsteps.project.ProjectListSteps;

/**
 * Created by martynov on 17.03.2016.
 */
public class ProjectListFilterInvalidTest {
    private ProjectListSteps filterSteps;

    public ProjectListFilterInvalidTest() throws InterruptedException {
        filterSteps = new ProjectListSteps();
    }

    @Test(dataProvider = "InvalidFieldsFilterProvider",dataProviderClass = ProjectListFilterDataProvider.class)
    public void filterInvalidProject(String projectName, String status, String projectType){
        filterSteps.
                openPmt().
                loginAsPM().
                checkElements().
                fillFilter(projectName,status,projectType).
                checkEmptyList().
                clearFilter().
                checkElements().
                logout();

    }
}
