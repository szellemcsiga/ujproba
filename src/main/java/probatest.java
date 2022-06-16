import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class probatest {

WebDriver driver;

@Test
public void megint()
{
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    options.addArguments("--disable-dev-shm-usage");
    options.addArguments("--disable-notifications");
    options.addArguments("--disable-extensions");
    options.addArguments("--headless");
    options.addArguments("--window-size=1920,1080");
    options.addArguments("start-maximized");
    driver = new ChromeDriver(options);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().window().maximize();

    driver.navigate().to("https://teveclub.hu");
}

}



