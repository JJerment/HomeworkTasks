package hooks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webHooks {
    private WebDriver driver;

    @BeforeEach
    public void Start() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void End() {
        if (driver != null) {
            driver.quit();
        }
    }
}
