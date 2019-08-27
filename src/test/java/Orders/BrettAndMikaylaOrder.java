package Orders;


import PageObjects.*;
import org.testng.annotations.*;


public class BrettAndMikaylaOrder extends MyBaseClass {


    @Test
    public void Order()   {

        HomePage
                .Initialize(driver)
                .lnk_Login_Click();
        Login
                .Initialize(driver)
                .fn_Login();
        HomePage
                .Initialize(driver)
                .lnk_SetOrderLocation_Click();
        Locations
                .Initialize(driver)
                .fn_setLocation();
        FullMenu
                .Initialize(driver)
                .lnk_Wings_Click();
        Wings
                .Initialize(driver)
                .Lnk_TraditionalOrder_Click();
        TraditionalWings
                .Initialize(driver)
                .fn_MedSpicyGarlicWithRanchAndCel();
        ItemAddedPage
                .Initialize(driver)
                .lnk_AddAnotherItem_Click();
        FullMenu
                .Initialize(driver)
                .lnk_TendersAndMac();
        TendersAndMac
                .Initialize(driver)
                .lnk_CrispyTendersOrder_Click();
        CrispyTenders
                .Initialize(driver)
                .fn_FourTendersWithMedium();
        ItemAddedPage
                .Initialize(driver)
                .lnk_AddAnotherItem_Click();
        LeftSideBar
                .Initialize(driver)
                .lnk_SidesAndExtras_Click();
        SidesAndExtras
                .Initialize(driver)
                .btn_AddRanch_Click();
        ItemAddedPage
                .Initialize(driver)
                .btn_ViewOrder_Click();




    }


}

