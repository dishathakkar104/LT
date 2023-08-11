import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

@Listeners(Listner.class)
public class teat {
	WebDriver driver =new ChromeDriver();

  @Test
  public void f() {
	  
	  
	  
	  driver.get("https://www.google.com/");
	  WebElement element= driver.findElement(By.id("APjFqb"));
	  element.sendKeys("youtube");
	  WebElement Dropdownelement=driver.findElement(By.className("pcTkSc"));
	  Select dropdown =new Select(Dropdownelement);
	  dropdown.selectByVisibleText("Option 2");
	  WebElement selectedOption = dropdown.getFirstSelectedOption();
      System.out.println("Selected option: " + selectedOption.getText());
	  
	//  String result= driver.getTitle();
	//  Assert.assertEquals(driver.getTitle(),result );
  }
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PALLAV THAKKAR\\Desktop\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  System.out.println("Done");
  }

}
