package myprojects.automation.assignment2.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by user on 9/25/17.
 */
public class LogOut extends PageObject {

    @FindBy(xpath=".//*[@id='employee_infos']/a/span/img")
    private WebElement logOutIcon;

    @FindBy(id="header_logout")
    private WebElement logOutBtn;

    //Method for LogOut the site presta
    public LogOut(WebDriver driver) {
        super(driver);
    }
    public void logOutOnPage(){
        try {
            Thread.sleep(2000);
            this.logOutIcon.click();
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void logOutSuccessful(){
        if (!this.logOutBtn.isDisplayed()) {

            System.out.println("Can not find the logout button");
        }
        this.logOutBtn.click();
        System.out.println("Logout is successful");
    }
}
