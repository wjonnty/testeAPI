package org.serveresapi.teste;



import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;




import org.junit.jupiter.api.BeforeAll;


import java.util.Random;

import static io.restassured.RestAssured.*; 



public class BaseTest {
    public static final String CRIA_LISTA_USUARIOS_ENDPOINT="/usuarios";
    public static final String LOGIN_ENDPOINT="/login";
    public static final String EMAIL_USUARIO=emailAleatorio();
    public static final String SENHA_USUARIO="teste";
    public static String idUsuario;



    public static String emailAleatorio(){
        Random random=new Random();
        int email= random.nextInt(999);
        return Integer.toString(email)+"asd@email.com";
    }





    @BeforeAll
    public static void setup(){
        System.out.println("serup");
        enableLoggingOfRequestAndResponseIfValidationFails();
        baseURI="https://serverest.dev";

        requestSpecification= new RequestSpecBuilder().setContentType(ContentType.JSON).build();
        //filters(new RequestLoggingFilter(),new ResponseLoggingFilter());

       
    }

    
   
    
}
