
// Ejercicio numero 4 _ Java

import java.util.Scanner; 

public class ejercicio_4 {
    public static void main(String[] args) {
     
    Scanner scan = new Scanner(System.in);
    System.out.println("\nBienvenido al programa, desea ingresar s o S 'SI' ,para salir ingrese otra letra"); 
    char continuar = scan.next().charAt(0);  
    
    if (continuar == 's' || continuar == 'S') {
        while (continuar == 's' || continuar == 'S') {     
            System.out.println("\nIngrese el numero segun el dia: ");
            int dia = scan.nextInt();    
             switch (dia) {
                 case 1:
                     System.out.println("\nEl dia es Lunes");
                     break;
                 case 2:
                     System.out.println("\nEl dia es Martes");
                     break;
                 case 3:
                     System.out.println("\nEl dia es Miercoles");
                     break;
                 case 4:
                     System.out.println("\nEl dia es Jueves");
                     break;
                 case 5:
                     System.out.println("\nEl dia es Viernes");
                     break;
                 case 6:
                     System.out.println("\nEl dia es Sabado");
                     break;
                 case 7:
                     System.out.println("\nEl dia es Domingo");
                     break;
                }
     
            System.out.println("\nDesea continuar ? ingrese s o S 'SI' , Desea salir ? ingrese otra letra: ");
            continuar = scan.next().charAt(0); //leer caracteres desde scanner    
            } // while      
            System.out.println("\nHasta luego ! ha salido del programa"); 
    } else {
        System.out.println("\nHasta luego ! ha salido del programa");     
    }    // if   
    scan.close();
  }
} 





