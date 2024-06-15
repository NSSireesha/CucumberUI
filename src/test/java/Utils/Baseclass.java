package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Baseclass {

    public WebDriver driver;
    public WebDriver initalizeDriver() throws IOException {


FileInputStream file= new FileInputStream("C:\\Learncucumber2\\src\\test\\java\\Resources\\global.propteries");
    Properties properties= new Properties();

   properties.load(file);

   String url= properties.getProperty("Url");
   String browser= properties.getProperty("browser");

   if (driver ==null)
   {
       if (browser== "Chrome")
       {
           WebDriverManager.chromedriver().setup();
           driver= new ChromeDriver();
       }
       driver.get(url);
   }

return driver;

    }
}
