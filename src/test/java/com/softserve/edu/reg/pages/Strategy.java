/*
package reg.pages;

import reg.apps.ApplicationSources;
import reg.apps.ApplicationSourcesRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

*/
/**
 * Created by ovo on 01.11.2016.
 *//*

public class Strategy {
    private interface IElement {
        Strategy getElement(Strategy strategy);
    }

    private static class XPAth implements Strategy.IElement {
        public Strategy getElement(Strategy strategy) {
            System.setProperty("",
                    strategy.applicationSources.getSearchStrategy());
            return new XPAth();
        }
    }

    private static class ID implements Strategy.IElement  {
        public Strategy getElement(Strategy strategy) {
            System.setProperty("webdriver.chrome.driver",
                    strategy.applicationSources.getDriverPath());
            return new  ID();
        }
    }

    private static class HtmlUnitTemporary implements Strategy.IElement {
        public WebDriver getBrowser(Strategy strategy) {
            WebDriver driver = null;
            return driver;
        }
    }

    public static enum Browsers {
        DEFAULT_STRATEGY("ChromeTemporary", new Application.ChromeTemporary()),
        FIREFOX_TEMPORARY("FireFoxTemporary", new Application.FirefoxTemporary()),
        CHROME_TEMPORARY("ChromeTemporary", new Application.ChromeTemporary()),
        HTMLUNIT_TEMPORARY("HtmlUnitTemporary", new Application.HtmlUnitTemporary());
        //
        private String browserName;
        private Application.IBrowser browser;

        private Browsers(String browserName, Application.IBrowser browser) {
            this.browserName = browserName;
            this.browser = browser;
        }

        public WebDriver runBrowser(Application application) {

            return browser.getBrowser(application);
        }

        @Override
        public String toString() {
            return browserName;
        }
    }

    // fields

    private static volatile Application instance;
    private WebDriver driver;
    private ApplicationSources applicationSources;

    private Strategy(ApplicationSources applicationSources) {
        this.applicationSources = applicationSources;
    }

    public static Application get() {
        return get(null);
    }

    public static Application get(ApplicationSources applicationSources) {
        if (instance == null) {
            synchronized (Application.class) {
                if (instance == null) {
                    if (applicationSources == null) {
                        applicationSources = ApplicationSourcesRepository.getDefault();
                    }
                    instance = new Application(applicationSources);
                    instance.init();
                }
            }
        }
        return instance;
    }
}
*/
