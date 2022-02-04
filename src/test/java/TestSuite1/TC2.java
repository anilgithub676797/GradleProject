package TestSuite1;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC2 {

    @Test(dataProvider = "UserDeatils",dataProviderClass = TestSuite1.TC2_CustomeDataProvider.class)
    @Step("This is data driven step")
    @Description("THIS IS DATA DRIVEN STEP")
    public void TC2(String fname,String lname){
        System.out.println(fname+" "+lname);
    }




}
