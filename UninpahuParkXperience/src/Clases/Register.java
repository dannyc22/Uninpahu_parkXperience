/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author danny
 */
public class Register {
    private Usuario usuario;

    // Constructor que crea automáticamente un objeto de Usuario
    public Register(String nombres, String apellidos, String codigoEstudiante, String tipoIdentificacion, String numeroIdentificacion, String correoInstitucional, String correoPersonal, String modeloVehiculo, String placaVehiculo, String contrasena) {
        this.usuario = new Usuario(nombres, apellidos, codigoEstudiante, tipoIdentificacion, numeroIdentificacion, correoInstitucional, correoPersonal, modeloVehiculo, placaVehiculo, contrasena);
    }

    // Métodos específicos de Register, si los necesitas

    // Getter para acceder al objeto Usuario
    public Usuario getUsuario() {
        return usuario;
    }
}

