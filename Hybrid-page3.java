package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3 {

  //Page Object Model created for the Testcase 3

    public WebDriver driver;

    public Page3(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[3]/header/div[2]/div[2]/div[3]/div[1]/div[1]")
    public WebElement loginicon;

    @FindBy(xpath = "/html/body/div[3]/header/div[2]/div[2]/div[3]/div[1]/div[2]/div/div[2]/div[5]/div/div/a")
    public WebElement clicklogin;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "pass")
    public WebElement password;

    @FindBy(xpath="/html/body/div[2]/div/div[1]/div/div[3]/div[2]/div/form/fieldset/div[4]/div[1]/button")
    public WebElement loginbutton;

    public void clickLoginIcon(){
        loginicon.click();
    }

    public void loginPopup(){
        clicklogin.click();
    }

    public void emailPasser(String data){
        email.sendKeys(data);
    }

    public void passwordPasser(String data){
        password.sendKeys(data);
    }

    public void clickLoginButton(){
        loginbutton.click();
    }


}
