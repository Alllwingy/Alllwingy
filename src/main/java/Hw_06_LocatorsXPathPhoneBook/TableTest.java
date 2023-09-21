package Hw_06_LocatorsXPathPhoneBook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableTest {

    WebDriver driver;

    @BeforeClass
    public void preConditions() {

        driver = new ChromeDriver();
        driver.navigate().to("https://www.w3schools.com/css/css_table.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testTables() {

        List<WebElement> amountOfTableRows = driver.findElements(By.xpath("//*[@id='customers']//tr"));
        System.out.println("amount of table rows: " + amountOfTableRows.size());

        List<WebElement> amountOfTableColumns = driver.findElements(By.xpath("//*[@id='customers']//tr[2]/td"));
        System.out.println("amount of table columns: " + amountOfTableColumns.size());

        WebElement locatorForTheRow3 = driver.findElement(By.xpath("//*[@id='customers']//tr[3]/td[1]"));
        System.out.println("locator for the row 3: " + locatorForTheRow3.getText());

        WebElement locatorForTheLastColumn = driver.findElement(By.xpath("//*[@id='customers']//tr[2]/td[last()]"));
        System.out.println("locator for the last column: " + locatorForTheLastColumn.getText());
    }

    @AfterClass
    public void postConditions() {

        driver.quit();
    }
}
