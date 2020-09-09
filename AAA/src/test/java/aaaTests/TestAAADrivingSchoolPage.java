package aaaTests;

import aaaPages.AAADrivingSchoolPage;
import aaaPages.AAAHomePage;
import aaaPages.AAAWebElements;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static aaaPages.AAADrivingSchoolPage.*;
import static aaaPages.AAAHomePage.*;

public class TestAAADrivingSchoolPage extends WebAPI {


    @BeforeMethod
    public void BrowserSetUp(){
        initDrivingSchoolPage();
    }

    /*
     Test Case ID: 001
     AAA Driving School Page Title verification
    */
    @Test
    public void DrivingSchoolPage_Get_Title_Test(){
        aaaDrivingSchoolPage.DrivingSchoolPage_Get_Title();
    }
    /*
     Test Case ID: 002
     AAA Driving School Page Url verification
   */
    @Test
    public void DrivingSchoolPage_Get_Url_Test(){
        aaaDrivingSchoolPage.DrivingSchoolPage_Get_Url();
    }
    /*
     Test Case ID: 003
     AAA Driving School Page notification-text verification
    */
    @Test
    public void DrivingSchoolPage_Text_Test(){
        aaaDrivingSchoolPage.DrivingSchoolPage_Get_Notification_Text();
    }

    /*
     Test Case ID: 004
     AAA Driving School Page Program Details Button Is Displayed verification
    */
    @Test
    public void DrivingSchoolPage_Check_Program_Details_Button_Is_Displayed_Test(){
        aaaDrivingSchoolPage.DrivingSchoolPage_Check_Program_Details_Button_Is_Displayed();
    }
    /*
     Test Case ID: 005
     AAA Driving School Page Choose Your State List Is Displayed verification
    */
    @Test
    public void DrivingSchoolPage_Check_Choose_Your_State_List_Is_Displayed_Test(){
        aaaDrivingSchoolPage.DrivingSchoolPage_Check_Choose_Your_State_List_Is_Displayed();

    }

  }
