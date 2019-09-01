//Automation for login and logout for Orangehrm

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeHrm {
    protected static WebDriver driver;
    public  static void  main(String args[]) {

        System.setProperty("webdriver.chrome.driver", "src\\BrwoserDrivers\\chromedriver.exe");
        //open the browser
        driver = new ChromeDriver();
        //maximize the window
        driver.manage().window().fullscreen();
        //open te website
         driver.get("https://opensource-demo.orangehrmlive.com/");
         //Enter user name
         driver.findElement(By.name("txtUsername")).sendKeys("Admin");
         //Enter password
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        //click on login button
        driver.findElement(By.id("btnLogin")).click();
        //click on welcome admin link
        driver.findElement(By.linkText("Welcome Admin")).click();
        //set implicity wait for driver project
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //click on logout link
        driver.findElement(By.linkText("Logout")).click();
        //close browser
        driver.close();
    }
}
