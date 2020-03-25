package webTest1;

import org.openqa.selenium.By;

public class JewelleryPage extends Utils {
    private By _Product1 = By.xpath("//input[contains(@onclick,'/compareproducts/add/40')]");
    private By _Product2 = By.xpath("//input[contains(@onclick,'/compareproducts/add/42')]");
    private By _ComparisonLink = By.xpath("//a[(text()='product comparison')]");
    private By _ProductBracelet = By.xpath("//a[contains(text(),'Flower Girl Bracelet')]");
    private By _Product = By.xpath("//input[@value='Add to cart']");
    private By _AddToCart = By.xpath("//span[@class='cart-label']");
    private By _ShoppingCart = By.className("//span[@class='close']");
    private By _CheckBox = By.xpath("//input[@id='termsofservice']");
    private By _checkout = By.xpath("//button[@type='submit']");
    public void VerifyUserIsOnJeweleryPage(){
        assertURL("jewelry");
    }
    public void ChooseProductsToCompare(){
        //user choose products to compare
        TimeDelay(5);
        clickOnElement(_Product1);
        TimeDelay(5);
        clickOnElement(_Product2);
        TimeDelay(2);
        clickOnElement(_ComparisonLink);

    }
    public void AddToCartProduct() {
        TimeDelay(2);
        clickOnElement(_Product);
        //TimeDelay(5);
        clickOnElement(_AddToCart);
        TimeDelay(7);
        //clickOnElement(_ShoppingCart);
        clickOnElement(_CheckBox);
        TimeDelay(2);
        clickOnElement(_checkout);
    }








}
