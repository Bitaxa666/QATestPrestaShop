package myprojects.automation.assignment2.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by user on 9/25/17.
 */
public class PageObject {
    protected WebDriver driver;

    //Base Page class
    public PageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
