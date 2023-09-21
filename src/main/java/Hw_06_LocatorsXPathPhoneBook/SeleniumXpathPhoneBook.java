package Hw_06_LocatorsXPathPhoneBook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumXpathPhoneBook {

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

        WebElement tagName = driver.findElement(By.xpath("//h2"));
        System.out.println("tagName: " + tagName.getText());

        WebElement tagName_2 = driver.findElement(By.xpath("//div//h2"));
        System.out.println("tagName_2: " + tagName_2.getText());
    }

    @Test
    public void findElementByClassName() {

        WebElement className = driver.findElement(By.xpath("//*[@class='active']"));
        System.out.println("className: " + className.getText());

        WebElement className_2 = driver.findElement(By.xpath("//*[contains(@class, 'ac')]"));
        System.out.println("className_2: " + className_2.getText());
    }

    @Test
    public void findElementById() {

        WebElement idValue = driver.findElement(By.xpath("//*[@id='root' and contains(@class, 'container')]"));
        System.out.println("idValue: " + idValue.getAttribute("class"));
    }

    @Test
    public void findElementByAttribute() {

        WebElement attribute = driver.findElement(By.xpath("//*[@href='/home']"));
        System.out.println("attribute: " + attribute.getText());
    }

    @Test
    public void findElementByText() {

        WebElement text = driver.findElement(By.xpath("//*[text()='HOME']"));
        System.out.println("text: " + text.getText());

        WebElement text_2 = driver.findElement(By.xpath("//*[contains(text(), 'HOME')]"));
        System.out.println("text_2: " + text_2.getText());
    }

    @Test
    public void findElementBySiblings() {

        WebElement sibling = driver.findElement(By.xpath("//h1/following-sibling::h2"));
        System.out.println("sibling: " + sibling.getText());
    }

    @Test
    public void findElementByParents() {

        WebElement parent = driver.findElement(By.xpath("//h2/../.."));
        System.out.println("parent: " + parent.getAttribute("style"));
    }

    @AfterClass
    public void postConditions() {

        driver.quit();
    }
}
