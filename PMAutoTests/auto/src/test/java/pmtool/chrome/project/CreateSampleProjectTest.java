package pmtool.chrome.project;

import base.BaseWebSteps;
import base.BaseWebTest;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pagesandsteps.steps.pmtoolsteps.project.CreateProjectSteps;

/**
 * @author: matcievskiy on 29.02.2016.
 */
public class CreateSampleProjectTest extends BaseWebTest{

    private CreateProjectSteps createProjectSteps;

    public CreateSampleProjectTest() throws InterruptedException {
        createProjectSteps = new CreateProjectSteps();
    }

    @Test
    public void createSampleProject() throws InterruptedException {

        createProjectSteps.
                openPmt().
                loginAsPM().
                waitTable().
                goToProjectList().
                clickAddProject().
                checkEstimationElements().
                clickSaveEstimation().
                fillMainProjectInfo("testProject").
                fillProjectSalesManager().
                fillProjectPaymentInfo().
                fillClientInfo().
                saveProject().
                checkProject("testProject").
                logout();
    }





}
