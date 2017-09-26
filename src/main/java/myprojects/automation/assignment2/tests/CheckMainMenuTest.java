package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class CheckMainMenuTest extends BaseScript {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = getDriver();
        // TODO Script to check Main Menu items
        try {

            driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0");

            SignUpPage signUpPage = new SignUpPage(driver);
            signUpPage.enterName("webinar.test@gmail.com", "Xcg7299bnSmMuRLp9ITw");
            signUpPage.submitBtn();
            Thread.sleep(5000);

            MenuInAdminPannel menu = new MenuInAdminPannel(driver);
           // menu.newPath();
            menu.menuStart();
            menu.firstWindow();
            //if don't work(alternative)
             /* menu.menuClickDashboard();
            menu.menuClickOrder();
            menu.menuClickClient();
            menu.menuClickService();
            menu.menuClickStatistics();
            menu.menuClickDelivery();
            menu.menuClickDesign();
            menu.menuClickPay();
            menu.menuClickInter();
            menu.menuClickParam();
            menu.menuClickConfig();
            menu.menuClickCatalog();
            menu.menuClickModules();*/
            Thread.sleep(5000);

            LogOut logOutSite = new LogOut(driver);
            logOutSite.logOutOnPage();
            logOutSite.logOutSuccessful();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Script doesn't work");
        }
        finally {
            driver.close();
        }

    }
}
