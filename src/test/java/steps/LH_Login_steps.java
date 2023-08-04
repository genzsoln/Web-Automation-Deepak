package steps;



import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.LoadState;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import runner.Runner;




import java.io.IOException;

import static runner.Runner.browser;


public class LH_Login_steps {


    public static BrowserContext context = null;
    public static Page page = null;


    /**
     * @param s
     * @throws Exception Description Initialization before starting of each scenario
     *                   execution
     */
    @Before
    public void before(Scenario s) throws Exception {
        context = browser.newContext(new Browser.NewContextOptions()
                .setHttpCredentials("u192313", "Lufthansa@123"));
        page = context.newPage();


    }


    /**
     * Description Closing the resources after execution of each scenario
     *
     * @throws IOException
     */
    @After
    public void after(Scenario s) {
        context.close();
    }


    @Given("User launches lufthansa web application")
    public void User_launches_lufthansa_web_application() {
        page.waitForLoadState(LoadState.LOAD);
        //page.navigate("https://qa-www.lufthansa.com/de/en/homepage");
        page.navigate("https://qa-www.lufthansa.com/de/en/homepage");
        page.waitForTimeout(20000);


    }

    @And("User handles privacy settings")
    public void User_handles_privacy_settings() {
        page.waitForTimeout(5000);
        page.locator("text='Agree'").click();

    }


    @And("User clicks on Login and Register Button")
    public void User_clicks_on_Login_and_Register_Button() {
        //  page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Login or register")).click();
        page.waitForTimeout(10000);
        //page.locator("text='Login'").first().click();
        page.locator("//*[@id=\"header\"]/div/div[2]/div[2]/div[1]/div[1]/div/div/a/span/span").click();
        page.waitForTimeout(30000);
    }

    @And("User enters Email address")
    public void User_enters_Email_address() {
        page.locator("text='Email address'").type("onebasiccc@yopmail.com");

    }

    @And("User clicks on Next Button")
    public void User_clicks_on_Next_Button() {
        page.locator("text=' Next '").first().click();
        page.waitForTimeout(5000);

    }

    @And("User enters Password")
    public void User_enters_Password() {
        page.locator("#id-emailLoginStepTwo-textfield").first().type(" Test@1234");

    }

    @And("User clicks on Log in Button")
    public void User_clicks_on_Log_in_Button() {
        page.waitForTimeout(30000);
        page.locator("text='Log in'").first().click();
        page.waitForTimeout(30000);
    }

//    @And ("User clicks on Username")
//    public void User_clicks_on_Username(){
//        page.locator("text='Rommy William'").first().click();
//    }
//    @And("User clicks on My Account")
//    public void User_clicks_on_My_Account(){
//        page.locator("text='My Account'").first().click();
//    }
//    @And("User clicks on My profile")
//    public void User_clicks_on_My_profile(){
//        page.locator("text='My profile").first().click();
//    }


//    @And("User handles privacy settings")
//      public void user_handles_privacy_settings() {
//      page.locator("text=' Agree '").click();

//
//      }


//   @And("User clicks on Your Travel Id login")
//     public void user_clicks_on_Your_Travel_Id_login() {
//      //  page.getByLabel("Your Travel Id login (email address)", new Page.GetByLabelOptions().setExact(true)).click();
//      page.locator("text=' Your Travel ID login (email address) '").click();
//
//    }
//
//   @And("User enters Email address")
//   public void User_enters_Email_address() {
//    //  page.getByLabel("Your Travel Id login (email address)", new Page.GetByLabelOptions().setExact(true)).click();
//   page.locator("#id-emailLoginStepOne-textfield").type("onefp44@yopmail.com");
//   page.waitForTimeout(3000);
//
//  }
//
//   @And("User clicks on Next Button")
//   public void User_clicks_on_Next_Button () {
//    //  page.getByLabel("Your Travel Id login (email address)", new Page.GetByLabelOptions().setExact(true)).click();
//	   page.waitForTimeout(5000);
//	   System.out.println("Time out completed");
//    page.locator("text=' Next '").first().click();
//
//
//
//  }
//


//    @And("User enters username and Password")
//    public void user_enters_username_and_Password() {
////       page.getByLabel("lgn_ad_rgstr_btn", new Page.GetByLabelOptions().setExact(true)).click();
//        page.getByLabel("username", new Page.GetByLabelOptions().setExact(true)).click();
//        page.getByLabel("username", new Page.GetByLabelOptions().setExact(true)).fill("LHPRODBasic1992@yopmail.com");
//        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next")).click();
//        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("Test@123");
////                page.getByText("back You are not authorised to access this page Continue here: to home page Logi").click();
////                page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).press("ArrowDown");
//        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).press("ArrowDown");
//    }


//    @When("User clicks on Log in")
//    public void user_clicks_on_submit() {
//        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log in")).click();
//    }
//
//
//
//    @Then("User get logged_in")
//    public void user_get_logged_in() {
//        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Jacob TestuserPDT")).click();
//   }


    ////////////////////////////////////////////////// Book Hotel////////////////////////////////////////////

    @And("User clicks on Hotel button")
    public void user_clicks_on_Hotel_button() {
        page.waitForTimeout(20000);
        page.locator("//span[text()='Hotel']").first().click();
        page.waitForTimeout(5000);
    }

    @And("User enters destination")
    public void user_enters_destination() {
        page.waitForTimeout(20000);
        page.locator("//input[@placeholder='Destination']").type("Mumbai");
        page.waitForTimeout(5000);
    }

    @And("User clicks on search hotel button")
    public void user_clicks_on_search_hotel_button() {
        page.waitForTimeout(20000);
        page.locator("//span[text()='Search hotel']").first().click();
        page.waitForTimeout(5000);

    }


    ///////////////////////////////////////////////// Flight Status //////////////////////////////////////////////////

    @And("User clicks on flight status button")
    public void user_clicks_on_flight_status_button() {
        page.waitForTimeout(20000);
        page.locator("//span[text()='Flight status']").first().click();
        page.waitForTimeout(5000);
    }

    @And("User scroll up the page")
    public void user_scroll_up_the_page() {
        page.waitForTimeout(8000);
        page.evaluate("window.scrollBy(0, window.innerHeight)");
        page.waitForTimeout(5000);
    }


    @And("User clicks on search by route or airport button")
    public void user_clicks_on_search_by_route_or_airport_button() {
        page.waitForTimeout(8000);
        page.locator("//a[text()='Search by route or airport']").click();
        page.waitForTimeout(5000);
    }

    @And("User clicks on flight route tab")
    public void user_clicks_on_flight_route_tab() {
        page.waitForTimeout(8000);
        page.locator("//span[text()='Flight route']").first().click();
        page.waitForTimeout(5000);
    }

    @And("User enters from city")
    public void user_enters_from_city() {
        page.waitForTimeout(8000);
        page.locator("//input[@placeholder='From']").type("Mumbai");
        page.waitForTimeout(5000);
    }

    @And("User enters To city")
    public void user_enters_To_city() {
        page.waitForTimeout(8000);
        page.locator("//input[@placeholder='To']").type("Mumbai");
        page.waitForTimeout(5000);
    }

    @And("User clicks on search")
    public void user_clicks_on_search() {
        page.waitForTimeout(8000);
        page.locator("//span[text()='Search']").first().click();
        page.waitForTimeout(5000);
    }


    /////////////////////////////////////////////// Calculate baggage ///////////////////////////////////////////

    @And("User clicks on prepare for your trip")
    public void user_clicks_on_prepare_for_your_trip() {
        page.waitForTimeout(8000);
        page.locator("//span[text()='Prepare for your trip']").first().click();
        page.waitForTimeout(5000);
    }

    @And("User clicks on Baggage section")
    public void user_clicks_on_Baggage_section() {
        page.waitForTimeout(8000);
        page.navigate(" https://qa-www.lufthansa.com/de/en/baggage-overview");
        // page.locator("/html/head").first().click();
        page.waitForTimeout(5000);
    }

    @And("User clicks on to the calculator tab")
    public void user_clicks_on_to_the_calculator_tab() {
        page.waitForTimeout(8000);
        page.locator("//span[text()='To the calculator']").first().click();
        page.waitForTimeout(5000);
    }

    @And("User enters origin")
    public void user_enters_origin() {
        page.waitForTimeout(8000);
        page.locator("//input[@placeholder='Origin']").type("Mumbai");
        page.waitForTimeout(5000);
    }

    @And("User able to enters destination")
    public void user_able_to_enters_destination() {
        page.waitForTimeout(8000);
        page.locator("//input[@placeholder='Destination']").type("Frankfurt");
        page.waitForTimeout(5000);
    }

    @And("User clicks on calculate button")
    public void user_clicks_on_calculate_button() {
        page.waitForTimeout(8000);
        page.locator("//span[text()='Calculate baggage']").first().click();
        page.waitForTimeout(5000);
    }

    @And("User scroll the page up")
    public void user_scroll_the_page_up() {

        page.waitForTimeout(8000);
        page.evaluate("window.scrollBy(0, window.innerHeight)");
        page.waitForTimeout(5000);

    }


    ////////////////////////////////////////// Travel Id ////////////////////////////////////////////

    @And("User clicks on login")
    public void user_clicks_on_login() {
        page.waitForTimeout(2000);
        page.locator("//span[text()='Login']").first().click();
        page.waitForTimeout(2000);
    }

    @And("User clicks on register for travel ID")
    public void user_clicks_on_register_for_travel_ID() {
        page.waitForTimeout(2000);
        page.locator("(//span[text()='Register for Travel ID'])[1]").first().click();
        page.waitForTimeout(2000);
    }

    @And("User enters email and password")
    public void user_enters_email_and_password() {
        page.waitForTimeout(2000);
        page.locator("//input[@id='id-email-textfield']").type("oneidbasic10230@yopmail.com");
        page.locator("//input[@type='password']").type("Test@123");
        page.waitForTimeout(2000);

    }

    @And("User clicks on continue")
    public void user_clicks_on_continue() {
        page.waitForTimeout(2000);
        page.locator("//button[@name='createAccount_next']").first().click();
        page.waitForTimeout(2000);
    }

    @And("User clicks on connect latter")
    public void user_clicks_on_connect_latter() {
        page.waitForTimeout(2000);
        page.locator("//span[text()='Connect later']").first().click();
        page.waitForTimeout(2000);
    }

    @And("User enter first name")
    public void user_enter_first_name() {
        page.waitForTimeout(2000);
        page.locator("//input[@name='firstName']").fill("AAA");
        page.waitForTimeout(2000);
    }

    @And("User enter surname")
    public void user_enter_surname() {
        page.waitForTimeout(2000);
        page.locator("//input[@name='lastName']").fill("BBB");
        page.waitForTimeout(2000);
    }

    @And("User enter birth day")
    public void user_enter_birth_day() {
        page.waitForTimeout(2000);
        page.locator("//input[@name='birthday']").fill("12");
        page.waitForTimeout(2000);
    }

    @And("User enter birth month")
    public void user_enter_birth_month() {
        page.waitForTimeout(2000);
        page.locator("//input[@name='birthmonth']").fill("12");
        page.waitForTimeout(2000);
    }

    @And("User enter birth year")
    public void user_enter_birth_year() {
        page.waitForTimeout(2000);
        page.locator("//input[@name='birthyear']").fill("1999");
        page.waitForTimeout(2000);
    }

    @And("User clicks on continue button")
    public void user_clicks_on_continue_button() {
        page.waitForTimeout(2000);
        page.locator("//button[@name='personalInformation_next']").first().click();
        page.waitForTimeout(2000);
    }

    @And("User clicks on radio button for consent")
    public void user_clicks_on_radio_button_for_consent() {
        page.waitForTimeout(30000);
        page.locator("//*[@id=\"a4ea9e2a95cd57aa73b1761659803784a77aac6f87c570f2d912771cb6495d20\"]").first().click();
        page.waitForTimeout(10000);
    }

    @And("User clicks on confirm and continue")
    public void user_clicks_on_confirm_and_continue() {
        page.waitForTimeout(2000);
        page.locator("//span[text()='Confirm and continue']").first().click();
        page.waitForTimeout(2000);
    }

    @And("User launch yopmail")
    public void user_launch_yopmail() {
        page.waitForTimeout(2000);
        page.locator("//input[@id='login']").fill("oneidbasic60849@yopmail.com");
        page.waitForTimeout(2000);
    }

    @And("User enters email id")
    public void user_enters_email_id() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("User clicks on arrarow button")
    public void user_clicks_on_arrarow_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    /////////////////////////////////////////// Calculator ////////////////////////////////////////////////

//    @And("User clicks on Username")
//    public void User_clicks_on_Username() {
//        page.locator("#lh-loginModule-name").click();
//    }
//
//    @And("User clicks on My Profile")
//    public void User_clicks_on_My_Profile() {
//        page.locator("(//a[@class='d-inline-block mb-0'])[2]").click();
//    }
//
//    @And("User clicks on Create account")
//    public void User_clicks_on_Create_account() {
//        page.locator("//a[text()='Create account']").click();
//    }
//
//    @And("User clicks on start upgrade")
//    public void User_clicks_on_start_upgrade() {
//        page.waitForTimeout(2000);
//        page.locator("//span[text()='Start upgrade']").click();
//    }
//
//    @And("User corrects personal details and clicks on continue")
//    public void User_corrects_personal_details_and_clicks_on_continue() {
//        page.locator("//span[text()='Continue']").click();
//    }
//
//    @Then("User clicks on consent button and clicks on confirm and continue")
//    public void User_clicks_on_consent_button_and_clicks_on_confirm_and_continue() {
//        page.locator("//label[text()='Yes, I give my consent and get 500 miles.']").click();
//        page.locator("//span[text()='Confirm and activate']").click();
//    }


}






