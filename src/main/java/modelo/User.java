/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LAB-USR-CHIMBOTE
 */
public class User {
    private int id;
    private String usuario;
    private String contrasena;
            
    
    public User(int id, String usuario, String contrasena){
        this.id=id;
        this.usuario=usuario;
        this.contrasena=contrasena;
        
    }
    
    public  User(){
        
    }
    public int getId(){
        return id;
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
