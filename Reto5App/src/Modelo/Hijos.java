package Modelo;
import java.sql.*;
import Modelo.Persona;

public class Hijos extends Persona{
    private int identificacion;
    private String nombre;
    private Date fechaNacimiento;
    private String genero;
    
    public Hijos(int identificacion, String nombre, Date fechaNacimiento, String genero, int idPadre){
        super(idPadre);
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

   

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
}
