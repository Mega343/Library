package com.nixsolutions.util;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

    private static final Logger LOG = LogManager.getLogger(ReadProperties.class.getName());

    public String[] getProperties(String filePropertiesName) throws IOException {
        LOG.info("Start read properties from file " + filePropertiesName);
        String[] properties = new String[3];
        try (FileInputStream fis = new FileInputStream(filePropertiesName)) {
            Properties property = new Properties();
            property.load(fis);

            properties[0] = property.getProperty("h2.url");
            properties[1] = property.getProperty("h2.login");
            properties[2] = property.getProperty("h2.password");
        }
        LOG.info("All properties were read.");
        return properties;
    }
}
