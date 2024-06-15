package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    public  WebDriver driver;
    public RegistrationPage (WebDriver driver)
    {
        this.driver=driver;

    }

  By username=  By.xpath("username locator");
    By password=  By.xpath("password locator");

    By email=  By.xpath("email locator");

    By submitbtn=  By.xpath("submitbtn locator");

    By regsuccessmsg=  By.xpath("success message locator");


    public String getregistrationtitle()
    {
        return driver.getTitle();
    }
    public void setregistrationdetails(String Username, String Password, String Email)
    {
        driver.findElement(username).sendKeys(Username);
        driver.findElement(password).sendKeys(Password);
        driver.findElement(email).sendKeys(Email);
    }

    public void clicksubmitbtn()
    {
        driver.findElement(submitbtn).click();
    }

    public String getsuccessmsg()
    {
        return driver.findElement(regsuccessmsg).getText();
    }
}
