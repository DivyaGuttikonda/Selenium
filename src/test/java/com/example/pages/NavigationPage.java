package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationPage {
    private final By navigate = By.xpath("//span[@class=\"_logo-crm _logo-x96 zod-app-logo\"]");
    private final By navigatetoContacts = By.xpath("//a[@id=\"Visible_Contacts\"]");
    private final By contact = By.xpath("//lyte-yield[text()=\"Create a Contact\"]");

    WebDriver driver;

    public NavigationPage(WebDriver driver) {
        this.driver = driver;
    }


    public void navigateToCRM() {

        driver.findElement(navigate).click();
    }

    public void navigateToContactsPage() {

        driver.findElement(navigatetoContacts).click();
    }

}

