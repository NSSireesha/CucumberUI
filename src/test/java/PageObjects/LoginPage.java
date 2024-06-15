package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver)
    {
this.driver=driver;
    }

By username= By.xpath("username field locator");
    By pwd= By.xpath("password field locator");

    By signinbtn= By.xpath("button  locator");

    By loginmsg= By.xpath("login msg  locator");




    public String loginpagegettitle ()
    {
        return driver.getTitle();
    }
    public void enterlogindetails(String Username, String password)
    {
driver.findElement(username).sendKeys(Username);
        driver.findElement(pwd).sendKeys(password);
    }
    public void submitbutnclick()
    {
        driver.findElement(signinbtn).click();
    }

    public String verifyloginmsg()
    {

        return driver.findElement(loginmsg).getText();
    }
}
