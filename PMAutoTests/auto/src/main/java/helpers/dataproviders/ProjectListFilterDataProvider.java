package helpers.dataproviders;

import org.testng.annotations.DataProvider;

/**
 * Created by martynov on 15.03.2016.
 */
public class ProjectListFilterDataProvider {

    @DataProvider(name = "FieldsFilterProvider")
    public static Object[][] filters(){
        return new Object[][]{
                {"Planme","0","0"},
                {"Planme","0","2"},
                {"Planme","0","3"},
                {"Planme","1","3"}
        };
    }

    @DataProvider(name = "InvalidFieldsFilterProvider")
    public static Object[][] filterInvData(){
        return new Object[][]{
                {"2352352rwgrwg","1","1"},
        };
    }

}
