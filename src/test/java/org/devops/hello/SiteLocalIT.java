package org.devops.hello;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class SiteLocalIT {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new HtmlUnitDriver();
    }

    @Test
    public void testLocal() {
        driver.get("http://localhost:8088/hello");
        WebElement element = driver.findElement(By.xpath("//h2[1]"));
        Assert.assertEquals("Hello World!", element.getText());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
    
} 