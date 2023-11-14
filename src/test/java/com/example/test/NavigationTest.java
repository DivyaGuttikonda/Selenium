package com.example.test;

import com.example.pages.LoginPage;
import com.example.pages.NavigationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationTest {
    @Test
    public void navigate() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginIntoApplication();

        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.navigateToCRM();
        navigationPage.navigateToContactsPage();
        Thread.sleep(3000);
        driver.quit();

    }

}

