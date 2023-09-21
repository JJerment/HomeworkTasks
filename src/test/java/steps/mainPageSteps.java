package steps;

import com.codeborne.selenide.SelenideElement;
import elements.mainPageElements;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

import java.time.Duration;

public class mainPageSteps extends mainPageElements {

    public static void search() {
        SelenideElement searchInput = $x("//input[@name='text']");
        searchInput.sendKeys("котики");
        mainPageElements.aElen.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    public static void privacy() {
        mainPageElements.bElen.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    public static void cloud() {
        mainPageElements.cElen.shouldBe(visible, Duration.ofSeconds(30)).click();
    }
}
