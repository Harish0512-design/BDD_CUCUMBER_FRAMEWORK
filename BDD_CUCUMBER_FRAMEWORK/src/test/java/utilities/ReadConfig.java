package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties properties;

	String path = "src/test/resources/config.properties";

	// constructor
	public ReadConfig() {
		try {
			properties = new Properties();
			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getBrowser() {
		String value = properties.getProperty("browser");

		if (value != null)
			return value;
		else
			throw new RuntimeException("Browser is not specified in config file.");

	}

	public String getBaseURL() {
		String value = properties.getProperty("applicationURL");

		if (value != null)
			return value;
		else
			throw new RuntimeException("Base URL is not specified in config file.");

	}

}
