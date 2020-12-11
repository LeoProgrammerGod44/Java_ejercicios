
// Practica con la interface Map 

package Package1;

import java.util.HashMap;
import java.util.Map;


public class PracticaMap {

       // Procedimiento no tiene valor de retorno 
       // funcion retorna siempre un valor 

       public static void cargarMap(Map<Integer, String> nombres){
         nombres.put(1234 , "Juan"); 
         nombres.put(5678 , "Maria"); 
         nombres.put(9101, "Lisa"); 
         nombres.put(1213, "Homero"); 
         nombres.put(1415, "Pablo"); 
     } 
     public static void main(String[] args) {
         
         // armamos el Set   
         Map <Integer , String> alumnos = new HashMap <>();

         // cargamos la lista con el procedimiento 
         cargarMap(alumnos);

         // mostramos el tamaño de la lista 
         System.out.println("\nTamaño del Map luego de cargarlo: " + alumnos.size());  
         System.out.println("\nMuestro el Map: " + alumnos);

         // iterar y mostrar clave / valor 
         for (Map.Entry<Integer, String> registro : alumnos.entrySet()) {
           System.out.println("Id: "+ registro.getKey() + " Nombre: "+ registro.getValue());
         }

         // iterar y mostrar solo claves 
         for ( Integer clave : alumnos.keySet()) {
           System.out.println("Id: "+ clave);
         }

         // iterar y mostrar solo valores 
         for ( String  valor : alumnos.values()) {
           System.out.println("Nombre: "+ valor);
         }
         
         // Preguntar si map contiene una clave o un valor dado 
         System.out.println("Existe la clave 1234 en el map ? "+ alumnos.containsKey(1234));
         System.out.println("Existe el valor 1234 en el map ? "+ alumnos.containsValue("1234"));
          


         // borrar un elemento del Map 
         alumnos.remove(1234);  
         System.out.println("\nTamaño del Map luego de borrar un elemento: " + alumnos.size()); 
         System.out.println("\nMuestro el Map: " + alumnos);
       }

} 








