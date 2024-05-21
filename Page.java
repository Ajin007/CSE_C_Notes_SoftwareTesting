package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {

    public Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    WebDriver driver;

    @FindBy(xpath = "//span[contains(@class,'cmp-tab__button-title')][contains(text(),'Giving to')]")
    private WebElement DropMayo;

    @FindBy(xpath="//a[@id='button-d87139392b']//span[@role='text'][normalize-space()='Give Now']")
    private WebElement mayo2;


    public void setDropMayo() {
        DropMayo.click();
        
    }

    public void setMayo2() {
        mayo2.click(); 
}
}
