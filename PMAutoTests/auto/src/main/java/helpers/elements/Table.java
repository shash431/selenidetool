package helpers.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;
import org.openqa.selenium.By;
import pagesandsteps.pagefactory.pmtool.project.ProjectListPageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author: matcievskiy on 01.03.2016.
 */
public class Table {


    public static List<SelenideElement> getTable(SelenideElement tableBody){

            List<SelenideElement> rows = tableBody.findAll(By.tagName("tr"));
            return rows;
    }


    public static List<SelenideElement> getTableCells(SelenideElement tableBody){

        tableBody.should(Condition.visible).should(Condition.present);
        List<SelenideElement> rows = tableBody.findAll(By.tagName("tr"));
        List<SelenideElement> cells = new ArrayList<SelenideElement>();
        for(SelenideElement cell:rows){
            try{
            cells.add(cell.find(By.tagName("td")));}
            catch (ElementNotFound e){

                System.out.println("TH instead of TD");
            }
        }

        return cells;
    }
}
