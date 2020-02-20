package com.gmy.sparkproject.test;

import com.gmy.sparkproject.conf.ConfigurationManager;

public class ConfigurationManagerTest{

    public static void main(String[] args) {
        String tetkey1 = ConfigurationManager.getProperty("testkey1");
        String tetkey2 = ConfigurationManager.getProperty("testkey2");

        System.out.println(tetkey1);
        System.out.println(tetkey2);

    }
}