package softwaretest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelector extends Utils {
    softwaretest.LoadProp loadProp = new softwaretest.LoadProp();

    public void setUpBrowser() {
        String browser = loadProp.getProperty("browser");
        //String setUpBrowser=System.getProperty("setUpBrowser");
        if (browser.equalsIgnoreCase("firefox")) {
            // FirefoxOptions options = new FirefoxOptions();
            // options.setBinary("");
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kavis 101\\IdeaProjects\\nopCommerceDemo\\src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
            System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
            driver = new FirefoxDriver();
            driver.manage().window().fullscreen();

        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavis 101\\IdeaProjects\\nopCommerceDemo\\src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-infobars");
            options.addArguments("--disable-extensions");
            options.addArguments("--disable-setUpBrowser-side-navigation");
            options.addArguments("--incognito");
            options.addArguments("--disable-blink-features=BlockCredentialedSubresources");
            driver = new ChromeDriver(options);
            driver.manage().window().fullscreen();
        } else if (browser.equalsIgnoreCase("ie")) {

//            System.setProperty("webdriver.ie.driver", "src/test/Resources/BrowserDriver/IEDriverServer.exe");
//           InternetExplorerOptions options = new InternetExplorerOptions();
//            options.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
//            options.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
//            driver = new InternetExplorerDriver(options);
//            driver.manage().window().maximize();
        } else {
            System.out.println("Browser name is empty or typed wrong:" + browser);

        }

    }
}