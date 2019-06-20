package com.example.app.benchlab;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMultiple {
    WebDriver driver = new ChromeDriver();

    @Test
    public void loadTestThisWebsite(){
        System.setProperty( "webdriver.chrome.driver", "C:\\Users\\IN-SO-023\\IdeaProjects\\Benchlab_NoteBook\\chromedriver.exe");
        driver.get("http://www.google.com");
        System.out.println("Page Title is " + driver.getTitle());
        Assert.assertEquals("Google", driver.getTitle());
        driver.quit();
    }
}
