package webTest1;

import org.openqa.selenium.By;

public class ProductComparisionPage extends Utils {
    //user is on product comparision page ...................................>
    String expected = "Compare products";
    private By _PageTitle = By.xpath("//div [@class='page-title']");
    public void verifyUserIsOnProductComparisionPage(){
        assertTextMessage("Compare products",expected,_PageTitle);
    }
}
