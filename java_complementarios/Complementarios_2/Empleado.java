package Complementarios_2;
//import java.util.*;

// Clase Empleado para el ejercicio 6 / Complementarios 2 
public class Empleado {

    
    // Atributos de empleado
    private int dni;
    private String nombre;
    private String apellido;
    private int HorasTrabajadas;
    private int ValorPorHora;
  
    //Constructor de empleado
    public Empleado(int dni, String nombre, String apellido, int HorasTrabajadas, int ValorPorHora) {
      this.dni = dni;
      this.nombre = nombre;
      this.apellido = apellido;
      this.HorasTrabajadas = HorasTrabajadas;
      this.ValorPorHora = ValorPorHora;
    }
    
    public int MostrarDni() {
          return dni;  
    }

    public String MostrarNombre() {
          return nombre;  
    }

    public String MostrarApellido() {
          return apellido;  
    }

    public int CalculoDeSalario() {
          return HorasTrabajadas * ValorPorHora;  
    }


}










