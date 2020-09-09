package googlecloudtasks.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleCloudCalculatorPage extends AbstractPage {

  public GoogleCloudCalculatorPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//div[@class='tab-holder compute']")
  private WebElement computeEngineButton;

  @FindBy(xpath = "//input[@id='input_60']")
  private WebElement inputInstances;

  @FindBy(id = "select_value_label_53")
  private WebElement operatingSystemSoftwareDropdown;

  @FindBy(xpath = "//md-option[@value='free']")
  private WebElement operatingSystemSoftwareOption;

  @FindBy(id = "select_value_label_54")
  private WebElement machineClassDropdown;

  @FindBy(id = "select_option_75")
  private WebElement machineClassOption;

  @FindBy(id = "select_86")
  private WebElement instanceTypeDropdown;

  @FindBy(id = "select_option_236")
  private WebElement instanceTypeOption;

  @FindBy(xpath = "//md-checkbox[@ng-model='listingCtrl.computeServer.addGPUs']")
  private WebElement addGPUsCheckbox;

  @FindBy(id = "select_value_label_370")
  private WebElement numberOfGPUsDropdown;

  @FindBy(id = "select_option_377")
  private WebElement numberOfGPUsOption;

  @FindBy(id = "select_value_label_371")
  private WebElement GPUTypeDropdown;

  @FindBy(id = "select_option_384")
  private WebElement GPUTypeOption;

  @FindBy(id = "select_value_label_192")
  private WebElement localSSDDropdown;

  @FindBy(id = "select_option_257")
  private WebElement localSSDOption;

  @FindBy(id = "select_value_label_58")
  private WebElement datacenterLocationDropdown;

  @FindBy(id = "select_option_204")
  private WebElement datacenterLocationOption;

  @FindBy(id = "select_value_label_59")
  private WebElement committedUsageDropdown;

  @FindBy(id = "select_option_93")
  private WebElement committedUsageOption;

  @FindBy(xpath = "//button[@aria-label='Add to Estimate']")
  private WebElement addToEstimateButton;

  public GoogleCloudCalculatorEstimatedPage calculateTask() {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement frame = driver.findElement(By.xpath("//iframe[contains(@name,'goog')]"));
    driver.switchTo().frame(frame);
    driver.switchTo().frame("myFrame");
    wait.until(ExpectedConditions.visibilityOf(inputInstances));
    computeEngineButton.click();
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
    wait.until(ExpectedConditions.visibilityOf(numberOfGPUsDropdown));
    numberOfGPUsDropdown.click();
    wait.until(ExpectedConditions.visibilityOf(numberOfGPUsOption));
    numberOfGPUsOption.click();
    localSSDDropdown.click();
    wait.until(ExpectedConditions.visibilityOf(localSSDOption));
    localSSDOption.click();
    datacenterLocationDropdown.click();
    wait.until(ExpectedConditions.visibilityOf(datacenterLocationOption));
    datacenterLocationOption.click();
    committedUsageDropdown.click();
    wait.until(ExpectedConditions.visibilityOf(committedUsageOption));
    committedUsageOption.click();
    addToEstimateButton.click();
    return new GoogleCloudCalculatorEstimatedPage(driver);
  }

  protected AbstractPage openPage() {
    return null;
  }
}
