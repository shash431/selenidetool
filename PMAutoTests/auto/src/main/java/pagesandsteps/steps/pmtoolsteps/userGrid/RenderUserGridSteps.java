package pagesandsteps.steps.pmtoolsteps.userGrid;

import base.BaseWebSteps;
import pagesandsteps.pagefactory.pmtool.hrSpace.HRSpacePageFactory;
import pagesandsteps.pagefactory.pmtool.navigation.NavigationBarFactory;
import pagesandsteps.pagefactory.pmtool.userGrid.UserGridPageFactory;
import pagesandsteps.steps.pmtoolsteps.project.ProjectListSteps;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selenide.page;

/**
 * Created by martynov on 21.03.2016.
 */
public class RenderUserGridSteps extends BaseWebSteps {

    HRSpacePageFactory hrSpacePageFactory = null;
    UserGridPageFactory userGridPageFactory = null;
    NavigationBarFactory navigationBarFactory = null;

    public RenderUserGridSteps() throws InterruptedException{
        navigationBarFactory = page(NavigationBarFactory.class);
        hrSpacePageFactory = page(HRSpacePageFactory.class);
        userGridPageFactory = page(UserGridPageFactory.class);
    }

    @Step("Open PMTool")
    public RenderUserGridSteps openPmt(){

        super.goToPmTool();
        return this;
    }

    @Step("Login as project manager")
    public RenderUserGridSteps loginAsPM(){

        super.loginAsMart();
        return this;
    }

    @Step("Go to HR Space")
    public RenderUserGridSteps gotoHRSpace(){
        navigationBarFactory.clickHRSpace();
        return this;
    }

    @Step("Go to User Grid")
    public RenderUserGridSteps gotoUserGrid(){
        hrSpacePageFactory.clickUserManagment();
        return this;
    }

    @Step("Check User Grid")
    public RenderUserGridSteps checkUserGrid(){
        userGridPageFactory.checkUserGrid();
        return this;
    }

    @Step("Fill name in the Filter")
    public RenderUserGridSteps fillName(){
        userGridPageFactory.fillNameInGrid();
        return this;
    }

    @Step("Choose search user")
    public RenderUserGridSteps chooseUser(){
        userGridPageFactory.clickUser();
        return this;
    }

    @Step("Check PopUp User")
    public RenderUserGridSteps checkPopUp(){
        userGridPageFactory.checkAllPopUp();
        return this;
    }

    @Step("Check PopUp Parts")
    public RenderUserGridSteps checkPopUpParts(){
        userGridPageFactory.checkPopUpPart();
        return this;
    }

    @Step("Check PopUp Button")
    public RenderUserGridSteps checkButton(){
        userGridPageFactory.checkPopUpButton();
        return this;
    }

    @Step("Logout")
    public RenderUserGridSteps logout(){
        super.logoutFromPmTool();
        return this;
    }

}
