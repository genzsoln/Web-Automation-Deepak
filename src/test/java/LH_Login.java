import com.microsoft.playwright.*;
import com.microsoft.playwright.options.LoadState;

public class LH_Login {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//            BrowserContext context = browser.newContext(new Browser.NewContextOptions()
//                    .setHttpCredentials("u192312", "Lufthansa@123"));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();
            page.waitForLoadState();
            page.waitForLoadState(LoadState.LOAD);
            page.navigate("https://www.lufthansa.com/de/en/homepage");
            page.waitForLoadState();
            page.locator("//button[@id='cm-acceptAll']").click();
            page.locator("//span[@class='ml-2' and text()='Login']").click();


            page.waitForTimeout(3000);
        }
    }
}
