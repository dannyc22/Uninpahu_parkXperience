/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uninpahuparkxperience;

/**
 *
 * @author danny
 */
public class Login {
    private Register registro; 
    // Constructor del Login
    public Login(Register registro) {
        this.registro = registro;
    }

    // Método para verificar la autenticación
    public boolean autenticar(String correoInstitucional, String contrasena) {
        // metodo equals para comparar los datos
        return correoInstitucional.equals(registro.getCorreoInstitucional()) &&
               contrasena.equals(registro.getContrasena());
    }
}