package aaaPages;

import common.WebAPI;

public class AAAHomePage extends WebAPI {


    public void HomePage_Get_Title() {
        getTitle("Home | AAA Northeast");
    }

    public void HomePage_Get_Url() {
        getUrl("https://northeast.aaa.com/");
    }
}
