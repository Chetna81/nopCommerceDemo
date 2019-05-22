package softwaretest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductListPage extends Utils {
    HomePage homePage = new HomePage();



    public void priceCurrency() {
        //code to perform hovering task on Apparels
       // mouseOverHover(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/a"));

        //click on clothing
        clickElementBy(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]ul/li[2]/a"));

        //click on Currency
        clickElementBy(By.xpath("//*[@ID=\"customerCurrency\"]"));

        //click on Euro
        selectByVisibleText(By.xpath("//*[@id=\"customerCurrency\"]"), "Euro");

        //click on Sort Currency
        clickElementBy(By.xpath("//*[@id=\"custerCurrency\"]"));

        //click on USD
        selectByVisibleText(By.xpath("//*[@id=\"customerCurrency\"]"),"US Dollar");

        //Check for $ value
        boolean present = false;
        List<WebElement> activeList = driver.findElements(By.className("actual-price"));
        //Get Text of $ value and store in to two ArrayList
        for(WebElement element : activeList){
            String str = element.getText();
            for (int i =0; i<str.length(); i++){
                char ch = str.charAt(i);
                if (ch == '$'){
                    present = true;
                    //index = i;
                }
            }
            if (present == true) {
                System.out.println("$"+"is present in the array list");
                //break;
            }else {
                System.out.println("The $ is not present at the array list");
            }
        }


    }


}





