package io.github.gh0stinthesh311.author;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class AuthorApiTest extends BaseApiTest {
    @Test
    public void allAuthors() {
        given()
                .when()
                .get("/api/author/all")
                .then()
                .statusCode(200)

                .and()
                .contentType(ContentType.JSON);
    }


    @Test
    public void author() {
        given()
                .when()
                .get("/api/authors/3")
                .then()
                .statusCode(200)
                .body("name", equalTo("F. Scott Fitzgerald"))
                .and()
                .contentType(ContentType.JSON);
    }
}