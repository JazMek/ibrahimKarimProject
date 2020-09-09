package aaaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AAAWebElements {

    public static String Zip_Code ="11228";
    public static final String HomePage_Notification_Text_XP ="//div[contains(text(),'Important messages regarding coronavirus (COVID-19')]";
    @FindBy(how= How.XPATH ,using=HomePage_Notification_Text_XP )
    public static WebElement Notification_Text;
    public static final String HomePage_Join_Button_XP ="//a[contains(text(),'JOIN')]";
    @FindBy(how= How.XPATH ,using=HomePage_Join_Button_XP )
    public static WebElement Join_Button;
    public static final String HomePage_Return_to_Top_XP ="//html//body//div//span//a";
    @FindBy(how= How.XPATH ,using=HomePage_Return_to_Top_XP )
    public static WebElement Return_to_Top;
    public static final String HomePage_rs_search_box_XP ="//body/div/div/div[4]/div[1]/div[1]/div[1]";
    @FindBy(how= How.XPATH ,using=HomePage_rs_search_box_XP )
    public static WebElement rs_search_box;
    public static final String HomePage_Popup_Window_Zip_Code_Field_ID ="zipcodeInput";
    @FindBy(how= How.ID ,using=HomePage_Popup_Window_Zip_Code_Field_ID  )
    public static WebElement Popup_Window_Zip_Code_Field;
    public static final String HomePage_Exclusive_Member_Discounts_XP ="//h2[contains(text(),'Exclusive Member Discounts')]";
    @FindBy(how= How.XPATH ,using=HomePage_Exclusive_Member_Discounts_XP )
    public static WebElement Exclusive_Member_Discounts;
    public static final String HomePage_Travel_Discounts_Flights_XP ="//p[contains(text(),'Flights')]";
    @FindBy(how= How.XPATH ,using=HomePage_Travel_Discounts_Flights_XP )
    public static WebElement Travel_Discounts_Flights;
    public static final String HomePage_Flights_Round_Trip_Air_Radio_Button_CSS ="#round-trip";
    @FindBy(how= How.CSS ,using=HomePage_Flights_Round_Trip_Air_Radio_Button_CSS )
    public static WebElement Round_Trip_Air_Radio_Button;
    public static final String HomePage_Flights_One_Way_Air_Radio_Button_CSS ="#one-way";
    @FindBy(how= How.CSS ,using=HomePage_Flights_One_Way_Air_Radio_Button_CSS )
    public static WebElement One_Way_Air_Radio_Button;
    public static final String HomePage_Zipcode_Input_Field_ID ="zipcodeInput";
    @FindBy(how= How.ID ,using=HomePage_Zipcode_Input_Field_ID  )
    public static WebElement Zipcode_Input_Field;
    public static final String HomePage_Popup_Window_Zip_Code_Submission_CSS ="#zipcodeSubmit";
    @FindBy(how= How.CSS ,using=HomePage_Popup_Window_Zip_Code_Submission_CSS )
    public static WebElement Popup_Window_Zip_Code_Submission;
//    *********************************************************************************************************
    public static final String DrivingSchoolPage_Program_Details_Button_XP ="//a[contains(text(),'program details')]";
    @FindBy(how= How.XPATH ,using=DrivingSchoolPage_Program_Details_Button_XP )
    public static WebElement Program_Details_Button;
    public static final String DrivingSchoolPage_Choose_Your_State_XP ="//div//div//div//div//div//div//div//div[1]//p[2]";
    @FindBy(how= How.XPATH ,using=DrivingSchoolPage_Choose_Your_State_XP )
    public static WebElement Choose_Your_State;

   }