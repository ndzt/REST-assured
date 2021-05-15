package tests;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PutPatchDeleteExamples {


    @Test
    public void testPut() {

        baseURI = "https://reqres.in/api";

        JSONObject request = new JSONObject();
        request.put("name", "Raghav");
        request.put("job","Teacher");

        System.out.println(request.toJSONString());

        given()
                .header("Content-type","application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .put("/users/2")
                .then()
                .statusCode(200).log().all();

    }


    @Test
    public void testPatch() {

        baseURI = "https://reqres.in/api";

        JSONObject request = new JSONObject();
        request.put("name", "Raghav");
        request.put("job","Teacher");

        System.out.println(request.toJSONString());

        given()
                .header("Content-type","application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .patch("/users/2")
                .then()
                .statusCode(200).log().all();

    }

    @Test
    public void testDelete() {

        baseURI = "https://reqres.in/api";

        given()
                .when()
                .delete("/users/2")
                .then()
                .statusCode(204).log().all();

    }


}
