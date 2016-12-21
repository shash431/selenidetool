package pmtool.chrome.project;

import base.BaseWebTest;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagesandsteps.steps.pmtoolsteps.auth.AuthSteps;
import pagesandsteps.steps.pmtoolsteps.project.RenderCreateProjectSteps;

/**
 * Created by martynov on 17.03.2016.
 */
public class RenderCreateProjectFormTest extends BaseWebTest {

    private RenderCreateProjectSteps renderCreateProjectSteps;

    public RenderCreateProjectFormTest() throws InterruptedException{
        renderCreateProjectSteps = new RenderCreateProjectSteps();
    }

    @Test
    public void renderProjectForm() throws InterruptedException{
        renderCreateProjectSteps.
                openPmt().
                loginAsAdmin().
                waitTable().
                goToProjectList().
                clickAddProject().
                checkEstimationElements().
                clickSaveEstimation().
                checkMainInf().
                checkManager().
                checkDepartment().
                checkBudget().
                checkMilestone().
                checkClient().
                checkCreateButton().
                logoutFromPmTool();
    }

    @BeforeTest()
    public void setUp() throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "src/main/resources/selenium/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver/chromedriver.exe");
        Configuration.browser ="chrome";
        Configuration.timeout   =  15000;
        renderCreateProjectSteps = new RenderCreateProjectSteps();

    }

}
