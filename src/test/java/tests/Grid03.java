package tests;

import manage.DriverManage;
import org.testng.annotations.*;

public class Grid03 extends DriverManage {

    @BeforeTest
    @Parameters("browser")
    void beforeTest(@Optional("browser") String browser){
       setDriver("grid_chrome");
    }
    @Test
    public void test01(){

        driver.get("https://www.easybusticket.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }


    @AfterTest
    void afterTest(){
        closeDriver();
    }






}
