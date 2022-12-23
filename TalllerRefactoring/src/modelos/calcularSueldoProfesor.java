package modelos;

public class calcularSueldoProfesor {
    
    public double calcularSueldo(Profesor prof){ 
        return prof.añosdeTrabajo*600 + prof.BonoFijo;
    }  
}
