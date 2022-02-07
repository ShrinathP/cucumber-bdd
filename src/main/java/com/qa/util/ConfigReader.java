package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class ConfigReader {

    private Properties prop;

    /**
     * This method is used to load the properties from config.properties
     *
     * @return it returns Properties prop object
     * @throws IOException
     */
    public Properties initProperties() throws IOException {
        prop = new Properties();
        //NOTE: USE "Paths" TO AVOID "File.Seperator"
        //String path = File.separator + "src" + File.separator + "test" + File.separator + "resources/config/config.properties";

        Path path = Paths.get("src", "test", "resources", "config", "config.properties");
        FileInputStream fis = new FileInputStream(String.valueOf(path));
        prop.load(fis);

        //NOTE
        //Better way to load properties
        //prop.load(Files.newBufferedReader(Paths.get("File path.xml")));
        return prop;
    }
}
