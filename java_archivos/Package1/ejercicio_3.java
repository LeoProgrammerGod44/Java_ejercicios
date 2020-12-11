// Ejercicio numero 3 _ Java

package Package1;

import java.util.Scanner; 

public class ejercicio_3 {
    public static void main(String[] args) {
     
    Scanner scan = new Scanner(System.in);
    System.out.println("\nBienvenido al programa: ");   
    char continuar;    
    
    do {
    System.out.println("\nIngrese la nota obtenida: ");
    int nota = scan.nextInt();    
        
    if (nota > 92){
        System.out.println("\nExcelente"); 
    } else if (nota > 84){
        System.out.println("\nSobresaliente");
    } else if (nota > 74){
        System.out.println("\nDistinguido");
    } else if (nota > 59){
        System.out.println("\nBueno");
    } else {
        System.out.println("\nDesaprobado");
    } 
    System.out.println("\nDesea continuar ? ingrese c o C , Desea salir ? ingrese otra letra: ");
    continuar = scan.next().charAt(0); //leer caracteres desde scanner 

    } while (continuar == 'c' || continuar == 'C');

    System.out.println("\nHasta luego ! ha salido del programa");
    scan.close();
  }
}















