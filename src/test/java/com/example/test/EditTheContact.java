package com.example.test;

import com.example.pages.ContactsPage;
import com.example.pages.LoginPage;
import com.example.pages.NavigationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditTheContact {
    @Test

    public void editContact() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginIntoApplication();

        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.navigateToCRM();
        navigationPage.navigateToContactsPage();

        ContactsPage contactsPage = new ContactsPage(driver);
        contactsPage.contact();
        contactsPage.editTheContact();
        contactsPage.enterTitle();
        contactsPage.save();

    }

}
