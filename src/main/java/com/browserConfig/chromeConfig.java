package com.browserConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeConfig {


    public static WebDriver driver;


    public static void main(String[] args) {

        launch_Chrome ();
        open_URL();
        close_Chrome();

    }
    public static void launch_Chrome () {

        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();

    }


    public static void open_URL(){

        driver.get("https://demo.opencart.com/index.php?route=account/register");

    }


    public static void close_Chrome() {

        driver.close();

    }


}

