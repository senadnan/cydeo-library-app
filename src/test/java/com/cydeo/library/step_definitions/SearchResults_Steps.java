package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.DashboardPage;
import com.cydeo.library.pages.LibraryAppLoginPage;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class SearchResults_Steps {

    LibraryAppLoginPage loginPage = new LibraryAppLoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library2.app.url"));

    }
    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
        loginPage.inputEmail.sendKeys(ConfigurationReader.getProperty("librarian.username"));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("librarian.password"));
        loginPage.signInButton.click();


    }
    @Given("I click on {string} link")
    public void i_click_on_link(String link) {
        dashboardPage.usersLink.click();



    }
    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String>columnNames) {
        List<String> actual = new ArrayList<>();
        actual.add(dashboardPage.ActionsColumn.getText());
        actual.add(dashboardPage.userIdColumn.getText());
        actual.add(dashboardPage.nameColumn.getText());
        actual.add(dashboardPage.emailColumn.getText());
        actual.add(dashboardPage.groupColumn.getText());
        actual.add(dashboardPage.statusColumn.getText());

        Assert.assertEquals(columnNames, actual);




    }

}
