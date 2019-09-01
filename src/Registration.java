//Automation for registration form in nopcommerce

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Registration {

    protected static WebDriver driver;
    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver","src\\BrwoserDrivers\\chromedriver.exe");
        //open the browser
        driver = new ChromeDriver();
        //maximize the window
        driver.manage().window().fullscreen();
        //set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //open the website
        driver.get("https://demo.nopcommerce.com/");
        //click on register button
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //enter firstname
        driver.findElement(By.id("FirstName")).sendKeys("Milan");
        //Enter lastname
        driver.findElement(By.id("LastName")).sendKeys("kevadiya");
        //Enter email
        driver.findElement(By.name("Email")).sendKeys("milan18@gmail.com");
        //Enter password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("1234567");
        //Enter Confirm password
        driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("1234567");
        //click on register button
        driver.findElement(By.id("register-button")).click();
        driver.close();
    }
}
