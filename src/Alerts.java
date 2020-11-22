import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harish\\Desktop\\Selenium course\\Needed Softwares\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("Harish");
		driver.findElement(By.id("alertbtn")).click();
		//driver.switchTo().alert().accept();
		System.out.println("test1");
		System.out.println("test2");
		System.out.println("test3");
		System.out.println("test3");
		//driver.findElement(By.id("name")).sendKeys("Harish");
		//driver.findElement(By.id("confirmbtn")).click();
		//driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		System.out.println(driver.switchTo().alert().getText());

		

		
	}

}
