package webTest1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    JewelleryPage jewelryPage = new JewelleryPage();
    ProductComparisionPage productComparisionPage = new ProductComparisionPage();
    // EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    Categories catagories = new Categories();
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();
    GuestCheckout guestCheckout = new GuestCheckout();
    ShippingAddress shippingAddress = new ShippingAddress();
    PaymentMethod paymentMethod = new PaymentMethod();
    NewsPage newsPage = new NewsPage();
    AddToCartButton addToCartButton = new AddToCartButton();
    ChangeCurrency changeCurrency = new ChangeCurrency();
    CheckoutResult checkoutResult = new CheckoutResult();
    Computers computers = new Computers();
//user can register successfully
    @Given("^user is on register page$")
    public void userIsOnRegisterPage() {
        homePage.clickOnRegisterButton();
    }

    @When("^user enters all register page$")
    public void userEntersAllRegisterPage() {
        registrationPage.userEntersRegistrationDetails();
    }

    @And("^user clicks on register button$")
    public void userClicksOnRegisterButton() {
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();

    }
    //user can compare products successfully

    @Then("^user should be able to register successfully$")
    public void userShouldBeAbleToRegisterSuccessfully() {

    }

    @Given("^user is on home page$")
    public void userIsOnHomePage() {
    }

    @When("^user clicks on jewelery$")
    public void userClicksOnJewelery() {
        homePage.clickOnJewelleryLink();
    }

    @And("^user compares two products$")
    public void userComparesTwoProducts() {
        jewelryPage.ChooseProductsToCompare();
    }

    @Then("^user should be able to compare two products successfully$")
    public void userShouldBeAbleToCompareTwoProductsSuccessfully() {
        productComparisionPage.verifyUserIsOnProductComparisionPage();
    }
    //unregistered user cannot refer a friend

    @When("^user clicks on computers$")
    public void userClicksOnComputers() {
        homePage.clickOnComputerCategoryPage();
    }

    @And("^user select product to refer a friend$")
    public void userSelectProductToReferAFriend() {
        productDetailsPage.VerifyUserIsOnComputerCatagoryPage();
        productDetailsPage.userClickOnNoteBook();
        productDetailsPage.userClickOnAppleMac();


    }

    @Then("^user should not be able to refer a product to friend$")
    public void userShouldNotBeAbleToReferAProductToFriend() {
        productDetailsPage.UserReferToFriend();
    }
    //user sort product high to low

    @And("^user clicks on price high to low$")
    public void userClicksOnPriceHighToLow() {
        computers.UserClickOnNotebook();
        computers.UserSelectFRomPositionPriceHighToLow();
    }

    @Then("^user should be able to see price high to low successfully$")
    public void userShouldBeAbleToSeePriceHighToLowSuccessfully() {
        computers.verifyUserShouldBeAbleToSeePriceHighToLow();
    }

    //registered user refer a product to friend
    @When("^register user click on computer categories$")
    public void registerUserClickOnComputerCategories() {
        registrationPage.userEntersRegistrationDetails();
        homePage.clickOnComputerCategoryPage();
    }

    @And("^user select products to refer a friend$")
    public void userSelectProductsToReferAFriend() {
        catagories.userClickOnNoteBook();
        catagories.userClickOnApplemac();
    }

    @Then("^register user should be able to refer a friend successfully$")
    public void registerUserShouldBeAbleToReferAFriendSuccessfully() {
        catagories.userReferToFriend();
    }

    //Guest user should be able to add new comment.................................................>
    @When("^user click on view news archive$")
    public void userClickOnViewNewsArchive() {
        homePage.clickOnViewNewsArchive();
    }

    @And("^user click on details$")
    public void userClickOnDetails() {
        newsPage.userClickOnDetails();
    }

    @Then("^guest user should be able to add new comment on website$")
    public void guestUserShouldBeAbleToAddNewCommentOnWebsite() {
        newsPage.verifysuccessmessageofcomment();
    }

    //add to cart button is present in products
    @Then("^Then user should be able to see add to cart button is present on feature products$")
    public void thenUserShouldBeAbleToSeeAddToCartButtonIsPresentOnFeatureProducts() {
        addToCartButton.verifyAddToCartButton();

    }

    //user can view currency change in products
    @When("^user select currency from dropdown$")
    public void userSelectCurrencyFromDropdown() {
        changeCurrency.selectCurrencyFromDropDown();
    }

    @Then("^user should be able to change currencysymbol$")
    public void userShouldBeAbleToChangeCurrencysymbol() {
        changeCurrency.verifyCurrencySymbolPresent();
    }

    //guest user can checkout successfully

    @When("^user navigate to jewellery category page$")
    public void userNavigateToJewelleryCategoryPage() {
        homePage.clickOnJewelleryLink();
        jewelryPage.VerifyUserIsOnJeweleryPage();
    }

    @And("^user select add to cart product$")
    public void userSelectAddToCartProduct() {
        jewelryPage.AddToCartProduct();
    }

    @And("^user checkout as a guest$")
    public void userCheckoutAsAGuest() {
        guestCheckout.checkoutAsGuest();
    }

    @And("^user click on shipping address$")
    public void userClickOnShippingAddress() {
        shippingAddress.userShippingAddress();
    }

    @And("^user select payment method$")
    public void userSelectPaymentMethod() {
        paymentMethod.userChoosePaymentMethod();
    }

    @Then("^guest user should be able to checkout successfully$")
    public void guestUserShouldBeAbleToCheckoutSuccessfully() {
        guestCheckout.checkoutAsGuest();
    }
}
