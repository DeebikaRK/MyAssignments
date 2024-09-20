package marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.messages.types.Duration;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement searchresult = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
		System.out.println(searchresult.getText());
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]")).click();
		driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']")).click();
		driver.findElement(By.xpath("//a[@id='s-result-sort-select_4']")).click();
		WebElement productdetail = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
		System.out.println(productdetail.getText());
		System.out.println(driver.getTitle());
		driver.close();
		
			}

}

