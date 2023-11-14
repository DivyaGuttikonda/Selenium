package com.example.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
    WebDriver driver = new ChromeDriver();
    private final By btnSignIn = By.xpath("//a[@class=\"zlogin-apps\"]");
    private final By txtUserEmailID = By.xpath("//input[@id='login_id']");
    private final By btnNext = By.xpath("//span[text()='Next']");
    private final By txtUserPassword = By.xpath("//input[@id='password']");
    private final By btnLogin = By.xpath("//span[text()='Sign in']//parent::button");
    private final By navigate = By.xpath("//div[text()=\"CRM\"]");
    private final By navigatetoContacts = By.xpath("//a[@id=\"Visible_Contacts\"]");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openBrowser() {
        driver.get("https://www.zoho.com/login.html");
    }

    public void tearDown() {

        driver.quit();
    }

    public void signIn() {
        driver.findElement(btnSignIn).click();
    }

    public void emailId() {
        driver.findElement(txtUserEmailID).sendKeys("adilsamdani3003@gmail.com");

    }

    public void next() {
        driver.findElement(btnNext).click();
    }

    public void enterPwd() {
        driver.findElement(txtUserPassword).sendKeys("qwert@007");

    }

    public void login() {

        driver.findElement(btnLogin).click();
    }

    public void pageVerfication() {
        driver.findElement(By.xpath("//a[@id='ztb-logo']")).click();
    }

    public void loginIntoApplication() throws InterruptedException {
        openBrowser();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        signIn();
        emailId();
        next();
        Thread.sleep(3000);
        enterPwd();
        login();
        Thread.sleep(3000);
        pageVerfication();
    }
}

