package SampleTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class SampleDemo {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("selenium");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File("C:\\Users\\win-10\\IdeaProjects\\Test\\Screenshots\\test.png"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.quit();
    }
}
