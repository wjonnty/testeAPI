package org.serveresapi.teste;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;

public class ListarUsuarioTest extends BaseTest {
    private static final String NOME_USUARIO="Fulano";
  

    private int getTamanhoLista(){
        return
                when().
                    get(CRIA_LISTA_USUARIOS_ENDPOINT).
                then().
                    extract().path("quantidade");
    }

    private int getTamanhoLista(String query, String value){
        return  given().
                    param(query,value).
                when().
                        get(CRIA_LISTA_USUARIOS_ENDPOINT).
                then().
                        extract().path("quantidade");
    }

    @Test
    public void testListagemUsuarios(){
        when().
                get(CRIA_LISTA_USUARIOS_ENDPOINT).
        then().
                statusCode(200).
                body("usuarios.size()",equalTo(getTamanhoLista()));

    }

    @Test
    public void testListagemUsuariosViaID(){
        given().
                param("_id",ID_USUARIO).
        when().
                get(CRIA_LISTA_USUARIOS_ENDPOINT).
        then().
                statusCode(200).
                body("quantidade",either(equalTo(1)).or(equalTo(0)));

    }

    @Test
    public void testListagemUsuariosViaNome(){
        given().
                param("nome",NOME_USUARIO).
        when().
                get(CRIA_LISTA_USUARIOS_ENDPOINT).
        then().
                statusCode(200).
                body("usuarios.findAll {it.nome.startsWith('"+NOME_USUARIO+"')}.size()", equalTo(getTamanhoLista("nome",NOME_USUARIO)));

    }

    @Test
    public void testListagemUsuariosViaEmail(){
        given().
                param("email",EMAIL_USUARIO).
        when().
                get(CRIA_LISTA_USUARIOS_ENDPOINT).
        then().
                statusCode(200).
                body("usuarios[0].email",equalTo(EMAIL_USUARIO));
    }

    @Test
    public void testListagemUsuariosViaSenha(){
        given().
                param("password",SENHA_USUARIO).
        when().
                get(CRIA_LISTA_USUARIOS_ENDPOINT).
        then().
                statusCode(200).
                body("usuarios.findAll{it.password.startsWith('"+SENHA_USUARIO+"')}.size()",equalTo(getTamanhoLista("password",SENHA_USUARIO)));
    }

    @Test
    public void testListagemUsuariosViaAdministrador(){
        given().
                param("administrador","true").
        when().
                get(CRIA_LISTA_USUARIOS_ENDPOINT).
        then().
                statusCode(200).
                body("usuarios.findAll{it.administrador.startsWith('true')}.size()",equalTo(getTamanhoLista("administrador","true")));
    }

    @Test
    public void testListagemUsuariosViaNaoAdministrador(){
        given().
                param("administrador","false").
        when().
                get(CRIA_LISTA_USUARIOS_ENDPOINT).
        then().
                statusCode(200).
                body("quantidade",equalTo(0));
    }

    @Test
    public void testListagemUsuariosViaAdministradorDiferenteDeTrueOuFalse(){
        given().
                param("administrador","truefalse").
        when().
                get(CRIA_LISTA_USUARIOS_ENDPOINT).
        then().
                statusCode(400).
                body("administrador",equalTo("administrador deve ser 'true' ou 'false'"));
    }

}