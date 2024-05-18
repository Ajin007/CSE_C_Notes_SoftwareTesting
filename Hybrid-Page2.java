package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2 {

// Page Object Model created for the Testcase 2
    public WebDriver driver;

    public Page2(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(linkText = "Groceries & Staples")
    public WebElement groceries;

    @FindBy(xpath="//*[@id='ui-id-20']")
    public WebElement view;

    @FindBy(xpath="//*[@id='narrow-by-list']/div[1]/div[2]/form/ul/li[2]")
    public WebElement filter;

    @FindBy(xpath="/html/body/div[3]/main/div[4]/div/div[2]/div/div[2]/div[1]/ol/li[1]/div")
    public WebElement checktext;


    public void clickGroceries(){
        groceries.click();
    }

    public void viewGroceries(){
        view.click();
    }

    public void filterInGroceries(){
        filter.click();
    }

    public void checkText(){
        checktext.getText();
    }
}
