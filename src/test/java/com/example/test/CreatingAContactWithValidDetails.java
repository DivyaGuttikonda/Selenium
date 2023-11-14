package com.example.test;

import com.example.pages.ContactsPage;
import com.example.pages.LoginPage;
import com.example.pages.NavigationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.HashMap;

public class CreatingAContactWithValidDetails {
    @Test
    public void createbutton() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginIntoApplication();

        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.navigateToCRM();
        navigationPage.navigateToContactsPage();
        Thread.sleep(5000);

        ContactsPage contactsPage = new ContactsPage(driver);
        contactsPage.clickOnCreateButton();
        Thread.sleep(5000);
        contactsPage.ValidatingDetails("firstName", "lastName");
        contactsPage.entermail();
        Thread.sleep(3000);
        contactsPage.enterNumber();
        contactsPage.save();
        driver.quit();
    }
}
