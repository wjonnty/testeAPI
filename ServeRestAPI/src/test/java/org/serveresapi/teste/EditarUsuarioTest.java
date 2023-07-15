package org.serveresapi.teste;

import org.junit.jupiter.api.Test;
import org.serveresapi.dominio.Usuarios;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;


public class EditarUsuarioTest extends BaseTest {
    
    @Test
    public void testEditarUsuarioCadastrado(){
        Usuarios usuario= new Usuarios("nomealteirado",EMAIL_USUARIO,SENHA_USUARIO,"true");

        given().
                pathParam("_id",ID_USUARIO).
                body(usuario).
        when().
                put(CRIA_LISTA_USUARIOS_ENDPOINT+"/{_id}").
        then().
                statusCode(200).
                body("message",equalTo("Registro alterado com sucesso"));

    }
    @Test
    public void testEeditarUsuarioEmailDiferenteDoId(){
        Usuarios usuario= new Usuarios("nomealterado","email@diferente.com",SENHA_USUARIO,"true");

        given().
                pathParam("_id",ID_USUARIO).
                body(usuario).
        when().
                put(CRIA_LISTA_USUARIOS_ENDPOINT+"/{_id}").
        then().
                statusCode(400).
                body("message",equalTo("Este email já está sendo usado"));

    }

    @Test

    public void testCadastrarUsuarioViaPUT(){
        Usuarios usuario= new Usuarios("nomealterado",emailAleatorio(),SENHA_USUARIO,"true");
        given().
                pathParam("_id","123").
                body(usuario).
        when().
                put(CRIA_LISTA_USUARIOS_ENDPOINT+"/{_id}").
        then().
                statusCode(201).
                body("message",equalTo("Cadastro realizado com sucesso"));
    }



}
