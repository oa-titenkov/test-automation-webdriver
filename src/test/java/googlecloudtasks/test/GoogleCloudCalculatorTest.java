package googlecloudtasks.test;

import googlecloudtasks.page.GoogleCloudCalculatorEstimatedPage;
import googlecloudtasks.page.GoogleCloudPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleCloudCalculatorTest extends CommonConditions {

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


}
