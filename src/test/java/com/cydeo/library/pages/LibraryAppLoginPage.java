package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryAppLoginPage {

    public LibraryAppLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement inputEmail;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
    public WebElement signInButton;



    public void login(String email, String password) {
        inputEmail.sendKeys(email);
        inputPassword.sendKeys(password);
        signInButton.click();
    }

}
