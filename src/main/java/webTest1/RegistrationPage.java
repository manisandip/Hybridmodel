package webTest1;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {
    private By _firstname = By.id("FirstName");
    private By _lastname = By.id("LastName");
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmpassword = By.id("ConfirmPassword");
    private By _registerbutton = By.id("register-button");
    private String firstname = "mani12";
    private String lastname ="sharma";
    private static String timestamp = TimeStamp();

    public void verifyUserIsOnRegisterPage(){
        assertURL("register");
    }
    public void userEntersRegistrationDetails(){
        //user enters registration details ............................
        TimeDelay(2);
        sendText(_firstname,firstname);
        TimeDelay(2);
        sendText(_lastname,lastname);
        sendText(_email,"xyz"+timestamp+"@gmail.com");
        TimeDelay(2);
        sendText(_password,"test123");
        sendText(_confirmpassword,"test123");
        clickOnElement(_registerbutton);


    }
}
