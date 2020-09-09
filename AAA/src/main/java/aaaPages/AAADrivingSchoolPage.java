package aaaPages;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

import static aaaPages.AAAWebElements.*;

public class AAADrivingSchoolPage extends WebAPI {



    public static String Url="https://northeast.aaa.com/driving-school/ma.html";
    public static AAADrivingSchoolPage aaaDrivingSchoolPage;
    public static AAAWebElements aaaWebElements;
    public static void initDrivingSchoolPage(){
        aaaDrivingSchoolPage = PageFactory.initElements(driver, AAADrivingSchoolPage.class);
        aaaWebElements = PageFactory.initElements(driver, AAAWebElements.class);
        navigateToUrl(driver,Url);
        setUpWindow(driver);
        ImplicitWaitTime(3);
        keysInput(Popup_Window_Zip_Code_Field,Zip_Code);
    }

    public void DrivingSchoolPage_Get_Title() {
        getTitle("Driving School: MA | AAA Northeast");
    }

    public void DrivingSchoolPage_Get_Url() {
        getUrl("https://northeast.aaa.com/driving-school/ma.html");

    }

    public void DrivingSchoolPage_Get_Notification_Text() {
        String ExpectedText="Important messages regarding coronavirus (COVID-19)";
        compare_Text(ExpectedText,Notification_Text);

    }

    public void DrivingSchoolPage_Check_Program_Details_Button_Is_Displayed() {
        boolean Flag=isWebElementDisplayed(driver, Program_Details_Button);
        Assert.assertTrue(Flag,"Program Details Button is displayed");
    }

    public void DrivingSchoolPage_Check_Choose_Your_State_List_Is_Displayed() {

                 List<WebElement> list=get_List_Of_WebElements(Choose_Your_State);
                 for(WebElement element : list){
                     System.out.println(element);
                 }
    }
}
