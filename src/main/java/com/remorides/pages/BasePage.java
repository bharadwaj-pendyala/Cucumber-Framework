package com.remorides.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

	protected WebDriver driver;

	String baseURL = "https://www.google.com";

	public void loginAUT() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "src\\main\\java\\com\\remoride\\utilities\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
	}

}
