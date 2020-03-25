package webTest1;

import org.openqa.selenium.By;

public class PaymentMethod extends Utils {
    //user enters all the details for payment
    private By _checkbox = By.xpath("//input[@id='paymentmethod_1']");
    private By _continue = By.xpath("//input[@onclick='PaymentMethod.save()']");
    private By _dropdown = By.xpath("//select[@class='dropdownlists']");
    private String card = "MasterCard";
    private By _cardHolderName = By.xpath("//input[@id='CardholderName']");
    private String cardHolderName ="P k Chavda";
    private By _cardNum = By.xpath("//input[@name='CardNumber']");
    private String cardNum = "5555555555554444";
    private By _expireMonth = By.xpath("//select[@name='ExpireMonth']");
    private String expireMonth = "2";
    private By _expireYear = By.xpath("//select[@name='ExpireYear']");
    private String expireyear = "2021";
    private By _cardcode = By.xpath("//input[@name='CardCode']");
    private String cardcode = "123";
    private By _contine1 = By.xpath("//input[@onclick='PaymentInfo.save()']");
    private By _confirm = By.xpath("//input[@onclick='ConfirmOrder.save()']");




    public void userChoosePaymentMethod(){
        TimeDelay(2);
        //user enters payment details..........................................>
        clickOnElement(_checkbox);
        clickOnElement(_continue);
        TimeDelay(2);
        selectTextFromDropDown(_dropdown,"MasterCard");
        EnterText(_cardHolderName,cardHolderName);
        EnterText(_cardNum,cardNum);
        selectTextFromDropDown(_expireMonth,expireMonth);
        TimeDelay(2);
        selectTextFromDropDown(_expireYear,expireyear);
        EnterText(_cardcode,cardcode);
        TimeDelay(2);
        clickOnElement(_contine1);
        clickOnElement(_confirm);

    }
}
