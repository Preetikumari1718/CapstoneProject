package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice2 {
	@Test
	public void samsungGalS6() throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		wd.get("https://www.demoblaze.com/");
		Thread.sleep(3);
		
		wd.manage().window().maximize();
		
		wd.findElement(By.linkText("Samsung galaxy s6")).click();
		WebElement a1 = wd.findElement(By.xpath("//*[@id=\"tbodyid\"]/h2"));
		System.out.println("Mobile Name : "+a1.getText());
		WebElement a2 = wd.findElement(By.xpath("//*[@id=\"tbodyid\"]/h3"));
		System.out.println("Price : "+a2.getText());
		WebElement a3 = wd.findElement(By.xpath("//*[@id=\"more-information\"]/p"));
		System.out.println("Product Description : "+a3.getText());
		System.out.println("---------------------------------------------------------------------------------");
		}
	
		@Test
		public void nokialumia1520()throws InterruptedException {
			WebDriver wd = new ChromeDriver();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			wd.get("https://www.demoblaze.com/");
			Thread.sleep(3);
			
			wd.manage().window().maximize();
			
			wd.findElement(By.linkText("Nokia lumia 1520")).click();
			WebElement a1 = wd.findElement(By.xpath("//*[@id=\"tbodyid\"]/h2"));
			System.out.println("Mobile Name : "+a1.getText());
			WebElement a2 = wd.findElement(By.xpath("//*[@id=\"tbodyid\"]/h3"));
			System.out.println("Price : "+a2.getText());
			WebElement a3 = wd.findElement(By.xpath("//*[@id=\"more-information\"]/p"));
			System.out.println("Product Description : "+a3.getText());
			System.out.println("---------------------------------------------------------------------------------");
		}
		@Test
		public void nexux6()throws InterruptedException {
			WebDriver wd = new ChromeDriver();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			wd.get("https://www.demoblaze.com/");
			Thread.sleep(3);
			
			wd.manage().window().maximize();
			
			wd.findElement(By.linkText("Nexus 6")).click();
			WebElement a1 = wd.findElement(By.xpath("//*[@id=\"tbodyid\"]/h2"));
			System.out.println("Mobile Name : "+a1.getText());
			WebElement a2 = wd.findElement(By.xpath("//*[@id=\"tbodyid\"]/h3"));
			System.out.println("Price : "+a2.getText());
			WebElement a3 = wd.findElement(By.xpath("//*[@id=\"more-information\"]/p"));
			System.out.println("Product Description : "+a3.getText());
			System.out.println("---------------------------------------------------------------------------------");
		}
			
			
		@Test
		public void iphone632gb()throws InterruptedException {
			WebDriver wd = new ChromeDriver();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			wd.get("https://www.demoblaze.com/");
			Thread.sleep(3);
			
			wd.manage().window().maximize();
			
			wd.findElement(By.linkText("Iphone 6 32gb")).click();
			WebElement a1 = wd.findElement(By.xpath("//*[@id=\"tbodyid\"]/h2"));
			System.out.println("Mobile Name : "+a1.getText());
			WebElement a2 = wd.findElement(By.xpath("//*[@id=\"tbodyid\"]/h3"));
			System.out.println("Price : "+a2.getText());
			WebElement a3 = wd.findElement(By.xpath("//*[@id=\"more-information\"]/p"));
			System.out.println("Product Description : "+a3.getText());
			System.out.println("---------------------------------------------------------------------------------");
		}	
			
		@Test
		public void samsunggal7()throws InterruptedException {
			WebDriver wd = new ChromeDriver();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			wd.get("https://www.demoblaze.com/");
			Thread.sleep(3);
			
			wd.manage().window().maximize();
			
			wd.findElement(By.linkText("Samsung galaxy s7")).click();
			WebElement a1 = wd.findElement(By.xpath("//*[@id=\"tbodyid\"]/h2"));
			System.out.println("Mobile Name : "+a1.getText());
			WebElement a2 = wd.findElement(By.xpath("//*[@id=\"tbodyid\"]/h3"));
			System.out.println("Price : "+a2.getText());
			WebElement a3 = wd.findElement(By.xpath("//*[@id=\"more-information\"]/p"));
			System.out.println("Product Description : "+a3.getText());
			System.out.println("---------------------------------------------------------------------------------");
		}	
		
		
		
		

}

