package in.co.gorest.gorestinfo;

import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GorestDeleteTest extends TestBase {
    @Test
    public void deleteAllGorestInfo() {
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer 65cbc4c43040ae97eb012d87fb6bb928809feb842bfeba5ea49b2969ea92ede6")
                .pathParams("id",14618)
                .when()
                .delete("/{id}");
        response.prettyPrint();
        response.then().statusCode(204);
    }
    }





