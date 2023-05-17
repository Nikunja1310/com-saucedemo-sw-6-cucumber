package com.saucedemo.cucumber.steps;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
/**
 * Created By Nikunja A Senjalia
 */

public class LoginSteps {
    @Given("^I am on Login Page$")
    public void iAmOnLoginPage() {
    }

    @When("^I enter User name  \"([^\"]*)\"$")
    public void iEnterUserName(String userName)  {
        new LoginPage().enterUserName(userName);
    }

    @And("^I enter Password \"([^\"]*)\"$")
    public void iEnterPassword(String password )  {
        new LoginPage().enterPassword(password);
    }

    @And("^I click on Login Button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {
    }


    @And("^I should see the products \"([^\"]*)\" text$")
    public void iShouldSeeTheProductsText(String productsText)  {
        Assert.assertEquals(productsText,new LoginPage().getProductText(),"Products Text not verified");
    }


    @And("^I should see number of products on the page as (\\d+)$")
    public void iShouldSeeNumberOfProductsOnThePageAs(int actualProducts) {
        Assert.assertEquals(new ProductsPage().countItems(),6,"Actual products count is not equal  to expected");
    }
}
