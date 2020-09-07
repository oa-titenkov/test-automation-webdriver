import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class HelloWebDriver {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumhq.org");

        WebElement searchBtn = driver.findElement(By.xpath("//*[@id='navbar']/a[5]"));
        searchBtn.click();

        List<WebElement> searchInput = driver.findElements(By.id("gsc-i-id3"));

        searchInput.get(0).sendKeys("LULW");
        Thread.sleep(5000);
        driver.quit();
    }
}
