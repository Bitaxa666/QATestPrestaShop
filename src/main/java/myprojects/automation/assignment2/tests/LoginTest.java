package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseScript {


    public static void main(String[] args) throws InterruptedException {
        // TODO Script to execute login and logout steps
        WebDriver driver = getDriver();
        try {
            driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0");

            SignUpPage signUpPage = new SignUpPage(driver);
            signUpPage.enterName("webinar.test@gmail.com", "Xcg7299bnSmMuRLp9ITw");
            signUpPage.submitBtn();
            Thread.sleep(5000);

            LogOut logOutSite = new LogOut(driver);
            logOutSite.logOutOnPage();
            logOutSite.logOutSuccessful();
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Script not run");
        }finally {
            driver.close();
        }




     /*   @Test
        public void logiAndLogout()
        {
            WebDriver driver = getDriver();
            // WebDriver driver = new FirefoxDriver();
            driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0");
            //enter start date
            //WebElement startDate = driver.findElement(By.name("startDate"));
       */

    }


}

