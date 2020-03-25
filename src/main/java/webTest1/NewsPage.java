package webTest1;

import org.openqa.selenium.By;

public class NewsPage extends Utils {
    LoadProp loadProp = new LoadProp();
    //user adds new comment in news home page
    private By _news = By.xpath("//a[contains(@href,'about')and(@class='read-more')]");
    private By _title = By.xpath("//input[@class='enter-comment-title']");
    private String title = "about nopcommerce website";
    private By _comment = By.xpath("//textarea[@class='enter-comment-text']");
    private String comment = "its very nice +"+TimeStamp() ;
    private By _newcomment = By.xpath("//input[@name = 'add-comment']");
    private By _successmessage = By.xpath("//div[contains(text(),'successfully ')]");

    public void userClickOnDetails(){
        TimeDelay(2);
        clickOnElement(_news);
        TimeDelay(2);
        EnterText(_title,title);
        EnterText(_comment,comment);
        clickOnElement(_newcomment);

    }
    public void verifysuccessmessageofcomment(){
        //verify that new comment is added successfully
        String expected = "News comment is successfully added.";
        assertTextMessage("News comment is successfully added.",expected,_successmessage);
    }

}
