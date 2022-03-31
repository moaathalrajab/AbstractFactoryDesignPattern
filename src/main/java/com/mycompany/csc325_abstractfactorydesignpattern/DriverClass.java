/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_abstractfactorydesignpattern;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {

    private static Application configureApplication(){

        Application app;
        WritingFactory factory;

        String printName = "Check the config file for cominc";

        if (printName.contains("paper")) {
            factory = new ComicBookFactory();
            app = new Application(factory);
        } else {
            factory = new MenuscriptFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.revealContent();
    }
}
