package io.github.gh0stinthesh311.author;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AuthorApiTest extends BaseApiTest {
    @Test
    public void testAllAuthors() {
        given()
                .when()
                .get("/api/author/all")
                .then()
                .statusCode(200)
                .and()
                .contentType(ContentType.JSON);
    }
}