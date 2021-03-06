// Generated by Selenium IDE
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;

/*
 * Testira se brisanje podataka. Podrazumijevano, lista je prazna prije pokretanja testa. 
 * Tokom testa se doda novi student, zatim obrise i na kraju provjeri da li je lista opet prazna.
 */

public class BrisanjeTest {
  private WebDriver driver;
  JavascriptExecutor js;
  @BeforeEach
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    new HashMap<String, Object>();
  }
  @AfterEach
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void brisanje() {
    driver.get("http://localhost:4200/");
    driver.manage().window().setSize(new Dimension(1004, 708));
    driver.findElement(By.linkText("Add Student")).click();
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
    driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("Tatjana");
    driver.findElement(By.cssSelector(".ng-invalid:nth-child(2)")).click();
    driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[2]/input")).sendKeys("tanja@mail.com");
    driver.findElement(By.cssSelector(".ng-untouched")).click();
    {
      WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
      dropdown.findElement(By.xpath("//option[. = 'BCA']")).click();
    }
    driver.findElement(By.cssSelector(".ng-untouched")).click();
    driver.findElement(By.cssSelector(".btn-success")).click();
    driver.findElement(By.linkText("View Student")).click();
    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/table/tbody/tr/td[4]/button[1]/i")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("strong"));
      assert(elements.size() > 0);
    }
    driver.get("http://localhost:4200/");
    {
      List<WebElement> elements = driver.findElements(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/table/tbody/tr/td[4]/button[1]/i"));
      assert(elements.size() > 0);
    }
    driver.close();
  }
}
