package Utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties configFile;

    static {

        String path="src/configuration.properties";
        try {
            FileInputStream input = new FileInputStream(path);
            configFile=new Properties();
            configFile.load(input);

            input.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyValue){

        return configFile.getProperty(keyValue);

    }/*
    public String getCredentials(String username,String password){
return "{\n" +
        "\t\"username\":\""+"usernameJira+"\",\n" +
        "\t\"password\":\""+"passJira+"\"\n";
    }*/
}
