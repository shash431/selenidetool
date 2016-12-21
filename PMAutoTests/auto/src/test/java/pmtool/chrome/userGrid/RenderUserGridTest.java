package pmtool.chrome.userGrid;

import base.BaseWebTest;
import org.testng.annotations.Test;
import pagesandsteps.steps.pmtoolsteps.userGrid.RenderUserGridSteps;

/**
 * Created by martynov on 21.03.2016.
 */
public class RenderUserGridTest extends BaseWebTest {

    private RenderUserGridSteps renderUserGridSteps;

    public RenderUserGridTest() throws InterruptedException{
        renderUserGridSteps = new RenderUserGridSteps();
    }

    @Test
    public void renderUserGrid() throws InterruptedException{
        renderUserGridSteps.
                openPmt().
                loginAsPM().
                gotoHRSpace().
                gotoUserGrid().
                checkUserGrid().
                fillName().
                chooseUser().
                checkPopUp().
                checkPopUpParts().
                checkButton().
                logout();
    }
}
