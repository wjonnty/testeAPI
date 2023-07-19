package org.serveresapi.teste;

import org.junit.jupiter.api.Test;
import org.serveresapi.dominio.Usuarios;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;


public class ExcluirUsuarioTest extends BaseTest {

    private String getUsuarioIdSemCarrinhoCadastrado(){
        Usuarios usuario = new Usuarios("usuarioExcluir", emailAleatorio(), "usuarioExcluir", "true");
        return given().
                    body(usuario).
                when().
                    post(CRIA_LISTA_USUARIOS_ENDPOINT).
                then()
                    .extract().
                    path("_id");
    }


    @Test
    public void testExcluirUsuarioSemCarrinho(){
        given().
                pathParam("_id",getUsuarioIdSemCarrinhoCadastrado()).
        when().
                delete(CRIA_LISTA_USUARIOS_ENDPOINT+"/{_id}").
        then().
                statusCode(200).
                body("message",equalTo("Registro excluído com sucesso"));
    }

    @Test
    public void testExcluirUsuarioComCarrinho(){
        given().
                pathParam("_id",idUsuario).
        when().
                delete(CRIA_LISTA_USUARIOS_ENDPOINT+"/{_id}").
        then().
                statusCode(400);

    }

}

