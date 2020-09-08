package googlecloudtasks.test;

import googlecloudtasks.page.GoogleCloudCalculatorPage;
import googlecloudtasks.page.GoogleCloudPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleCloudCalculatorTest {

  private WebDriver driver;

  @BeforeMethod(alwaysRun = true)
  public void browserSetup() {
    driver = new ChromeDriver();
  }

  @Test(description = "Hurt Me Plently")
  public void checkResultsPage() {
    boolean expectedPage = new GoogleCloudPage(driver)
            .openPage()
            .searchForInput("Google Cloud Platform Pricing Calculator")
            .checkPageOpenedSuccess("Google Cloud Platform Pricing Calculator")
            .searchForResult()
            .calculateTask()
            .checkEstimatedParameters();
    Assert.assertTrue(expectedPage, "Website wasn't opened correctly!");
  }


  @AfterMethod(alwaysRun = true)
  public void browserQuit() {
    driver.quit();
    driver = null;
  }

}
