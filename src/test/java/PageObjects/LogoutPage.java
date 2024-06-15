package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {

    public WebDriver driver;
    public LogoutPage (WebDriver driver)
    {
        this.driver= driver;
    }

   By signoutbtn= By.xpath("Signout button locator");

    By logoutmsg= By.xpath("logout msglocator");

    public String logoutpagetitle()
    {
       return driver.getTitle();
    }

    public void clicksignoutbtn()
    {
        driver.findElement(signoutbtn).click();
    }

    public String getlogoutmsg()
    {
        return driver.findElement(logoutmsg).getText();
    }


}
