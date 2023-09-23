package Hw_05_LocatorsCSSPhoneBook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LocatorsSeleniumStartPhonebook {

    WebDriver driver;

    @BeforeClass
    public void preConditions() {

        driver = new ChromeDriver();
        driver.navigate().to("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void findElementByTagName() {

        WebElement tagName = driver.findElement(By.cssSelector("h2"));
        System.out.println("tagName: " + tagName.getText());

        WebElement tagName_2 = driver.findElement(By.tagName("h2"));
        System.out.println("tagName_2: " + tagName_2.getText());
    }

    @Test
    public void findElementByClassName() {

        WebElement className = driver.findElement(By.cssSelector(".container"));
        System.out.println("className: " + className.getAttribute("id"));

        WebElement className_2 = driver.findElement(By.className("container"));
        System.out.println("className_2: " + className_2.getAttribute("id"));

        WebElement className_3 = driver.findElement(By.cssSelector("div.container"));
        System.out.println("className_3: " + className_3.getAttribute("id"));
    }

    @Test
    public void findElementById() {

        WebElement idValue = driver.findElement(By.cssSelector("#root"));
        System.out.println("idValue: " + idValue.getAttribute("class"));

        WebElement idValue_2 = driver.findElement(By.id("root"));
        System.out.println("idValue_2: " + idValue_2.getAttribute("class"));
    }

    @Test
    public void findElementByAttribute() {

        WebElement attribute = driver.findElement(By.cssSelector("[class='container']"));
        System.out.println("attribute: " + attribute.getAttribute("class"));
    }

    @Test
    public void findElementByLinkText() {

        WebElement linkText = driver.findElement(By.linkText("HOME"));
        System.out.println("linkText: " + linkText.getAttribute("href"));

        WebElement linkText_02 = driver.findElement(By.partialLinkText("HO"));
        System.out.println("linkText_02: " + linkText_02.getAttribute("href"));
    }

    @AfterClass
    public void postConditions() {

        driver.quit();
    }
}
