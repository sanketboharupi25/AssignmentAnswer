import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public void s1(int a) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver2=new ChromeDriver(opt);
		driver2.get("https://www.youtube.com/");
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebDriverWait wait1=new WebDriverWait(driver2,Duration.ofSeconds(20));
		WebElement SongFirst1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//yt-formatted-string[@id='video-title'])[1]")));
		SongFirst1.click();
		
		WebDriverWait wait2=new WebDriverWait(driver2,Duration.ofSeconds(20));
		WebElement SongFirst2=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']")));
		SongFirst2.click();
		Thread.sleep(3000);
		driver2.close();
		
	}
	public void s2(int a,int b) throws InterruptedException {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	WebDriverManager.chromedriver().setup();
	WebDriver driver1=new ChromeDriver(opt);
	driver1.get("https://www.youtube.com/");
	driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebDriverWait wait1=new WebDriverWait(driver1,Duration.ofSeconds(20));
	WebElement SongSecond1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//yt-formatted-string[@id='video-title'])[1]")));
	SongSecond1.click();
	
	WebDriverWait wait2=new WebDriverWait(driver1,Duration.ofSeconds(20));
	WebElement SongSecond2=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']")));
	SongSecond2.click();
	Thread.sleep(5000);
	driver1.close();
	}
	public void s3(int a,int b,int c) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement SongThird1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//yt-formatted-string[@id='video-title']")));
		SongThird1.click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement SongThird2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']")));
		SongThird2.click();
		Thread.sleep(3000);
		driver.close();  
	   
	}
	
}
