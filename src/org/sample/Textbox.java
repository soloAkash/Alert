package org.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKASH\\eclipse-workspace\\Alert\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement btnclick = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		btnclick.click();
		
		WebElement btnclick2 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		btnclick2.click();
		
		
		
		Alert s = driver.switchTo().alert();
		String text =s.getText();
			System.out.println("happy birthday logesh ");
		s.sendKeys("happy bithday logesh ");
		s.accept();
   }
	
}
