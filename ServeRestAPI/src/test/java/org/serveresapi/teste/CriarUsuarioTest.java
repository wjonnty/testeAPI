package org.serveresapi.teste;

import org.junit.jupiter.api.Test;
import org.serveresapi.dominio.Usuarios;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;


public class CriarUsuarioTest extends BaseTest {
 


    @Test
    public void testCriarUsuarioEmailNovo(){
        Usuarios usuario= new Usuarios("resssured",emailAleatorio(),"teste","true");

        given().
                    body(usuario).
            when().
                    post(CRIA_LISTA_USUARIOS_ENDPOINT).
            then().
                    statusCode(201)
                        .body("message",equalTo("Cadastro realizado com sucesso"),
                            "_id.size()",equalTo(16));
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
