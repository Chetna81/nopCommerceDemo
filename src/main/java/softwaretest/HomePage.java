package softwaretest;

import org.openqa.selenium.By;

public class HomePage extends Utils {


    private By registrationLink = By.linkText("Register");
    private By customerCurrency = By.id("customerCurrency");

    //click On Registration Button
    public void clickOnRegistrationLink() {
        clickElementBy(registrationLink);
    }

    public void userClickOnCustomerCurrency(String currency){
        selectByVisibleText(customerCurrency, currency);
    }





}
