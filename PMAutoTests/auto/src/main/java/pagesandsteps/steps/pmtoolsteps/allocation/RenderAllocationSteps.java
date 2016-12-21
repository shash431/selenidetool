package pagesandsteps.steps.pmtoolsteps.allocation;

import base.BaseWebSteps;
import pagesandsteps.pagefactory.pmtool.allocation.AllocationPageFactory;
import pagesandsteps.pagefactory.pmtool.navigation.NavigationBarFactory;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selenide.page;

/**
 * Created by martynov on 18.03.2016.
 */
public class RenderAllocationSteps extends BaseWebSteps {

    NavigationBarFactory navigationBarFactory = null;
    AllocationPageFactory allocationPageFactory = null;

    public RenderAllocationSteps() throws InterruptedException {
        navigationBarFactory = page(NavigationBarFactory.class);
        allocationPageFactory = page(AllocationPageFactory.class);
    }

    @Step("Open PMTool")
    public RenderAllocationSteps openPmt(){

        super.goToPmTool();
        return this;
    }

    @Step("Login as project manager")
    public RenderAllocationSteps loginAsPM(){

        super.loginAsMart();
        return this;
    }

    @Step("Go to resource allocation")
    public RenderAllocationSteps goToAllocation(){
        navigationBarFactory.clickAllocationMenu();
        return this;
    }

    @Step("Check table and send button")
    public RenderAllocationSteps checkMainElements(){
        allocationPageFactory.checkElementsAllocationForm();
        return this;
    }

    @Step("Open QA li (Department)")
    public RenderAllocationSteps chooseDepartment(){
        allocationPageFactory.clickAllocateQa();
        return this;
    }

    @Step("Check Elements in Department (User Allocation)")
    public RenderAllocationSteps checkElementsInDepartment(){
        allocationPageFactory.checkUserAllocation();
        return this;
    }

    @Step("Check Elements in Department (Allocate Hours)")
    public RenderAllocationSteps checkAllocateHours(){
        allocationPageFactory.clickAllocateButton();
        return this;
    }

    @Step("Check Elements in Department (Add Project)")
    public RenderAllocationSteps checkAddProject(){
        allocationPageFactory.checkAddProjectButton();
        return this;
    }

    @Step("Logout")
    public RenderAllocationSteps logout(){
        super.logoutFromPmTool();
        return this;
    }
}
