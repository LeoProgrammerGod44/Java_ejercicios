
// Practica con la interface List 

package Package1;

import java.util.Set;
import java.util.HashSet;

public class PracticaSet {

       // Procedimiento no tiene valor de retorno 
       // funcion retorna siempre un valor 

       public static void cargarSet(Set<String> nombres){
         nombres.add("Juan"); 
         nombres.add("Maria"); 
         nombres.add("Lisa"); 
         nombres.add("Homero"); 
         nombres.add("Pablo"); 
     } 
     public static void main(String[] args) {
         
         // armamos el Set   
         Set<String> nombres = new HashSet<>();

         // cargamos la lista con el procedimiento 
         cargarSet(nombres);

         // mostramos el tamaño de la lista 
         System.out.println("\nTamaño del set luego de cargarlo: " + nombres.size());  
         System.out.println("\nMuestro el set: " + nombres);
         // iterar y mostrar 
         for (String nombre : nombres){
           System.out.println(nombre);
         }
         
         // Preguntar si existe un nombre dado en la lista 
         System.out.println("\nExiste \"Maria\" en la lista ? " + nombres.contains("Maria"));

         // borrar un elemento de la lista 
         nombres.remove("Juan");  
         System.out.println("\nTamaño de la lista luego de borrar un elemento: " + nombres.size()); 
         System.out.println("\nMuestro el set: " + nombres);
       }

} 







