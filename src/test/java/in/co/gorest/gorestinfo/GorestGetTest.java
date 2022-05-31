package in.co.gorest.gorestinfo;


import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;


public class GorestGetTest extends TestBase {

    @Test
    public void getAllGorestUsersInfo() {
        Response response = given()
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleGorestUsersInfo() {
        Response response = given()
                .pathParam("id",3821)
                .when()
                .get("/users/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }




    }


