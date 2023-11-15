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
    private final By txtFname = By.xpath("//input[@id=\"Crm_Contacts_FIRSTNAME_LInput\"]");
    private final By txtLname = By.xpath("//input[@id='Crm_Contacts_LASTNAME_LInput']");
    private final By txtEmail = By.xpath("//input[@id='Crm_Contacts_EMAIL_LInput']");
    private final By txtNumber = By.xpath("//input[@id='Crm_Contacts_PHONE_LInput']//parent::div");
    private final By savebtn = By.xpath("//lyte-yield[text()='Save']");
    private final By dropDownLabel = By.xpath("//div[text()=\"Lead Source\"]");
    private final By dropdownvalue = By.xpath("//span[text()=\"Employee Referral\"]");
    private final By txtContact = By.xpath("//lyte-text[text()=\"Divya Guttikonda\"]");
    private final By txtEdit = By.xpath("//lyte-yield[text()=\"Edit\"]");
    private final By txtTitle = By.xpath("//input[@id=\"Crm_Contacts_TITLE_LInput\"]");
    private final By txtbutton = By.xpath("//button[@class=\"lyte-button dv_moreBtn  lyteDefaultBtn\"]");
    private final By deleteBtn = By.xpath("//lyte-menu-item[text()=\"Delete\"]");
    private final By popupOperation = By.xpath("//button[@type=\"accept\"]");



    public ContactsPage clickOnCreateButton() {
        driver.findElement(buttoncreate).click();
        return this;
    }

    public void ValidatingDetails(String firstName, String lastName) {
        driver.findElement(txtFname).sendKeys("Divya");
        driver.findElement(txtLname).sendKeys("Guttikonda");
    }

    public void entermail() {
        driver.findElement(txtEmail).sendKeys("divyaguttikonda24@gmail.com");
    }

    public void enterNumber() {
        driver.findElement(txtNumber).click();
    }

    public void dropDown(){
        driver.findElement(dropDownLabel).click();
        driver.findElement(dropdownvalue).sendKeys("Employee Referral");
    }
    public void contact(){
        driver.findElement(txtContact).click();
    }
    public void editTheContact(){
        driver.findElement(txtEdit).click();
    }
    public void enterTitle(){
        driver.findElement(txtTitle).sendKeys("project");
    }
    public void button(){
        driver.findElement(txtbutton).click();
    }
    public void deleteTheContact(){
        driver.findElement(deleteBtn).click();
    }
    public void popUpButton(){
        driver.findElement(popupOperation).click();
    }

    public void save() {
        driver.findElement(savebtn).click();
    }

}
