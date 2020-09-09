package googlecloudtasks.test;

import googlecloudtasks.model.ComputeEngine;
import googlecloudtasks.page.GoogleCloudCalculatorEstimatedPage;
import googlecloudtasks.page.GoogleCloudPage;
import googlecloudtasks.service.ComputeEngineService;
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
            .calculateTask(new ComputeEngine());
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
            .calculateTask(new ComputeEngine())
            .sendEstimatedByEmail()
            .checkForEmail("1,082.77");
    Assert.assertTrue(calculatedPage, "Wrong estimated price in email!");
  }


}
