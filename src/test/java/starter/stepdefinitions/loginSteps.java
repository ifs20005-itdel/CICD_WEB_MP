package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.loginPage;
import starter.pages.productPage;

public class loginSteps {
    @Steps
    loginPage loginpage;
    productPage productpage;




    @And("user on login page")
    public void userOnLoginPage() {
        loginpage.onLoginPage();
    }

    @When("user input valid email")
    public void userInputValidEmail() {
        loginpage.inputValidEmail("lasriarajagukguk@gmail.com");
    }

    @And("user input valid password")
    public void userInputValidPassword() {
        loginpage.inputValidPassword("lasriargg08");
    }

    @And("user click login button")
    public void userClickLoginButton() {
        loginpage.clickLoginButton();
    }


    @And("user input empty password")
    public void userInputEmptyPassword() {
        loginpage.inputEmptyPassword("");
    }

    @Then("user see error message {string}")
    public void userSeeErrorMessage(String arg0) {
        loginpage.seeErrorMessagePasswordIsRequired();
    }

    @When("user input empty email")
    public void userInputEmptyEmail() {
        loginpage.inputEmptyEmail("");
    }

    @Then("user view error message {string}")
    public void userViewErrorMessage(String arg0) {
        loginpage.viewErrorMessageEmailIsRequired();
    }

    @When("user input invalid email")
    public void userInputInvalidEmail() {
        loginpage.inputInvalidEmail("lasriarajagukguk08@gmail.com");
    }

    @Then("user can see error message {string}")
    public void userCanSeeErrorMessage(String arg0) {
        loginpage.canSeeErrorMessageNotFound();
    }

    @And("user input invalid password")
    public void userInputInvalidPassword() {
        loginpage.inputInvalidPassword("lasriargg08");
    }

    @Then("user can view error message {string}")
    public void userCanViewErrorMessage(String arg0) {
        loginpage.canViewErrorMessageInvalid();
    }
}
