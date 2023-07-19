package org.serveresapi.teste;

import org.junit.jupiter.api.Test;
import org.serveresapi.dominio.Usuarios;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class FazerLoginTest extends BaseTest {

    

    @Test
    public void testFazerLoginEmailESenhaValidos(){
        Usuarios usuario= new Usuarios();
        usuario.setEmail(EMAIL_USUARIO);
        usuario.setPassword(SENHA_USUARIO);

        given()
                .body(usuario).
        when()
                .post(LOGIN_ENDPOINT).
        then()
                .statusCode(200)
                .body("message",equalTo("Login realizado com sucesso"));


    }

    @Test
    public void testFazerLoginEmailValidoESenhaInvalida(){
        Usuarios usuario= new Usuarios();
        usuario.setEmail(EMAIL_USUARIO);
        usuario.setPassword("senhaErrada");

        given()
            .body(usuario).
        when()
            .post(LOGIN_ENDPOINT).
        then()
            .statusCode(401)
            .body("message",equalTo("Email e/ou senha inválidos"));
    }

    @Test
    public void testFazerLoginEmailInvalidoESenhaInvalida(){
        Usuarios usuario= new Usuarios();
        usuario.setEmail("emailErrado");
        usuario.setPassword("senhaErrada");

        given()
            .body(usuario).
        when()
            .post(LOGIN_ENDPOINT).
        then()
            .statusCode(400)
            .body("email",equalTo("email deve ser um email válido"));
    }




}
