package modelos;

import java.util.ArrayList;

public class Profesor implements CalcularSueldo{
    public String codigo;
    public String nombre;
    public String apellido;
    public int edad;
    public String direccion;
    public String telefono;
    public int añosdeTrabajo;
    public String facultad;
    public double BonoFijo;
    public ArrayList<Paralelo> paralelos;

    public Profesor(String codigo, String nombre, String apellido, String facultad, int edad, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        paralelos= new ArrayList<>();
    }
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }

    @Override
    public double CalcularSueldo() {
        return añosdeTrabajo*600 + BonoFijo;
    }
    
    
}
