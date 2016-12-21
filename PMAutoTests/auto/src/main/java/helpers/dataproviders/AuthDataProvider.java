package helpers.dataproviders;

import entities.user.UserEntity;
import org.testng.annotations.DataProvider;

/**
 * @author: matcievskiy on 29.02.2016.
 */
public class AuthDataProvider {

    @DataProvider(name="RolesAuthProvider")
    public static Object[][] credentials(){

        return new Object[][]{{new UserEntity("test_pm","123456","Project")},
                {new UserEntity("test_sales","123456","Sales")},
                { new UserEntity("pmtadmin","TC1euoCf8i0p","admin")}};
    }

    @DataProvider(name="InvalidCredentialsProvider")
    public static Object[][] invalidCredentials(){

        return new Object[][]{{"test_pm","1234567","invalid password"},
                {"test","123456","invalid login"},
                {"1111","11111","invalid credentials"},
                {"","","empty credentials"}};
    }

}
