package Demos;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;



public class Selenium_Java {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        System.out.println(driver.getTitle());
        Actions ac = new Actions(driver);
        WebElement w = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(w);

        ac.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")),driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();






    }
}

