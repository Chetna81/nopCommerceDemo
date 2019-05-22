package softwaretest;

import org.openqa.selenium.By;

public class CustomerCurrency extends Utils {
    HomePage homePage = new HomePage();
    LoadProp loadProp = new LoadProp();

     By customerCurrency = By.id("customerCurrency");


     public static void userNavigateToCustomerCurrency(){


     }
     public void userClickOnCustomerCurrency(String currency){
         selectByVisibleText(customerCurrency, currency);
     }


}
