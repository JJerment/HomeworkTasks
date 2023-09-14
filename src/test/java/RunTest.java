import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class RunTest {
    @Test
    public void someTest(){
        open("https://demoqa.com/automation-practice-form");
        int a = 10;
        int b = 10;
        int c = 1;
        int sum = a+b+c;
        Assertions.assertTrue(sum==15);
    }
}
