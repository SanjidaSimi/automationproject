package com.browserConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;


public class operaConfig {


    public static WebDriver driver;


    public static void main(String[] args) {

        launch_Opera();
        open_URL();
        close_Opera();

    }
    public static void launch_Opera (){

        System.setProperty("webdriver.opera.driver","./src/main/resources/operadriver.exe");

        driver = new OperaDriver();
    }


    public static void open_URL(){

        driver.get("https://demo.opencart.com/index.php?route=account/register");

    }


    public static void close_Opera() {

        driver.close();

    }

}

