package pmtool.chrome.project;

import base.BaseWebSteps;
import base.BaseWebTest;
import org.testng.annotations.Test;
import pagesandsteps.steps.pmtoolsteps.project.EditProjectSteps;

/**
 * Created by martynov on 21.03.2016.
 */
public class RenderEditProjectTest extends BaseWebTest{

    private EditProjectSteps editProjectSteps;

    public RenderEditProjectTest() throws InterruptedException {
        editProjectSteps = new EditProjectSteps();
    }

    @Test
    public void RenderEditProject() throws InterruptedException {

        editProjectSteps.
                openPmt().
                loginAsPM().
                waitTable().
                goToProjectList().
                clickEditProject().
                checkSM().
                checkPM().
                checkPL().
                checkDepartment().
                checkBudget().
                checkMembers().
                checkMilestone().
                checkClient().
                //saveProject().
                //deleteProject().
                logout();
    }

}
