import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.LoadState;

public class CodegenDemo2 {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            BrowserContext context = browser.newContext(new Browser.NewContextOptions()
                    .setHttpCredentials("u192312", "Lufthansa@123"));
            Page page = context.newPage();
            page.waitForLoadState();
            page.waitForLoadState(LoadState.LOAD);
            page.navigate("https://www.google.com/");
            page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Search")).click();
            page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Search")).fill("Playwright java");
            page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Search")).press("Enter");
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Installation | Playwright Java Playwright https://playwright.dev › java › docs › intro")).click();
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Assertions")).click();
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Guides")).click();


        }
    }
}

