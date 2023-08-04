import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.util.*;

public class LoginDemo {
        public static void main(String[] args) {
            try (Playwright playwright = Playwright.create()) {
                Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                        .setHeadless(false));
                BrowserContext context = browser.newContext();
                Page page = context.newPage();
                page.navigate("https://www.lufthansa.com/de/en/homepage");
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Agree").setExact(true)).click();
                page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Login")).click();
                page.getByLabel("Email address", new Page.GetByLabelOptions().setExact(true)).click();
                page.getByLabel("Email address", new Page.GetByLabelOptions().setExact(true)).fill("red025@yopmail.com");
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next")).click();
                page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("Test@123");
//                page.getByText("back You are not authorised to access this page Continue here: to home page Logi").click();
//                page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).press("ArrowDown");
                page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).press("ArrowDown");
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log in")).click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Jacob TestuserPDT")).click();
                page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("My Account")).click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Jacob TestuserPDT")).click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Logout")).click();
                page.navigate("https://www.lufthansa.com/de/en/homepage");
            }
        }
    }


