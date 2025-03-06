import base.TestListner;
import com.aventstack.extentreports.ExtentReports;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


public class LoginTest extends TestListner {

    public String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    public WebDriver driver;



    @BeforeTest
    public void setup() {


        // Setup WebDriver
        System.out.println("Before Test executed");
        driver = new ChromeDriver();

        // Maximize window
        driver.manage().window().maximize();

        // Open the URL
        driver.get(baseUrl);

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); // 60 seconds
    }

    @Test(priority = 1, enabled = true)
    public void doLoginWithInvalidCredential() throws InterruptedException {LoginPomclass pg = new LoginPomclass(driver);


        // Enter username
        pg.setUserName("Admin");

        // Enter password
        pg.SetPassword("1234");

        // Click on login button
        pg.clickLoginButton();

        String message_expected = "Invalid credentials";
        String message_actual = pg.getInvalidText();

        Assert.assertEquals(message_expected, message_actual);

        Thread.sleep(1500); // Optional, can be replaced with WebDriverWait

        System.out.println("Change made by Y user");
        System.out.println("Change made by x user");
        System.out.println("Change made by x user");
        System.out.println("Change made by x user");


        System.out.println("Change madeby devolped new branch by y user asian user");


        
    }

    @Test
    public void git(){
        System.out.println("Change madeby devolped new branch by x user us user");

    }

    @Test(priority = 2, enabled = true)
    public void loginTestWithValidCredential()
    {
        LoginPomclass pg = new LoginPomclass(driver);
        DashboardPageclass dashboardPage = new DashboardPageclass(driver);

        // Enter username
        pg.setUserName("Admin");

        // Enter password
        pg.SetPassword("admin123");

        // Click on login button
        pg.clickLoginButton();

        // Verify if the login was successful by checking the page title
        String pageTitle = dashboardPage.getPageTitle();



        // Screenshot after login attempt

        Assert.assertEquals("OrangeHRM", pageTitle);
    }


}
