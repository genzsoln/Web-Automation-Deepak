import com.microsoft.playwright.*;
import com.microsoft.playwright.options.LoadState;

import java.nio.file.Paths;
import java.util.regex.Pattern;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.regex.Pattern;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.LoadState;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
public class TraceViewerDemo {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            BrowserContext context = browser.newContext(new Browser.NewContextOptions()
                    .setHttpCredentials("u192312", "Lufthansa@123"));
            context.tracing().start(new Tracing.StartOptions()
                    .setScreenshots(true)
                    .setSnapshots(true)
                    .setSources(true));
            Page page = context.newPage();
            page.waitForLoadState();
            page.waitForLoadState(LoadState.LOAD);

            page.navigate("http://playwright.dev");

            // Expect a title "to contain" a substring.
            assertThat(page).hasTitle(Pattern.compile("Playwright"));
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("GET STARTED")).click();

            context.tracing().stop(new Tracing.StopOptions()
                    .setPath(Paths.get("trace.zip")));


        }
    }
}
