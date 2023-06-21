package api.Post2;
import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Post2 {



    @Test
    public void post(){
        // configurar caminho comun de acesso
        baseURI = "https://reqres.in";
        basePath = "/api";

        // requisição do post2
        given()
                .body("{\n" +
                        "  \"username\": \"string\",\n" +
                        "  \"email\": \"string\",\n" +
                        "  \"password\": \"string\"\n" +
                        "}")
                .contentType(ContentType.JSON).when().post("/login")
                .then().assertThat().statusCode(400).log().all();



    }
    @Test

    public void get(){
        baseURI = "https://reqres.in";
        basePath = "/api";

        given().contentType(ContentType.JSON).when().get("/users/6")
                .then().assertThat().statusCode(200).log().all();


    }
}

