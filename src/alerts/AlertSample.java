package alerts;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertSample {

	private static final long SHORT_WAIT = 5;
	private static final long LONG_WAIT = 15;

	public static void main(String[] args) {
		//first, start WebDriver
		WebDriver driver = new ChromeDriver();
		//setup waits
		driver.manage().timeouts().implicitlyWait(SHORT_WAIT, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, LONG_WAIT);
		//next, get the path to the html file
		Path currentRelativePath = Paths.get("");
		String currentPath = currentRelativePath.toAbsolutePath().toString() + File.separator + "html" + File.separator;
		driver.get("file:///"+ currentPath + "index.html");
		
		//Get the first alert
		Alert welcome = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(welcome.getText());
		welcome.dismiss();
		
		//Get the first question alert
		Alert questionalert = wait.until(ExpectedConditions.alertIsPresent());
		questionalert.sendKeys("Clark Kent");
		questionalert.accept();
		
		//Get the first question result alert
		Alert questionResult = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(questionResult.getText());
		questionResult.accept();
		
		//Get the second question alert
		questionalert = wait.until(ExpectedConditions.alertIsPresent());
		questionalert.sendKeys("Diana Prince");
		questionalert.accept();
		
		//Get the second question result alert
		questionResult = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(questionResult.getText());
		questionResult.accept();
		
		//Get the third question alert
		questionalert = wait.until(ExpectedConditions.alertIsPresent());
		questionalert.sendKeys("Bruce Wayne");
		questionalert.accept();
		
		//Get the third question result alert
		questionResult = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(questionResult.getText());
		questionResult.accept();
		
		//Get the total score alert
		Alert totalScore = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(totalScore.getText());
		totalScore.accept();
		
		//Make sure main page is loaded
		WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
		String headerText = header.getText();
		if(headerText != null && headerText.equals("Quiz Ninja!")) {
			System.out.println("Page loaded correctly!");
		}		
	}
}
