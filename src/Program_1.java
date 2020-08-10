import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		/*String key="webdriver.gecko.driver";
		String value="./Drivers/geckodriver.exe";*/
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		
		System.setProperty(key, value);
		
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");
		System.out.println("Google page opened!!!");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("time");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
		driver.findElement(By.xpath("//h2[text()='Local Time']/parent::div[1]/div[1]/div[1][@class='gsrt vk_bk dDoNo XcVN5d']"));
		System.out.println("Time identified");
		
		driver.close();
	}

}
