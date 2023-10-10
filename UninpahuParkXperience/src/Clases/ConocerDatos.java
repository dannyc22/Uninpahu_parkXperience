/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author danny
 */
public class ConocerDatos extends Usuario{
    // Getters y Setters de los atributos
    
    
    public ConocerDatos(String _nombres, String _apellidos, String _codigoEstudiante, String _tipoIdentificacion, String _numeroIdentificacion, String _correoInstitucional, String _correoPersonal, String _modeloVehiculo, String _placaVehiculo, String _contrasena) {
        super(_nombres, _apellidos, _codigoEstudiante, _tipoIdentificacion, _numeroIdentificacion, _correoInstitucional, _correoPersonal, _modeloVehiculo, _placaVehiculo, _contrasena);
    }

    public void mostrarAtributos() {
        System.out.println("Nombres: " + getNombres());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Código de Estudiante: " + getCodigoEstudiante());
        System.out.println("Tipo de Identificación: " + getTipoIdentificacion());
        System.out.println("Número de Identificación: " + getNumeroIdentificacion());
        System.out.println("Correo Institucional: " + getCorreoInstitucional());
        System.out.println("Correo Personal: " + getCorreoPersonal());
        System.out.println("Modelo de Vehículo: " + getModeloVehiculo());
        System.out.println("Placa de Vehículo: " + getPlacaVehiculo());
    }
}
