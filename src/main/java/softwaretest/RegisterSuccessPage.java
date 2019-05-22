package softwaretest;

import org.junit.Test;

public class RegisterSuccessPage extends Utils {

    LoadProp loadProp = new LoadProp();
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();


    public void userShouldRegisterSuccessfully()
    {

        homePage.clickOnRegistrationLink();
        registrationPage.clickOnGenderFemale(loadProp.getProperty("gender"));
        registrationPage.enterFirstName(loadProp.getProperty("firstName"));
        registrationPage.enterLastName(loadProp.getProperty("lastName"));
        registrationPage.enterEmailAddress(loadProp.getProperty("email"));
        registrationPage.enterPassword(loadProp.getProperty("password"));
        registrationPage.enterConfirmPassword(loadProp.getProperty("confirmPassword"));
        registrationPage.clickOnRegisterBtn();
    }

}


