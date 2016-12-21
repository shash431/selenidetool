package pagesandsteps.pagefactory.pmtool.hrSpace;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by martynov on 18.03.2016.
 */
public class HRSpacePageFactory {

    @FindBy(xpath = "html/body/main/div/div/div[1]/div") //временно, переделать икспас
    private SelenideElement userManagment;

    public void clickUserManagment(){
        userManagment.should(Condition.present).click();
    }

}
