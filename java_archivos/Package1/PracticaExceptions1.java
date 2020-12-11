
// Practica con Exceptions Unchecked 
// Heredan de runtime exceptions , las runtime exception heredan de la clase Exception que es 
// la mas general.  

package Package1;



public class PracticaExceptions1 {

       
     public static void main(String[] args) {
         


        try {

        System.out.println("\nCargar un array de 3 elementos ");  
        
        // array de numeros 
        int[] dnis = new int[]{1234,5678,9101};
        imprimirCuartoElemento(dnis);

        }   catch (Exception ex){
              System.out.println("\nExcepcion ocurrida: "+ ex);  
        }




        // Arithmetic Exception por dividir por cero  
        // null pointer Exception por tratar de hacer una operacion con null 

        /* Integer horasTrabajadasEnMes = 0 ;
        Integer diasTrabajados = null ;
        System.out.println("\nEl promedio de horas trabajadas del Empleado es: " + 
        horasTrabajadasEnMes / diasTrabajados + " por dia ");   
        */

} 
 
    // procedimiento
    // array indexOutOfBoundsException  
    public static void imprimirCuartoElemento(int [] array){
       System.out.println("\nEste es el 4to elemento: "+ array[3]);  
    } 


}








