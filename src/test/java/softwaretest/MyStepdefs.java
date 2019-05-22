package softwaretest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();

    @Given("^user is on register page$")
    public void user_is_on_register_page() {
        homePage.clickOnRegistrationLink();


    }

    @When("^user enters all registration details$")
    public void user_enters_all_registration_details() {
        registrationPage.userEntersAllRegistrationDetails();


    }

    @Then("^user should able to register successfully$")
    public void user_should_able_to_register_successfully() {
        registrationPage.clickOnRegisterBtn();


    }

    @Given("^user is on product list page$")
    public void userIsOnProductListPage() {
        homePage.userClickOnCustomerCurrency();

    }

    @When("^user enter all product list page details$")
    public void userEnterAllProductListPageDetails() {
        homePage.userEnterAllProductListPageDetails();

    }

    @Then("^user should be able to navigate to product list page$")
    public void userShouldBeAbleToNavigateToProductListPage() {
        homePage.userShouldBeNavigateToProductListPage();
    }
}
