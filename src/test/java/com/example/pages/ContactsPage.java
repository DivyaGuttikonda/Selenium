package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class ContactsPage {
    WebDriver driver;

    public ContactsPage(WebDriver driver) {
        this.driver = driver;
    }

    private static final By buttoncreate = By.xpath("//button[text()=\"Create Contact\"]");
    public final By txtFname = By.xpath("//input[@id=\"Crm_Contacts_FIRSTNAME_LInput\"]");
    public final By txtLname = By.xpath("//input[@id=\"Crm_Contacts_LASTNAME_LInput\"]");
    private final By txtEmail = By.xpath("//input[@id=\"Crm_Contacts_EMAIL_LInput\"]");
    public final By txtNumber = By.xpath("//input[@id=\"Crm_Contacts_PHONE_LInput\"]");
    public final By savebtn = By.xpath("//lyte-yield[text()='Save']");


    public ContactsPage clickOnCreateButton() {
        driver.findElement(buttoncreate).click();
        return this;
    }

    public void ValidatingDetails(String firstName, String lastName) {
        driver.findElement(txtFname).sendKeys("Divya");
        driver.findElement(txtLname).sendKeys("Guttikonda");
        //driver.findElement(txtEmail).sendKeys("divyaguttikonda24@gmail.com");
    }

    public void entermail() {
        driver.findElement(txtEmail).sendKeys("divyaguttikonda24@gmail.com");
    }

    public void enterNumber() {
        driver.findElement(txtNumber).sendKeys("8545907843");
    }

    public void save() {
        driver.findElement(savebtn).click();
    }

}
