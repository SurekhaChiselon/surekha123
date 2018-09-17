package browsersdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ChromeDeo {

	public static void main(String[] args) {
    /*System.setProperty("webdriver.chrome.driver", "E:\\seliniumjarfolder\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://www.learn-automation.com");
    System.out.println(driver.getTitle());*/
		
	System.setProperty("webdriver.chrome.driver", "E:\\seliniumjarfolder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		System.out.println(driver.getTitle());
		/*driver.findElement(By.name("userName")).sendKeys("Sairam");
		driver.findElement(By.name("password")).sendKeys(""");
		driver.findElement(By.name("login")).click();*/
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("asfsf");
		driver.findElement(By.xpath("//input[@maxlength='60'][@name='lastName']")).sendKeys("zxcvbv");
		/*driver.findElement(By.name("phone")).sendKeys("9393903030");
		driver.findElement(By.name("userName")).sendKeys("sai@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("nizampet");
		driver.findElement(By.name("address2")).sendKeys("kukatpalli");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("500893");
		WebElement WE=driver.findElement(By.name("country"));
		Select s1 =new Select(WE);
		s1.selectByVisibleText("INDIA");
		driver.findElement(By.name("email")).sendKeys("Sairam");
		driver.findElement(By.name("password")).sendKeys("sai123");
		driver.findElement(By.name("confirmPassword")).sendKeys("sai123");
		driver.findElement(By.name("register")).click();
		*/
		
		
		
		
		
		//driver.close();
		
	}
	

}
