package runner;

import static utils.Base.log;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Page;
import pages.Page2;
import utils.Base;

public class Runner extends Base  {
  
  @Test
public  void Testcase() throws MalformedURLException, InterruptedException {
    Get_properties();

    WebDriver driver=openBrowser();
		log.info("Browser Launched");

    Page p=new Page(driver);

    
    p.setDropMayo();
    Thread.sleep(3000);
    p.setMayo2();

    Page2 home= new Page2(driver);


    home.setamount();

    home.setSelect();
    System.out.println("success");

    home.setLabel2();

    System.out.println("Gift details");

    home.setMr();

    System.out.println("set title");

    home.setFname();

    System.out.println("First Name");

    home.setLname();
    System.out.println("l Name");


    home.setCountryname();
    System.out.println("country Name");

    home.setState();
    System.out.println(" state");

    home.setAddress();
    System.out.println("address");

    home.setCity();
    System.out.println("city");

    home.setZipcode();
    System.out.println("code");

    home.setPhone();
    System.out.println("phone");

    home.setEmail();
    home.setSubmit();
    System.out.println("the end");


    Thread.sleep(7000);
    String pop=home.setPopup();

    System.out.println(pop);
}
    

}
