package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties; 
import utils.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public class Page2 
 {

    public WebDriver driver;

    public Page2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
   
    // access to properties file
    Base b= new Base();

    Properties prop =b.Get_properties();

    //Gift Details
    @FindBy(xpath = "//label[@for='amt3']")
    private WebElement amount;

    //Designate my gift to...
    @FindBy(xpath="//select[@id='designation']")
    private WebElement select;   
    
    // Gift Options
    @FindBy(xpath="//label[@for='anonymous']")
    private WebElement label2;

    //title
    @FindBy(xpath="//*[@id='billingInfo']/div[1]/div[1]/select")
    private WebElement mr;

    //FirstName
    @FindBy(xpath="//input[@id='personalFirstName']")
    private WebElement fname;
    
    //LastName
    @FindBy(xpath="//input[@id='personalLastName']")
    private WebElement lname;
    
    //CountryName
    @FindBy(xpath="//select[@id='personalCountry']")
    private WebElement Countryname;
    
    //State
    @FindBy(xpath="//select[@id='personalState']")
    private WebElement state;
       
    //address
    @FindBy(xpath="//input[@id='personalAddress']")
    private WebElement address;

    //cityName
    @FindBy(xpath="//input[@id='personalCity']")
    private WebElement city;

    //personalZip
    @FindBy(xpath="//input[@id='personalZip']")
    private WebElement zipcode;
    
    //personalPhone
    @FindBy(xpath="//input[@id='personalPhone']")
    private WebElement phone;

    //Email
    @FindBy(xpath="//input[@id='personalEmail']")
    private WebElement Email;

    //submit
    @FindBy(xpath="//button[@id='adfSubmit']")
    private WebElement submit;

    //complete payment pop-up
    @FindBy(xpath = "//h1[@class='fade-in']")
    private WebElement popup;


   
    public void setamount() {
        amount.click();
    }

    public void setSelect() {
        Select s =new Select(select);
        String Medical_Education=prop.getProperty("Medical_Education");
        s.selectByVisibleText(Medical_Education);

    }
 public void setLabel2() {
    label2.click();
}

public void setMr() {
    Select s =new Select(mr);
    s.selectByValue("Mr.");    
}

public void setFname() {
    String Tester=prop.getProperty("Firstname");
    fname.sendKeys(Tester);
}

public void setLname() {
    String TesterLast=prop.getProperty("Lastname");

    lname.sendKeys(TesterLast);
}

public void setCountryname() {
    Select s =new Select(Countryname);
    String India=prop.getProperty("Country");

        s.selectByVisibleText(India);

}

public void setState() {
    Select s =new Select(state);
    String NA=prop.getProperty("State");

    s.selectByValue(NA);
}

public void setAddress() {
    String addres=prop.getProperty("addres");

    address.sendKeys(addres);
}

public void setCity() {
    String cityname=prop.getProperty("cityname");

    city.sendKeys(cityname);
}

public void setZipcode() {
    String pincode=prop.getProperty("pincode");

    zipcode.sendKeys(pincode);
}

public void setPhone() {
    String phonenumber=prop.getProperty("phonenumber");

    phone.sendKeys(phonenumber);
}

public void setEmail() {
    String email=prop.getProperty("email");

    Email.sendKeys(email);
}

public void setSubmit() {
    submit.click();
}

public String setPopup() {
   String pop= popup.getText();
   return pop;
}


}
