package googlecloudtasks.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleCloudCalculatorPage extends AbstractPage {

  public GoogleCloudCalculatorPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//div[@class='md-ripple-container']")
  private WebElement computeEngineButton;

  @FindBy(xpath = "//input[@id='input_60']")
  private WebElement inputInstances;

  @FindBy(id = "select_value_label_53")
  private WebElement operatingSystemSoftwareDropdown;

  @FindBy(xpath = "//md-option[@value='free']")
  private WebElement operatingSystemSoftwareOption;

  @FindBy(id = "select_value_label_54")
  private WebElement machineClassDropdown;

  @FindBy(xpath = "//md-text[@value='Regular']")
  private WebElement machineClassOption;

  @FindBy(id = "select_86")
  private WebElement instanceTypeDropdown;

  @FindBy(id = "select_option_236")
  private WebElement instanceTypeOption;

  @FindBy(xpath = "//md-checkbox[@ng-model='listingCtrl.computeServer.addGPUs']")
  private WebElement addGPUsCheckbox;



  public GoogleCloudCalculatorPage calculateTask() {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOf(inputInstances));
//    computeEngineButton.click();
    inputInstances.sendKeys("4");
    operatingSystemSoftwareDropdown.click();
    wait.until(ExpectedConditions.visibilityOf(operatingSystemSoftwareOption));
    operatingSystemSoftwareOption.click();
    machineClassDropdown.click();
    wait.until(ExpectedConditions.visibilityOf(machineClassOption));
    machineClassOption.click();
    instanceTypeDropdown.click();
    wait.until(ExpectedConditions.visibilityOf(instanceTypeOption));
    instanceTypeOption.click();
    addGPUsCheckbox.click();
    return this;
  }

  protected AbstractPage openPage() {
    return null;
  }
}
