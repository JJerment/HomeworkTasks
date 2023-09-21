package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class mainPageElements {

    public static SelenideElement aElen = $x("//button[text()='Найти']");
    public static SelenideElement bElen = $x("//a[text()='Политика конфиденциальности']/following-sibling::a");
    public static SelenideElement cElen = $x("//a[@title='Облако']");

}
