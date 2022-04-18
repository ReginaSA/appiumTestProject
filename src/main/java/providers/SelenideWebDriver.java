package providers;

import static org.openqa.selenium.remote.CapabilityType.APPLICATION_NAME;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.springframework.boot.system.SystemProperties;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;

public class SelenideWebDriver implements WebDriverProvider {

  @Nonnull
  @Override
  public WebDriver createDriver(@Nonnull Capabilities capabilities) {

    UiAutomator2Options options = new UiAutomator2Options();
    options.merge(capabilities);
    options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
    options.setPlatformName("Android");
    options.setDeviceName("Nexus_S_API_30");
    options.setPlatformVersion("11.0");
    options.setCapability(APPLICATION_NAME, "Appium");

    options.setApp(SystemProperties.get("app.path"));
    options.setAppPackage("ru.otus.mobile.otus_mobile_qa");
    options.setAppActivity("ru.otus.mobile.otus_mobile_qa.MainActivity");

    try {
      return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }

    return null;
  }
}
