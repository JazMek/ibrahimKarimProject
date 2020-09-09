package aaaPages;

import common.WebAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static aaaPages.AAAWebElements.*;

public class AAAHomePage extends WebAPI {
    public static AAAHomePage aaaHomePage;
    public static AAAWebElements aaaWebElements;

    public static void initHomePage(){
        aaaHomePage = PageFactory.initElements(driver,AAAHomePage.class);
        aaaWebElements = PageFactory.initElements(driver, AAAWebElements.class);
        setUpWindow(driver);
        ImplicitWaitTime(3);
        keysInput(Popup_Window_Zip_Code_Field,Zip_Code);
    }


    public void HomePage_Get_Title() {
        getTitle("Home | AAA Northeast");
    }

    public void HomePage_Get_Url() {

        getUrl("https://northeast.aaa.com/");
    }

    public void HomePage_Get_Notification_Text() {
        String ExpectedText="Important messages regarding coronavirus (COVID-19)";
        compare_Text(ExpectedText,Notification_Text);

    }

    public void HomePage_Check_Join_Button_Is_Displayed() {
        boolean Flag=isWebElementDisplayed(driver, Join_Button);
        Assert.assertTrue(Flag,"Join button is displayed");
    }

    public void HomePage_Check_Join_Button_Is_Enabled() {
        boolean Flag=isWebElementEnabled(driver, Join_Button);
        Assert.assertTrue(Flag);
    }

    public void HomePage_Check_Return_to_Top_Button_Is_Displayed() {
        boolean Flag=isWebElementDisplayed(driver, Return_to_Top);
        Assert.assertFalse(Flag,"The return to Top button is not displayed");
    }

    public void HomePage_Check_Return_To_Top_Button_After_ScrollDown_Is_Displayed() {

        keysInput(Popup_Window_Zip_Code_Field,Zip_Code);
    }

    public boolean HomePage_Check_Round_Trip_Air_Radio_Button_Is_Selected() {
              Travel_Discounts_Flights.click();
       return Round_Trip_Air_Radio_Button.isSelected();

    }

    public boolean HomePage_Check_One_Way_Air_Radio_Button_Is_Selected_Test() throws InterruptedException {
               Travel_Discounts_Flights.click();
        return One_Way_Air_Radio_Button.isSelected();
    }

    public boolean HomePage_PopUP_Window_By_Zip_Code_Is_Displayed() {
        return Popup_Window_Zip_Code_Field.isDisplayed();
    }
}
