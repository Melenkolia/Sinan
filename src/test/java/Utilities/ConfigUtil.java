package Utilities;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class ConfigUtil {
    public static Properties config;
    public static Properties baseURL;


    public static Properties config_reader(String FilePath){

        try {
            config = new Properties();
            config.load(new FileInputStream(FilePath));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
        return config;

    }

    @BeforeTest
    public void SetBaseURL(){
        baseURL = config_reader("resources/KariyerNet.properties");
    }


    public String CaseText ( String caseTextPath){
        String caseFile;
        Path caseText = Paths.get(caseTextPath);
        try {
            caseFile = Files.readString(caseText);
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }

        return  caseFile;
    }

    public static void waitInSeconds(int secVal) {
        try {
            Thread.sleep(secVal * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
