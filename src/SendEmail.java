//Automation for share product email to friend

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SendEmail {
    protected static WebDriver driver;
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src\\BrwoserDrivers\\chromedriver.exe");
        //open the browser
        driver = new ChromeDriver();
        //open the window
        driver.manage().window().fullscreen();
        //set implicity wait for driver project
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //open the website
        driver.get("https://demo.nopcommerce.com/");
        //click on link button
        driver.findElement(By.linkText("Log in")).click();
        //enter email id
        driver.findElement(By.className("email")).sendKeys("milan18@gmail.com");
        //enter password
        driver.findElement(By.className("password")).sendKeys("1234567");
        //click on login button
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        //click on Apple macbook pro 13 inch
        driver.findElement(By.linkText("Apple MacBook Pro 13-inch")).click();
        //click on 'Email a friend' link
        driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
        //Enter friend Email id
        driver.findElement(By.name("FriendEmail")).sendKeys("devanshujjoshi@gmail.com");
        //Enter personal message
        driver.findElement(By.xpath("//textarea[@placeholder='Enter personal message (optional).']")).sendKeys("check your email id for message");
        //click on send email
        driver.findElement(By.name("send-email")).click();
        driver.close();
    }
}