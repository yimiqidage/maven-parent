package com.test.maven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.http.ConnectionClosedException;

/**
 * A Camel Application
 */
public class MainApp {

    private Logger logger = LogManager.getLogger(MainApp.class);

    public static void main(String[] args) {
        System.out.println("MainApp service2");
        System.out.println(ConnectionClosedException.class);
    }

}

