package Utils;


import PageObjects.ObjectManager;
import org.openqa.selenium.WebDriver;

public class Injectionclass {

public WebDriver driver;

public String Username;
public  String Password;

public ObjectManager objectManager;

public Injectionclass()
{
     objectManager= new ObjectManager(driver);

}
}
