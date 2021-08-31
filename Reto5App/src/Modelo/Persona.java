package Modelo;

import java.util.Date;


public class Persona {
    private String nombre, apellido;
    protected int identificacion;
    private String fechaNacimiento;
    
    public Persona(int identificacion){
        this.identificacion = identificacion;
    };
    
    public Persona(int identificacion, String nombre, String apellido, String fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(){
        this.nombre = "";
        this.apellido = "";
        this.identificacion = 0;
        this.fechaNacimiento = "";
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

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "\n" + "Nombre: " + nombre + "\nApellido=" + apellido + "\nIdentificacion=" + identificacion + "\nFecha de nacimiento=" + fechaNacimiento ;
    }
    
    
}
