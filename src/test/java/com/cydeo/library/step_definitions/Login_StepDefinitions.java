package com.cydeo.library.step_definitions;


import com.cydeo.library.pages.LibraryAppLoginPage;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login_StepDefinitions {

    LibraryAppLoginPage loginPage = new LibraryAppLoginPage();

    @Given("user is on the library login page")
    public void user_is_on_the_library_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library2.app.url"));
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        loginPage.inputEmail.sendKeys(ConfigurationReader.getProperty("librarian.username"));
    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("librarian.password"));
        loginPage.signInButton.click();
    }

    @When("user enters student username")
    public void user_enters_student_username() {
        loginPage.inputEmail.sendKeys(ConfigurationReader.getProperty("student.username"));
    }

    @When("user enters student password")
    public void user_enters_student_password() {
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("student.password"));
        loginPage.signInButton.click();
    }


    @When("user enters librarian username {string}")
    public void user_enters_librarian_username(String username) {
        loginPage.inputEmail.sendKeys(username);

    }

    @When("user enters librarian password {string}")
    public void user_enters_librarian_password(String password) {
        loginPage.inputPassword.sendKeys(password);
        loginPage.signInButton.click();
    }

    @When("user enters student username {string}")
    public void user_enters_student_username(String username) {
        loginPage.inputEmail.sendKeys(username);
    }

    @When("user enters student password {string}")
    public void user_enters_student_password(String password) {
        loginPage.inputPassword.sendKeys(password);
        loginPage.signInButton.click();
    }

    @When("I login using as a username {string} and as a password {string}")
    public void i_login_using_as_a_username_and_as_a_password(String email, String password) {
        loginPage.login(email, password);

    }

    @Then("there should be {int} {string}")
    public void there_should_be(Integer int1, String string) {

    }


}