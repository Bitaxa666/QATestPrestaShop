package myprojects.automation.assignment2.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by user on 9/25/17.
 */
public class MenuInAdminPannel extends PageObject {

    String oldLinks;
    WebElement[] elementId;

    @FindBy(xpath=".//*[@id='tab-AdminDashboard']/a/span")
    private WebElement dashboard;

    @FindBy(xpath=".//*[@id='subtab-AdminParentOrders']/a/span")
    private WebElement order;

    @FindBy(xpath=".//*[@id='subtab-AdminCatalog']/a/span")
    private WebElement catalog;
    //@FindBy(xpath="html/body/nav/ul/li[4]/a/span")
    //private WebElement catalog;

    @FindBy(xpath=".//*[@id='subtab-AdminParentCustomer']/a/span")
    private WebElement client;

    @FindBy(xpath=".//*[@id='subtab-AdminParentCustomerThreads']/a/span")
    private WebElement clientService;

    @FindBy(xpath=".//*[@id='subtab-AdminStats']/a/span")
    private WebElement statistics;

    //@FindBy(xpath=".//*[@id='subtab-AdminParentModulesSf']/a")html/body/nav/ul/li[9]/a/span
    //private WebElement modules;

    @FindBy(xpath="html/body/nav/ul/li[9]/a/span")
    private WebElement modules;

    @FindBy(xpath=".//*[@id='subtab-AdminParentThemes']/a/span")
    private WebElement design;

    @FindBy(xpath=".//*[@id='subtab-AdminParentShipping']/a/span")
    private WebElement delivery;

    @FindBy(xpath=".//*[@id='subtab-AdminParentPayment']/a/span")
    private WebElement pay;

    @FindBy(xpath=".//*[@id='subtab-AdminInternational']/a/span")
    private WebElement international;

    @FindBy(xpath=".//*[@id='subtab-ShopParameters']/a/span")
    private WebElement shopParametrs;

    @FindBy(xpath=".//*[@id='subtab-AdminAdvancedParameters']/a/span")
    private WebElement configuration;

    @FindBy(xpath="html/body/nav/ul/li[1]/a/span")
    private WebElement firstWindow;


    @FindBy(xpath=".//h2['Клиенты']")
    private WebElement newPath;

    //Find element and init
    public MenuInAdminPannel(WebDriver driver) {
        super(driver);
        elementId = new WebElement[13];
        elementId[0] = dashboard;
        elementId[1] = order;
        elementId[2] = client;
        elementId[3] = clientService;
        elementId[4] = statistics;
        elementId[5] = delivery;
        elementId[6] = design;
        elementId[7] = pay;
        elementId[8] = international;
        elementId[9] = shopParametrs;
        elementId[10] = configuration;
        elementId[11] = catalog;
        elementId[12] = modules;
    }


    //Method for all menu items
    public void menuStart(){
        oldLinks = null;
        try {
            for (int i = 0; i < elementId.length; i++) {
                this.elementId[i].click();
                oldLinks = driver.getTitle();
                System.out.println(oldLinks);
                driver.navigate().refresh();
                if (oldLinks.equals(driver.getTitle())) {
                    System.out.println("You stay on tabs - " + driver.getTitle());
                } else System.out.println("Open other links");
                System.out.println("Finish method");
                oldLinks = null;
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Menu start method doesn't run");
        }
    }
    //Method use if need find by h2 tag
    public void newPath(){
        System.out.println(this.newPath.getText());
        this.elementId[2].click();
        System.out.println("This link is: " + this.newPath.getText());
    }

    public void firstWindow(){
        try {
            this.firstWindow.click();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Element not found");
        }
    }


}