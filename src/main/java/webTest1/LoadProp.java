package webTest1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp extends Utils{
    static Properties prop;
    static FileInputStream input;
    static String filename = "config.properties";
    static String filelocation = "src/test/resources/TestData/";

    public String getProperty(String Key) {
        prop = new Properties();
        try {
            input = new FileInputStream(filelocation + filename);
            prop.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(Key);


    }
}
