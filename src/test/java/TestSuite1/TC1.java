package TestSuite1;
import org.testng.annotations.Test;
import io.qameta.allure.Step;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
public class TC1 {
    @Test(description = "This is TC1")
    @Description("THIS IS TC1")
    @Epic("JIRA-1")
    @Step("TC1")
    public void TC1(){
        System.out.println("This is TC1");
    }

}
