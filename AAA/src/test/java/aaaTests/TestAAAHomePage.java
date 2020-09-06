package aaaTests;

import aaaPages.AAAHomePage;
import aaaPages.AAAWebElements;
import common.WebAPI;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestAAAHomePage extends WebAPI {
    public static AAAHomePage aaaHomePage;
    public static AAAWebElements aaaWebElements;

    public void init(){
        aaaHomePage = PageFactory.initElements(driver,AAAHomePage.class);
        aaaWebElements = PageFactory.initElements(driver, AAAWebElements.class);
    }


     /*
     Test Case N 001:
     AAA Home Page Title verification
     */
    @Test
    public void HomePage_Get_Title_Test(){
        init();
        aaaHomePage.HomePage_Get_Title();
    }
    /*
     Test Case N 002:
     AAA Home Page Url verification
*/
    @Test
    public void HomePage_Get_Url_Test(){
        init();
        aaaHomePage.HomePage_Get_Url();
    }



}
