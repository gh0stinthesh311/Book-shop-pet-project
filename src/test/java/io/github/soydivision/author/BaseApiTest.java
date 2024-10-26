package io.github.soydivision.author;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

public class BaseApiTest {
    @BeforeTest
    public static void setup() {
        RestAssured.baseURI = "http://localhost:8080";
    }
}