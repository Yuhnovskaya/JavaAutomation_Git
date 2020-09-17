package service;

import service.PropertiesReader;

import java.util.Properties;

public
class TestData {
    static Properties properties = PropertiesReader.getProperties("src\\test\\resources\\dev.properties");
    public static String browser = properties.getProperty("testdata.browser");
    public static String searchText = properties.getProperty("testdata.searchText");
    public static String googleCloudURL = properties.getProperty("testdata.googleCloudURL");
    public static String tenMinutesMailURL = properties.getProperty("testdata.10minutesmail");
}
