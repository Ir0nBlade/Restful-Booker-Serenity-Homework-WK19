package com.booker.restful.testbase;

import com.booker.restful.constants.Path;
import com.booker.restful.utils.PropertyReader;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * @author Vimal Vithalpura
 * @project Restful-Booker-Serenity-Homework-WK19
 * @created 09/01/2022
 */
public class TestBase {

    public static PropertyReader propertyReader;

    @BeforeClass
    public static void initialize(){
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
//        RestAssured.port = Integer.parseInt(propertyReader.getProperty("port"));
        RestAssured.basePath = Path.BOOKING;
    }
}
