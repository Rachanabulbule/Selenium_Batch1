package org.qsp.SeleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
	}

}
