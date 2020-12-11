
// Practica con Exceptions Checked 

package Package1;

import java.util.Map;
import java.util.Objects;
import java.util.HashMap;

public class PracticaExceptions2 {

     // armamos el Map con alumnos 
     static Map <Integer , String> alumnos = cargarMap(); 
       
     public static void main(String[] args) {
         
        String nombre;  

        try {
            // retorna null no existe  
            //nombre = alumnos.get(0123); 
            nombre = buscarLegajo(0123); 
            System.out.println("\nTamaño del nombre: "+ nombre.length());  
      
        }   catch (EntidadNoEncontradaException e){
              e.printStackTrace(); 
        }
        System.out.println("\nOperacion terminada"); 
} 
 
     // Metodo que retorna un hashmap 
     public static Map<Integer, String> cargarMap(){
        Map <Integer , String> nombres = new HashMap <>();
        nombres.put(1234 , "Juan"); 
        nombres.put(5678 , "Maria"); 
        nombres.put(9101, "Lisa"); 
        nombres.put(1213, "Homero"); 
        nombres.put(1415, "Pablo"); 
        return nombres;
     } 

     // Metodo que invoca una excepcion 
     public static String buscarLegajo(Integer legajo) throws EntidadNoEncontradaException {
       String nombre = alumnos.get(legajo);      
       if (Objects.isNull(nombre)){  // nombre != null 
            throw new EntidadNoEncontradaException("\nLegajo "+ legajo + " no encontrado");
       }
       return nombre; 
   } 

}


























































































































































