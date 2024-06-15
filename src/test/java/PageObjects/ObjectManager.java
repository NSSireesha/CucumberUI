package PageObjects;

import org.openqa.selenium.WebDriver;

public class ObjectManager {

    public WebDriver driver;
public  ObjectManager(WebDriver driver)
{
    this.driver=driver;

}


public LoginPage getLoginPageobject ()
{
LoginPage loginpage= new LoginPage(driver);
return loginpage;

}

public LogoutPage getLogoutPageobject()
{
    LogoutPage logout= new LogoutPage(driver);
    return logout;

}

public RegistrationPage getRegistrationpageobj()
{
    RegistrationPage registrationPage= new RegistrationPage(driver);

    return registrationPage;
}

}
