package tests;

import manage.DriverManage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.sql.Driver;

public class Grid02 {

    DriverManage driverManage = new DriverManage();
    static WebDriver driver;

    @Test
    void remoteChromeTest() {

        driver = driverManage.remoteChromeSetUp();

        driver.get("https://www.youtube.com");
        System.out.println(driver.getTitle());
    }
        @Test

        void remoteFirefoxTest () {

            driver = driverManage.remoteFirefoxSetUp();

            driver.get("https://www.youtube.com");
            System.out.println(driver.getTitle());



    }
}