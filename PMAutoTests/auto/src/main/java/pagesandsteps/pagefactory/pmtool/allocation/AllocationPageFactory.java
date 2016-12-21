package pagesandsteps.pagefactory.pmtool.allocation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author: matcievskiy on 09.03.2016.
 */
public class AllocationPageFactory {

    @FindBy(xpath = "//.[@class='accordion']")
    private SelenideElement tableAllocation;

    @FindBy(xpath = "//.[@class='btn btn-simple btn-md btn-title-right']")
    private SelenideElement sendAllocateMainButton;

    @FindBy(xpath = "//span[contains(.,'QA')]")
    private SelenideElement qaAllocation;

    @FindBy(xpath = "html/body/main/div/ul/li[6]/div[3]") //переделать
    private SelenideElement qaUserAllocation;

    @FindBy(xpath = "//td[@class='current_week']//i[@class='fa fa-plus-square-o plus-toggle']")
    private SelenideElement allocateHours;

    @FindBy(xpath = "//.[@class='input_small hours-input']")
    private SelenideElement allocationHours;

    @FindBy(xpath = "//button[@title='Add Project']")
    private SelenideElement addProjectToAllocation;

    @FindBy(xpath = "//input[@class='filter-project-list']")
    private SelenideElement filterProjectInput;

    @FindBy(xpath = "//button[@title='Send Allocation']")
    private SelenideElement sendAllocation;

    @FindBy(xpath = "html/body/main/div/ul/li[6]/div[3]/table/tbody/tr/td[3]/div/div[3]/div/div/div/div/ul/li[35]")
    private SelenideElement allocationProject;





    public void checkElementsAllocationForm(){
        sendAllocateMainButton.should(Condition.present).shouldBe(Condition.visible);
        tableAllocation.should(Condition.present).shouldBe(Condition.visible);
    }

    public void clickAllocateQa(){

        qaAllocation.should(Condition.be(Condition.present)).click();
    }

    public void clickAllocateButton(){

        allocateHours.should(Condition.present).click();
        //addProjectToAllocation.should(Condition.present).click();
    }


    public void checkUserAllocation(){
        qaUserAllocation.should(Condition.present).shouldBe(Condition.visible);
        allocateHours.should(Condition.present).shouldBe(Condition.visible);
    }

    public void clickAndCheckAllocateHours(){
        allocateHours.should(Condition.present).click();
        allocationHours.should(Condition.present).shouldBe(Condition.visible);
    }

    public void checkAddProjectButton(){
        addProjectToAllocation.should(Condition.present).shouldBe(Condition.visible).click();
        filterProjectInput.should(Condition.present).shouldBe(Condition.visible);
    }

    public void fillFilter(){

        filterProjectInput.should(Condition.be(Condition.appear)).sendKeys("int");
        allocationProject.should(Condition.be(Condition.appear)).click();
    }



    public void fillAllocation(){

        allocationHours.should(Condition.present).sendKeys("40");

    }


    public void sendAllocation(){

        sendAllocation.should(Condition.present).click();

    }


}
