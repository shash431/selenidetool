package pagesandsteps.steps.pmtoolsteps.allocation;

import base.BaseWebSteps;
import helpers.requests.RequestPOST;
import pagesandsteps.pagefactory.pmtool.allocation.AllocationPageFactory;
import pagesandsteps.pagefactory.pmtool.navigation.NavigationBarFactory;
import pagesandsteps.pagefactory.pmtool.project.CreateProjectPageFactory;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selenide.page;

/**
 * @author: matcievskiy on 09.03.2016.
 */
public class CreateAllocationSteps extends BaseWebSteps {

    NavigationBarFactory navigationBarFactory = null;
    AllocationPageFactory allocationPageFactory = null;
    RequestPOST requestPOST = null;

    public CreateAllocationSteps() throws InterruptedException {
        navigationBarFactory = page(NavigationBarFactory.class);
        allocationPageFactory = page(AllocationPageFactory.class);
        requestPOST = page(RequestPOST.class);
    }

    @Step("Open PMTool")
    public CreateAllocationSteps openPmt(){

        super.goToPmTool();
        return this;
    }

    @Step("Login as project manager")
    public CreateAllocationSteps loginAsPM(){

        super.loginAsMart();
        return this;
    }

    @Step("Go to resource allocation")
    public CreateAllocationSteps goToAllocation(){
        navigationBarFactory.clickAllocationMenu();
        return this;
    }


    @Step()
    public CreateAllocationSteps request() throws Exception {
        requestPOST.sendPost();
        return this;
    }







    @Step("Click department")
    public CreateAllocationSteps chooseDepartment(){

        allocationPageFactory.clickAllocateQa();
        return this;
    }

    @Step("Click allocate")
    public CreateAllocationSteps clickAllocate(){

        allocationPageFactory.clickAllocateButton();
        return this;
    }

    @Step("Filter and choose project")
    public CreateAllocationSteps chooseProject(){

      allocationPageFactory.fillFilter();
        return this;

    }

    @Step("Add hours")
    public CreateAllocationSteps addHours(){


        allocationPageFactory.fillAllocation();
        return this;
    }

    @Step("Send allocation")
    public CreateAllocationSteps sendAllocation(){

        allocationPageFactory.sendAllocation();
        return this;
    }


    @Step("Logout")
    public CreateAllocationSteps logout(){


        super.logoutFromPmTool();
        return this;
    }



}
