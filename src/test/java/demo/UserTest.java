package demo;

import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
    $(By.xpath("(//android.widget.CheckBox[@content-desc='users'])[1]")).click();
//    $(By.xpath("//android.view.View[@content-desc='USER ID: 1 USER NAME: name USER GRADE: grade USER CITY: City USER SCHOOL NAME: Some school'")).shouldBe(Condition.text("1"));

  }


}
