package webTest1;

import org.openqa.selenium.By;

public class ShippingAddress extends Utils {
    private By _continue = By.xpath("//input[@onclick='ShippingMethod.save()']");

    public void userShippingAddress(){clickOnElement(_continue);

    }
}
