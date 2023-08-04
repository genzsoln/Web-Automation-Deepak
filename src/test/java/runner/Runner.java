//package runner;
//
//
//import com.microsoft.playwright.Browser;
//import com.microsoft.playwright.BrowserContext;
//import com.microsoft.playwright.BrowserType;
//import com.microsoft.playwright.Playwright;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.runner.RunWith;
//
//import java.text.SimpleDateFormat;
//import java.time.ZonedDateTime;
//import java.time.format.DateTimeFormatter;
//import java.time.temporal.ChronoUnit;
//import java.util.Date;
//
//@RunWith(Cucumber.class)
//
//@CucumberOptions(monochrome = true, features = "src/test/java/features/", dryRun = false, glue = {
//        "steps/"}, tags = "@test3", plugin = {"json:target/cucumber.json"})
//public class Runner {
//    public static Playwright playwright;
//    public static Browser browser;
//
//    @BeforeClass
//    public static void setupBeforeClass() {
//
//        try {
//            playwright = Playwright.create();
//            browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }
//    }
//
//    @AfterClass
//    public static void teardown() throws Exception {
//        try {
//         playwright.close();
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//
//
//}


package runner;


import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@RunWith(Cucumber.class)

@CucumberOptions(monochrome = true, features = "src/test/java/features/", dryRun = false, glue = {
        "steps/"}, tags = "@test2", plugin = {"json:target/cucumber.json"})
public class Runner {
    public static Playwright playwright;
    public static Browser browser;

    @BeforeClass
    public static void setupBeforeClass() {

        try {
            playwright = Playwright.create();
            browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    @AfterClass
    public static void teardown() throws Exception {
        try {
            playwright.close();
        } catch (Exception e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
