package Modelo;

import java.sql.Date;

public class Jugador {
    private int idJugador;
    private String nombre;
    private String apellido;
    private Short dorsal;
    private int edad;
    private String posicion;
    private String nacionalidad;
    private Date fechaNacimiento;
    private Date fechaIngreso;

    public Jugador(int idJugador, String nombre, String apellido, int edad, String posicion, String nacionalidad,
                   Date fechaNacimiento, Date fechaIngreso, Short dorsal) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.posicion = posicion;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.dorsal = dorsal;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Short getDorsal() {
        return dorsal;
    }

    public void setDorsal(Short dorsal) {
        this.dorsal = dorsal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
