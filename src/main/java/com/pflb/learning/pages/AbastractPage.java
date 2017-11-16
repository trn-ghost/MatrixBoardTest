package com.pflb.learning.pages;

import com.pflb.learning.helpers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbastractPage {
    protected WebDriver driver;

    public AbastractPage() {
        driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }
}
