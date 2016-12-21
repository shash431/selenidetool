package pmtool.chrome.allocation;

import base.BaseWebTest;
import org.testng.annotations.Test;
import pagesandsteps.steps.pmtoolsteps.allocation.CreateAllocationSteps;
import pagesandsteps.steps.pmtoolsteps.project.CreateProjectSteps;

/**
 * @author: matcievskiy on 09.03.2016.
 */
public class CreateAllocationTest extends BaseWebTest{

    private CreateAllocationSteps createAllocationSteps;

    public CreateAllocationTest() throws InterruptedException {
        createAllocationSteps = new CreateAllocationSteps();
    }

    @Test
    public void createSampleProject() throws Exception /*InterruptedException*/ {

        createAllocationSteps.
                openPmt().
                loginAsPM().
                goToAllocation().request().
                /*chooseDepartment().
                clickAllocate().
                chooseProject().
                addHours().
                sendAllocation().*/
                logout();
    }
}
