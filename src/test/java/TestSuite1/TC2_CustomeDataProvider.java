package TestSuite1;

import org.testng.annotations.DataProvider;

public class TC2_CustomeDataProvider {
    @DataProvider(name = "UserDeatils")
    public Object[][] getData(){
        Object[][] o={{"AAYAN","KHAJEKAR"},{"PAWNI","KHAJEKAR"}};
        return o;
    }
}
