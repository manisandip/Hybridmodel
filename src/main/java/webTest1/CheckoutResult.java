package webTest1;

import org.openqa.selenium.By;

public class CheckoutResult extends Utils {
    private By _checkoutsuccessmessage =By.xpath("//strong[contains(text(),'processed')]");

    public void verifyCheckoutSuccessMessage()

    {
        //verify user can checkout successfully..................................................>
        TimeDelay(5);
        clickOnElement(_checkoutsuccessmessage);
        String expected = "Your order has been successfully processed!";
        assertTextMessage("Your order has been successfully processed!",expected,_checkoutsuccessmessage);
    }
}
