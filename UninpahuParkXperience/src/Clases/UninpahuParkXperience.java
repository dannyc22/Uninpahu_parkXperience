/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author danny
 */
public class UninpahuParkXperience {
    
    private final List<Usuario> usuarios = new ArrayList<>(); // Declarar la lista de usuarios como variable de instancia

    public UninpahuParkXperience() {
        //Usuario[] usuarios = new Usuario[1]; no permite utilizarse fuera del scope
        Usuario usuario1 = new Usuario("Daniel Santiago", "Chacon Olaya", "20032243", "CC", "1000149621", 
                                       "dchaconol@uninpahu.edu.co", "dannyo.0200322@gmail.com", "Poseidon", 
                                       "Todo Copas", "clave12345");
        usuarios.add(usuario1);
    }

    public boolean validarUsuario(String usuario, String contraseña) {
        for (Usuario u : usuarios) {
            if (usuario.equals(u.getCorreoInstitucional()) && contraseña.equals(u.getContrasena())) {
                return true;
            }
        }
        return false;
    }
}