package service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public
class PropertiesReader {
    public static
    Properties getProperties(String pathToProperties) {
        Properties properties = new Properties();
        try (InputStream input = new FileInputStream(pathToProperties)) {
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return properties;
    }
}
