import com.codeborne.selenide.SelenideElement;
import elements.mainPageElements;
import hooks.webHooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static steps.mainPageSteps.*;

public class XpathTest extends webHooks {
    @Test
    public void kotikiTest() {
        open("https://mail.ru");
        search();
        SelenideElement searchResults = $x("//div[contains(text(), 'Кошка')]");
        String searchResultsText = searchResults.getText();
        Assertions.assertTrue(searchResultsText.contains("Кошка"));
    }
    @Test
    public void OblakoTest() {
        open("https://mail.ru");
        mainPageElements.cElen.click();
        Assertions.assertTrue($x("//*[contains(text(), 'Добро пожаловать в Облако!')]").is(visible));
        cloud();
    }
    @Test
    public void PrivacyTest() {
        open("https://mail.ru");
        $x("//a[text()='Политика конфиденциальности']").click();
        privacy();
        Assertions.assertTrue($x("//h1[contains(text(),'Политика конфиденциальности сервисов Mail.ru')]").is(visible));
    }
}

