package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.DashboardPage;
import com.cydeo.library.pages.LibraryAppLoginPage;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginWithDifferentUsers_Step {

    LibraryAppLoginPage loginPage = new LibraryAppLoginPage();
    DashboardPage dashboardPage = new DashboardPage();


    @When("I login using {string} and {string}")
    public void i_login_using_and(String email, String password) {
        loginPage.login(email, password);
    }

    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String name) {

     String actual = dashboardPage.accountHolderName.getText();

     Assert.assertEquals(name, actual);




    }


}
