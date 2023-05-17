package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created By Nikunja A Senjalia
 */
public class ProductsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductsPage.class.getName());

    public ProductsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='inventory_item']")
    List<WebElement> actualProducts;

    public int countItems() {
        log.info("Counting items of product : " + actualProducts);
        return countItem(actualProducts);
    }

}
