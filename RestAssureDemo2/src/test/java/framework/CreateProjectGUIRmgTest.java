package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.BaseClass;
import utility.IConstantPath;
import utility.WebDriverUtility;

public class CreateProjectGUIRmgTest extends BaseClass{
@Test
public void rmgApplication() {
webDriverutil.commonForAll("chrome","http://rmgtestingserver:8084");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
String username=IConstantPath.rmgUserName;
String password=IConstantPath.rmgPassword;

}
}
