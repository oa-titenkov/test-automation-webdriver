package googlecloudtasks.test;

import googlecloudtasks.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonConditions {

  protected WebDriver driver;

  @BeforeMethod(alwaysRun = true)
  public void browserSetup() {
    driver = DriverSingleton.getDriver();
  }

  @AfterMethod(alwaysRun = true)
  public void browserQuit() {
    DriverSingleton.closeDriver();
  }

}
