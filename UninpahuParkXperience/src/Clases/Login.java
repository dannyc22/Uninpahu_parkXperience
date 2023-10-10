/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author danny
 */
public class Login{
    private Usuario usuario; 
    // Constructor del Login
    public Login(Usuario usuario) {
        this.usuario = usuario;
    }

    // Método para verificar la autenticación
    public boolean autenticar(String correoInstitucional, String contrasena) {
        // metodo equals para comparar los datos
        return correoInstitucional.equals(usuario.getCorreoInstitucional()) &&
               contrasena.equals(usuario.getContrasena());
    }
}