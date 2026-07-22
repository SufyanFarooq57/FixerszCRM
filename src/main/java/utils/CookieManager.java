package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class CookieManager {
	public static void saveCookies(WebDriver driver) throws IOException {

        File file = new File("cookies.data");
        FileWriter fileWrite = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(fileWrite);

        for (Cookie cookie : driver.manage().getCookies()) {

            writer.write(
                cookie.getName() + ";" +
                cookie.getValue() + ";" +
                cookie.getDomain() + ";" +
                cookie.getPath()
            );

            writer.newLine();
        }

        writer.close();
    }
	
	public static void loadCookies(WebDriver driver) throws IOException {

        File file = new File("cookies.data");
        System.out.println("Cookie Count: " + driver.manage().getCookies().size());

        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);

        String line;

        while ((line = reader.readLine()) != null) {

            String[] data = line.split(";");

            Cookie cookie = new Cookie(
                    data[0],
                    data[1],
                    data[2],
                    data[3],
                    null
            );

            driver.manage().addCookie(cookie);
        }

        reader.close();
    }

}
