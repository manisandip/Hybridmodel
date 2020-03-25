package webTest1;

import org.openqa.selenium.By;

public class GuestCheckout extends Utils {
    //Storing locator ...................................................>
    LoadProp loadProp = new LoadProp();
    private By _checkoutguest = By.xpath("//input[@value='Checkout as Guest']");
    private By _firstname = By.xpath("//input[@name='BillingNewAddress.FirstName']");
    private String firstName = "Manisha";
    private By _lastname = By.xpath("//input[@name='BillingNewAddress.LastName']");
    private String lastName ="Sharma";
    private By _email = By.id("BillingNewAddress_Email");
    private String email = "mani123@gmail.com";
    private By _dropdown = By.id("BillingNewAddress_CountryId");
    private String _country = "United Kingdom";
    private By _city = By.xpath("//input[@name = 'BillingNewAddress.City']");
    private String city = "London";
    private By _address = By.xpath("//input[@name='BillingNewAddress.Address1']");
    private String address = "23,gunton avenue";
    private By _postcode = By.xpath("//input[@name ='BillingNewAddress.ZipPostalCode']");
    private String postcode = "sm2 3ls";
    private By _phonenum = By.xpath("//input[@name='BillingNewAddress.PhoneNumber']");
    private String phonenum = "07440688078";
    private By _continue = By.xpath("//input[@onclick='Billing.save()']");





    public void checkoutAsGuest(){
        //user enters checkout details
        TimeDelay(2);
        clickOnElement(_checkoutguest);
        TimeDelay(2);
        sendText(_firstname,firstName);
        sendText(_lastname,lastName);
        sendText(_email,email);
        selectFromDropdownByValue(_dropdown,"233");
        sendText(_city,city);
        sendText(_address,address);
        sendText(_postcode,postcode);
        sendText(_phonenum,phonenum);

        clickOnElement(_continue);

    }
}
