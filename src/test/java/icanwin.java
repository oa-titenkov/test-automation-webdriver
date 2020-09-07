import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class icanwin {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://pastebin.com");

        WebElement textArea = driver.findElement(By.id("postform-text"));
        WebElement pasteExpirationContainer = driver.findElement(By.id("select2-postform-expiration-container"));
        textArea.sendKeys("Hello from WebDriver");
        WebElement pasteName = driver.findElement(By.id("postform-name"));
        pasteName.sendKeys("helloweb");
        pasteExpirationContainer.click();
        Actions focusOnDropDown = new Actions(driver).moveToElement(pasteExpirationContainer);
        focusOnDropDown.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        WebElement createNewPasteButton = driver.findElement(By.xpath("//button[text()='Create New Paste']"));
        createNewPasteButton.click();
        driver.quit();
    }
}
