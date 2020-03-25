package webTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Computers extends Utils {
    public void ClickOnComputerCategory() {
        // ClickOnElement(_Computer);

    }

    private By _Notebook = By.linkText("Notebooks");

    public void UserClickOnNotebook() {
        //click on Notebook
        TimeDelay(2);
        clickOnElement(_Notebook);
    }

    private By _dropdown = By.id("products-orderby");
    private String priceHighToLow = "Price: High to Low";

    public void UserSelectFRomPositionPriceHighToLow() {
        //select price from drop down high to low
        selectFromDropdownByVisibleText(_dropdown, priceHighToLow);
    }

    public void verifyUserShouldBeAbleToSeePriceHighToLow() {
        List<WebElement> myList = driver.findElements(By.className("prices"));
        //my list contains all the web elements
        //if you want to get all elements text into array lists
        List<String> all_elements_text = new ArrayList<>();
        for (int i = 0; i<myList.size(); i++){
            all_elements_text.add(myList.get(i).getText());
            System.out.println(myList.get(i).getText());


        }

    }

}
