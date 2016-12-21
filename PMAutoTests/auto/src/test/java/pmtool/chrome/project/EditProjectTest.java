package pmtool.chrome.project;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagesandsteps.pagefactory.pmtool.project.EditProjectPageFactory;
import pagesandsteps.steps.pmtoolsteps.project.CreateProjectSteps;
import pagesandsteps.steps.pmtoolsteps.project.EditProjectSteps;

/**
 * @author: matcievskiy on 29.02.2016.
 */
public class EditProjectTest {


    private EditProjectSteps editProjectSteps;

    public EditProjectTest() throws InterruptedException {
        editProjectSteps = new EditProjectSteps();
    }

    @Test
    public void createSampleProject() throws InterruptedException {

        editProjectSteps.
                openPmt().
                loginAsPM().
                waitTable().
                goToProjectList().
                clickEditProject().
                editProjectName("testProjectEdit").
                saveProject().
                checkProjectUpdating("testProjectEdit").
                logout();
    }





}
