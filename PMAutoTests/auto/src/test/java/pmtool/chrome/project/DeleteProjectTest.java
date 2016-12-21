package pmtool.chrome.project;

import base.BaseWebSteps;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagesandsteps.steps.pmtoolsteps.project.DeleteProjectSteps;

/**
 * @author: matcievskiy on 29.02.2016.
 */
public class DeleteProjectTest{

    private DeleteProjectSteps deleteProjectSteps;;

    public DeleteProjectTest() throws InterruptedException {

        deleteProjectSteps = new DeleteProjectSteps();
    }

    @Test
    public void createSampleProject() throws InterruptedException {

        deleteProjectSteps.
                openPmt().
                loginAsPM().
                waitTable().
                goToProjectList().
                clickDeleteProject().
                checkThatProjectIsDeleted("testProject").
                logout();
    }



}
