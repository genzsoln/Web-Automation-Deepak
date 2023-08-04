import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.LoadState;

import java.util.regex.Pattern;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CodeGeneratorDemo {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            BrowserContext context = browser.newContext(new Browser.NewContextOptions()
                    .setHttpCredentials("u192312", "Lufthansa@123"));
            Page page = context.newPage();
            page.waitForLoadState();
            page.waitForLoadState(LoadState.LOAD);

            page.navigate("https://www.wikipedia.org/");
            page.getByLabel("Search Wikipedia").click();
            page.getByLabel("Search Wikipedia").fill("playwright");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Search")).click();
            page.getByRole(AriaRole.LIST, new Page.GetByRoleOptions().setName("Early playwrights")).click();
            assertThat(page).hasTitle(Pattern.compile("Playwright"));
        }
    }
}
