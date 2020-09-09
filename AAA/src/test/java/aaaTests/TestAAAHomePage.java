package aaaTests;

import aaaPages.AAAHomePage;
import aaaPages.AAAWebElements;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static aaaPages.AAAHomePage.*;
import static aaaPages.AAAWebElements.Return_to_Top;

public class TestAAAHomePage extends WebAPI {

     @BeforeMethod
     public void BrowserSetUp(){
        initHomePage();
     }
     /*
     Test Case ID: 001
     AAA Home Page Title verification
     */
    @Test (groups = {"SmokeTesting"})
    public void HomePage_Get_Title_Test(){
        aaaHomePage.HomePage_Get_Title();
    }
    /*
     Test Case ID: 002
     AAA Home Page Url verification
   */
    @Test(groups = {"SmokeTesting"})
    public void HomePage_Get_Url_Test(){
        aaaHomePage.HomePage_Get_Url();
    }
    /*
    Test Case ID: 005
    AAA Home Page Confirmation Area  PopUP window By Zip Code verification
   */
    @Test(groups = {"SmokeTesting"})
    public void HomePage_PopUP_Window_By_Zip_Code_Is_Displayed_Test(){

         boolean Result=aaaHomePage.HomePage_PopUP_Window_By_Zip_Code_Is_Displayed();
        Assert.assertTrue(Result);
    }
    /*
     Test Case ID: 006
     AAA Home Page notification-text verification
    */
    @Test
    public void HomePage_Get_Notification_Text_Test(){

        aaaHomePage.HomePage_Get_Notification_Text();
    }
    /*
     Test Case ID: 008
     AAA Home Page Join Button Is Displayed verification
    */
    @Test
    public void HomePage_Check_Join_Button_Is_Displayed_Test(){

        aaaHomePage.HomePage_Check_Join_Button_Is_Displayed();
    }
    /*
     Test Case ID: 010
     AAA Home Page Join Button Is Enabled verification
    */
    @Test
    public void HomePage_Check_Join_Button_Is_Enabled_Test(){

        aaaHomePage.HomePage_Check_Join_Button_Is_Enabled();
    }
    /*
     Test Case ID: 012
     AAA Home Page Return to Top verification
   */
    @Test
    public void HomePage_Check_Return_to_Top_Button_Is_Displayed_Test(){

        aaaHomePage.HomePage_Check_Return_to_Top_Button_Is_Displayed();
    }
    /*
     Test Case ID: 014
     AAA Home Page Return to Top verification after scroll down
   */
    @Test
    public void HomePage_Check_Return_To_Top_Button_After_ScrollDown_Is_Displayed_Test() throws InterruptedException {
        aaaHomePage.HomePage_Check_Return_To_Top_Button_After_ScrollDown_Is_Displayed();
        sleepFor(2);
        scrollPageDown(driver);
        sleepFor(2);
        boolean Flag1=isWebElementDisplayed(driver, Return_to_Top);
        Assert.assertTrue(Flag1,"The return to Top button is displayed");
    }
    /*
     Test Case ID: 016
     AAA Home Page Travel Discounts Flights Round Trip AirRadio Button Is Selected verification
    */
    @Test
    public void HomePage_Check_Round_Trip_Air_Radio_Button_Is_Selected_Test(){
       boolean Result= aaaHomePage.HomePage_Check_Round_Trip_Air_Radio_Button_Is_Selected();
       Assert.assertTrue(Result);
    }
    /*
    Test Case ID: 018
    AAA Home Page Travel Discounts Flights One Way AirRadio Button Is Selected verification
    */
    @Test
    public void HomePage_Check_One_Way_Air_Radio_Button_Is_Selected_Test() throws InterruptedException {
        boolean Result= aaaHomePage.HomePage_Check_One_Way_Air_Radio_Button_Is_Selected_Test();
        Assert.assertFalse(Result);
    }

}
