/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uninpahuparkxperience;

/**
 *
 * @author danny
 */
public class Register {
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
    public Register(String nombres, String apellidos, String codigoEstudiante, String tipoIdentificacion,
                    String numeroIdentificacion, String correoInstitucional, String correoPersonal,
                    String modeloVehiculo, String placaVehiculo, String contrasena) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigoEstudiante = codigoEstudiante;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.correoInstitucional = correoInstitucional;
        this.correoPersonal = correoPersonal;
        this.modeloVehiculo = modeloVehiculo;
        this.placaVehiculo = placaVehiculo;
        this.contrasena = contrasena;
    }

    // Getters y Setters de los atributos
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

