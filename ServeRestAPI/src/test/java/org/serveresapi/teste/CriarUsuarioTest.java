package org.serveresapi.teste;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.serveresapi.dominio.Usuarios;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CriarUsuarioTest extends BaseTest {
        
    @Test
    @Order(1)
    public void criarUsuarioECarrinho(){
        System.out.println("criar");
        Usuarios usuario= new Usuarios("resssured",EMAIL_USUARIO,SENHA_USUARIO,"true");
        idUsuario=given().body(usuario).
                    when().post(CRIA_LISTA_USUARIOS_ENDPOINT)
                    .then().extract().body().path("_id");

        String authorization= given().body("{\"email\":\""+EMAIL_USUARIO+"\",\"password\": \"teste\"}").
                                when().post(LOGIN_ENDPOINT).
                                then().extract().path("authorization");

        given().header("Authorization",authorization).body("{\"produtos\": [{\"idProduto\": \"BeeJh5lz3k6kSIzA\",\"quantidade\": 1}]}").
        when().post("/carrinhos").
        then().statusCode(201).extract().path("authorization");
    }



    @Test
    public void testCriarUsuarioEmailUsado(){
        Usuarios usuarioEmailUsado= new Usuarios("resssured",EMAIL_USUARIO,"teste","true");
        given().
                body(usuarioEmailUsado).
        when().
                post(CRIA_LISTA_USUARIOS_ENDPOINT).
        then().
                statusCode(400).body("message",equalTo("Este email já está sendo usado"));
    }


}
