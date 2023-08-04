import com.microsoft.playwright.*;
import com.microsoft.playwright.options.LoadState;

import java.util.regex.Pattern;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class GoogleAutoDemo {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            BrowserContext context = browser.newContext(new Browser.NewContextOptions()
                    .setHttpCredentials("u192312", "Lufthansa@123"));
            Page page = context.newPage();
            page.waitForLoadState();
            page.waitForLoadState(LoadState.LOAD);
            page.navigate("https://www.google.com/");
            Locator ele = page.locator("//textarea[@class=\"gLFyf\"]");
            if(ele.isVisible()){
                System.out.println("Element is visible : "+ ele);
                ele.click();
                ele.fill("Playwright java");
            }


            ele.press("Enter");
            page.waitForTimeout(3000);
            assertThat(page).hasTitle(Pattern.compile("Playwright java"));
        }
    }
}

