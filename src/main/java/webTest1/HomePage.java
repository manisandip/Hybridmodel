package webTest1;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    private By _registerLink = By.xpath("//a[contains(., 'Register')]");
    private By _jewellerylink = By.linkText("Jewelry");
    private By _computers =By.linkText("Computers");
    private By _viewNewsArchive = By.xpath("//a[contains(text(),'Archive')]");

    // verify that user click on register button
    public void clickOnRegisterButton(){clickOnElement(_registerLink);}
    public void clickOnJewelleryLink(){
        // user click on jewellery link
        clickOnElement(_jewellerylink);

    }
    public void clickOnComputerCategoryPage() {
        //user click on computer category page
        clickOnElement(_computers);

    }
    //verify that user click on News Archive
    public void clickOnViewNewsArchive()
    {
        clickOnElement(_viewNewsArchive);
    }
}
