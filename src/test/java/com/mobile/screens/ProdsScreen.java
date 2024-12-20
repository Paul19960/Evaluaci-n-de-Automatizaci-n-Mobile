package com.mobile.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProdsScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Container for fragments\"]/android.view.ViewGroup")
    private WebElement store;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement btnProd;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement nomProd;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement quantity;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement addCartBtn;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement logoCart;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement validarQuantity;

    //--------
    public boolean isProductDisplayed() {
        waitFor(ExpectedConditions.visibilityOf(store));
        return store.isEnabled();
    }

    public void btnProductClick() {
        btnProd.click();
    }

    public String prodName() {
        return nomProd.getText();
    }

    public void AddQuantity() {
        quantity.click();
    }

    public void agregarCart() {
        addCartBtn.click();
    }

    public void logoCart(){
        logoCart.click();
    }

    public void valQuant() {
        validarQuantity.getText();
    }


}
