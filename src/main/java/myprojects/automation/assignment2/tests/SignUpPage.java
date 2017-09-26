package myprojects.automation.assignment2.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by user on 9/25/17.
 */
public class SignUpPage extends PageObject {
    @FindBy(id="email")
    private WebElement email;

    @FindBy(id="passwd")
    private WebElement password;

    @FindBy(name = "submitLogin")
    private WebElement submitButton;

    //Method for login on the site
    public SignUpPage(WebDriver driver) {
        super(driver);
    }
    public void enterName(String eml, String pwd){
        this.email.clear();
        this.email.sendKeys(eml);

        this.password.clear();
        this.password.sendKeys(pwd);
    }
    public void submitBtn(){
        this.submitButton.click();
    }

}
