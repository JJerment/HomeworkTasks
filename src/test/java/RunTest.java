import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class RunTest {
    @Before
    public void setUp() {
        System.out.println("Before test");
    }
    @After
    public void tearDown() {
        System.out.println("After test");
    }
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
