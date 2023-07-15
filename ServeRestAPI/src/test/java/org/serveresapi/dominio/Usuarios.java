package org.serveresapi.dominio;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Usuarios{
    private String nome;
    private String email;
    private String password;
    private String administrador;
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAdministrador() {
        return administrador;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }
    public Usuarios(){}
    public Usuarios(String nome, String email, String password, String administrador){
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.administrador = administrador;
    }



}