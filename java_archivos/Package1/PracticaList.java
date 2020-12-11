
// Practica con la interface List 

package Package1;

import java.util.ArrayList;
import java.util.List;

public class PracticaList {

       // Procedimiento no tiene valor de retorno 
       // funcion retorna siempre un valor 

       public static void cargarLista(List<String> nombres){
         nombres.add("Juan"); 
         nombres.add("Maria"); 
         nombres.add("Lisa"); 
         nombres.add("Homero"); 
         nombres.add("Pablo"); 
     } 
     public static void main(String[] args) {
         
         // armamos el arraylist   
         List <String> nombres = new ArrayList<>();

         // cargamos la lista con el procedimiento 
         cargarLista(nombres);

         // mostramos el tamaño de la lista 
         System.out.println("\nTamaño de la lista luego de cargarla: " + nombres.size());  
         System.out.println("\nMuestro la lista: " + nombres);  
         
         // iterar y mostrar 
         for (String nombre : nombres){
           System.out.println(nombre);
         }
         
         // Preguntar si existe un nombre dado en la lista 
         System.out.println("\nExiste \"Maria\" en la lista ? " + nombres.contains("Maria"));

         // borrar un elemento de la lista 
         nombres.remove("Juan");  
         System.out.println("\nTamaño de la lista luego de borrar un elemento: " + nombres.size()); 
       }

} 





