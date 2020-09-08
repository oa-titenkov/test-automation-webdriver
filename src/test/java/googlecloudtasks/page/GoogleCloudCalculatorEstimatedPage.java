package googlecloudtasks.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GoogleCloudCalculatorEstimatedPage extends AbstractPage {

    public GoogleCloudCalculatorEstimatedPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//md-card-content[@id='resultBlock']//div[@class='md-list-item-text ng-binding']")
    private List<WebElement> results;

    @FindBy(xpath = "//md-card-content[@id='resultBlock']//b[@class='ng-binding']")
    private WebElement estimatedCost;

    public boolean checkEstimatedParameters() {
        if(!results.get(1).getText().contains("regular")) return false;
        else if(!results.get(2).getText().contains("n1-standard-8")) return false;
        else if(!results.get(3).getText().contains("Frankfurt")) return false;
        else if(!results.get(4).getText().contains("2x375 GiB")) return false;
        else if(!results.get(5).getText().contains("1 Year")) return false;
        else return estimatedCost.getText().contains("1,082.77");
    }


    @Override
    protected AbstractPage openPage() {
        return null;
    }
}
