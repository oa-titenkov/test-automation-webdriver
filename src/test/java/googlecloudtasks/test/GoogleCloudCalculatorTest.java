package googlecloudtasks.test;

import googlecloudtasks.page.GoogleCloudCalculatorEstimatedPage;
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
    driver.manage().window().maximize();
  }

  @Test(description = "Hurt Me Plenty")
  public void checkResultsPage() {
    GoogleCloudCalculatorEstimatedPage calculatedPage = new GoogleCloudPage(driver)
            .openPage()
            .searchForInput("Google Cloud Platform Pricing Calculator")
            .checkPageOpenedSuccess("Google Cloud Platform Pricing Calculator")
            .searchForResult()
            .calculateTask();
    Assert.assertTrue(calculatedPage.checkEstimatedParameters(), "Wrong parameters!");
    Assert.assertTrue(calculatedPage.checkEstimatedPrice("1,082.77"), "Estimated price is wrong!");
  }

  @Test(description = "Hardcore")
  public void checkResultsPageWithEmail() {
    boolean calculatedPage = new GoogleCloudPage(driver)
            .openPage()
            .searchForInput("Google Cloud Platform Pricing Calculator")
            .checkPageOpenedSuccess("Google Cloud Platform Pricing Calculator")
            .searchForResult()
            .calculateTask()
            .sendEstimatedByEmail()
            .checkForEmail("1,082.77");
    Assert.assertTrue(calculatedPage, "Wrong estimated price in email!");
  }


  @AfterMethod(alwaysRun = true)
  public void browserQuit() {
    driver.quit();
    driver = null;
  }

}
