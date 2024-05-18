package pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {

//Object model created for the Test case 1
    public WebDriver driver;

    public Page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

   @FindBy(xpath="/html/body/div[3]/header/div[2]/div[3]")
   public WebElement firstsearch;

   @FindBy(xpath = "//*[@id='search']")
   public WebElement enetertext;

   @FindBy(xpath="//*[@id=\"search_mini_form\"]/div[2]/button")
   public WebElement clickgo;

   @FindBy(xpath="/html/body/div[3]/main/div[3]/div[2]/div/div[2]/div/div[1]/div[2]/button")
   public WebElement exposefilter;

   @FindBy(xpath="//*[@id=\"narrow-by-list\"]/div[1]/div[2]/form/ul/li[6]/a")
   public WebElement selectfilter;

   @FindBy(className = "tocart")
   public WebElement addcart;

   @FindBy(xpath="/html/body/div[3]/header/div[2]/div[2]/div[1]/a")
   public WebElement carticon;

   @FindBy(xpath = "/html/body/div[3]/header/div[2]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[4]/div/a")
   public WebElement viewcart;

   public void firstClick(){
    firstsearch.click();
   }

   public void enterClick(){
    enetertext.click();
   }

   public void enterText(String Data){
    enetertext.sendKeys(Data);
   }

   public void clickGo(){
    clickgo.click();
   }

public void exposeClick(){
    exposefilter.click();
}

public void selectFilterClick(){
    selectfilter.click();
}

public void addCart(){
    addcart.click();
}

public void clickIcon(){
    carticon.click();
}

public void viewCart(){
    viewcart.click();
}


}
