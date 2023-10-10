/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author danny
 */
public class Usuario{

    private String nombres;
    private String apellidos;
    private String codigoEstudiante;
    private String tipoIdentificacion;
    private String numeroIdentificacion;
    private String correoInstitucional;
    private String correoPersonal;
    private String modeloVehiculo;
    private String placaVehiculo;
    private String contrasena;

    // Método constructor
    public Usuario(String _nombres, String _apellidos, String _codigoEstudiante, String _tipoIdentificacion,
                    String _numeroIdentificacion, String _correoInstitucional, String _correoPersonal,
                    String _modeloVehiculo, String _placaVehiculo, String _contrasena) {
        this.nombres = _nombres;
        this.apellidos = _apellidos;
        this.codigoEstudiante = _codigoEstudiante;
        this.tipoIdentificacion = _tipoIdentificacion;
        this.numeroIdentificacion = _numeroIdentificacion;
        this.correoInstitucional = _correoInstitucional;
        this.correoPersonal = _correoPersonal;
        this.modeloVehiculo = _modeloVehiculo;
        this.placaVehiculo = _placaVehiculo;
        this.contrasena = _contrasena;
    }
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }

    public void setCorreoPersonal(String correoPersonal) {
        this.correoPersonal = correoPersonal;
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
