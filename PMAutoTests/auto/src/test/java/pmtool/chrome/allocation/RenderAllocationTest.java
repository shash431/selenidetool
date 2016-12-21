package pmtool.chrome.allocation;

import base.BaseWebTest;
import org.testng.annotations.Test;
import pagesandsteps.steps.pmtoolsteps.allocation.RenderAllocationSteps;

/**
 * Created by martynov on 18.03.2016.
 */
public class RenderAllocationTest extends BaseWebTest {

    private RenderAllocationSteps renderAllocationSteps;

    public RenderAllocationTest() throws InterruptedException {
        renderAllocationSteps = new RenderAllocationSteps();
    }

    @Test
    public void renderAllocation() throws InterruptedException {

        renderAllocationSteps.
                openPmt().
                loginAsPM().
                goToAllocation().
                checkMainElements().
                chooseDepartment().
                checkElementsInDepartment().
                checkAllocateHours().
                checkAddProject().
                logout();
    }
}
