package demo;

import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import providers.SelenideWebDriver;

public class UserTest {

  @BeforeAll
  public static void config() {
    closeWebDriver();
    Configuration.browserSize = null;
    Configuration.browser = SelenideWebDriver.class.getName();

    Selenide.open();
  }

  @Test
  public void firstTest() {

    $(By.xpath("(//android.widget.CheckBox[@content-desc='users'])[3]")).click();
//    $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]"))
//            .shouldHave(Condition.value("USER ID: 2"));

  }

  @AfterAll
  public static void closeDriver() {
    closeWebDriver();
  }
}
