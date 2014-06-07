/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.anariquelme.bean;

/**
 *
 * @author ana
 */
public class UsuarioBean {
    
    private int id;
    private String nombre;
    private String email;
    private String login;
    private String password;
    
    public UsuarioBean(){
    }
    
    public UsuarioBean(Integer id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
            


}
