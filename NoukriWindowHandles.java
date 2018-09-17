package class_demo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NoukriWindowHandles {

	public static void main(String[] args) {
     WebDriver driver = new FirefoxDriver();
     driver.get("https://www.naukri.com/");
     String parent = driver.getWindowHandle();
     System.out.println("parent window is "+parent);
 	List<String> WH =  new ArrayList<>(driver.getWindowHandles());
 	int count = WH.size();
 	System.out.println("No of windows "+count);
 	driver.switchTo().window(WH.get(1));
 	driver.close();
 	driver.switchTo().window(WH.get(2)).getCurrentUrl();
 	driver.quit();
	}

}
