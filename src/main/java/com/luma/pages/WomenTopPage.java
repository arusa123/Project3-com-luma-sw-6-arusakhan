package com.luma.pages;

import com.luma.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenTopPage extends Utility {
    private static final Logger log = LogManager.getLogger(WomenTopPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//ol[@class='products list items product-items']/li/div/div/strong")
    List<WebElement> productList;

    @CacheLookup
    @FindBy(xpath = "//select[@id='sorter']")
    WebElement productSorter;

    public ArrayList<String> listBeforeSorting() {
        List<WebElement> listOrder = productList;
        ArrayList<String> originalList = new ArrayList<>();
        for (WebElement e : listOrder) {
            originalList.add(e.getText());
        }
        return originalList;
    }

    public ArrayList<String> listAfterSorting() {
        log.info("Hover over menu " + productList.toString());

        Collections.sort(listBeforeSorting());
//        Select Sort By filter “Product Name”
//           Verify the products name display in
//        alphabetical order
        List<WebElement> listSorted = productList;
        ArrayList<String> sortedList = new ArrayList<>();
        for (WebElement e : listSorted) {
            sortedList.add(e.getText());
        }
        return sortedList;
    }

    public void productSorter(String sort) {
        log.info("sorted products" + productSorter);
        selectByVisibleTextFromDropDown(productSorter, sort);


    }
}